package androidx.appsearch.builtintypes;

import androidx.appsearch.p047a.C0842g;
import androidx.appsearch.p047a.C0851p;
import androidx.appsearch.p047a.C0853r;
import androidx.appsearch.p047a.C0855t;
import androidx.appsearch.p047a.C0857v;
import androidx.appsearch.p047a.C0858w;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.appsearch.builtintypes.$$__AppSearch__Thing  reason: invalid class name */
/* compiled from: PG */
public class C$$__AppSearch__Thing implements C0855t {
    public static final String SCHEMA_NAME = "builtin:Thing";

    public Thing fromGenericDocument(C0858w wVar) {
        C0858w wVar2 = wVar;
        String str = wVar2.f2847b;
        String h = wVar.mo3447h();
        long j = wVar2.f2849d;
        long c = wVar.mo3442c();
        int a = wVar.mo3440a();
        String[] n = wVar2.mo3454n("name");
        String str2 = (n == null || n.length == 0) ? null : n[0];
        String[] n2 = wVar2.mo3454n("alternateNames");
        List asList = n2 != null ? Arrays.asList(n2) : null;
        String[] n3 = wVar2.mo3454n("description");
        String str3 = (n3 == null || n3.length == 0) ? null : n3[0];
        String[] n4 = wVar2.mo3454n("image");
        String str4 = (n4 == null || n4.length == 0) ? null : n4[0];
        String[] n5 = wVar2.mo3454n("url");
        return new Thing(h, str, a, j, c, str2, asList, str3, str4, (n5 == null || n5.length == 0) ? null : n5[0]);
    }

    public C0853r getSchema() {
        C0842g gVar = new C0842g(SCHEMA_NAME);
        C0851p pVar = new C0851p("name");
        pVar.mo3412b(2);
        pVar.mo3414d(1);
        pVar.mo3413c(2);
        gVar.mo3395b(pVar.mo3411a());
        C0851p pVar2 = new C0851p("alternateNames");
        pVar2.mo3412b(1);
        pVar2.mo3414d(1);
        pVar2.mo3413c(2);
        gVar.mo3395b(pVar2.mo3411a());
        C0851p pVar3 = new C0851p("description");
        pVar3.mo3412b(2);
        pVar3.mo3414d(0);
        pVar3.mo3413c(0);
        gVar.mo3395b(pVar3.mo3411a());
        C0851p pVar4 = new C0851p("image");
        pVar4.mo3412b(2);
        pVar4.mo3414d(0);
        pVar4.mo3413c(0);
        gVar.mo3395b(pVar4.mo3411a());
        C0851p pVar5 = new C0851p("url");
        pVar5.mo3412b(2);
        pVar5.mo3414d(0);
        pVar5.mo3413c(0);
        gVar.mo3395b(pVar5.mo3411a());
        return gVar.mo3394a();
    }

    public String getSchemaName() {
        return SCHEMA_NAME;
    }

    public C0858w toGenericDocument(Thing thing) {
        C0857v vVar = new C0857v(thing.f2898a, thing.f2899b, SCHEMA_NAME);
        vVar.mo3434e(thing.f2901d);
        vVar.mo3431b(thing.f2902e);
        vVar.mo3430a(thing.f2900c);
        String str = thing.f2903f;
        if (str != null) {
            vVar.mo3439j("name", str);
        }
        List list = thing.f2904g;
        if (list != null) {
            vVar.mo3439j("alternateNames", (String[]) list.toArray(new String[0]));
        }
        String str2 = thing.f2905h;
        if (str2 != null) {
            vVar.mo3439j("description", str2);
        }
        String str3 = thing.f2906i;
        if (str3 != null) {
            vVar.mo3439j("image", str3);
        }
        String str4 = thing.f2907j;
        if (str4 != null) {
            vVar.mo3439j("url", str4);
        }
        return vVar.mo3432c();
    }
}
