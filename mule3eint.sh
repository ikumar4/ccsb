for i in {1..10}
do
{
echo 'Test='$i
mvn clean test -Denv.CBURL=https://kt-login.cengage.com/cb/login.htm -Denv.OLRURL=http://kt-olradmin.cengage.com/olr/admin/login.jspi
}
done;
