package p5488io.grpc.p5527g;

import com.google.common.base.C58838bb;
import java.util.ArrayList;
import java.util.List;
import p5488io.grpc.C70251bv;
import p5488io.grpc.C70334de;
import p5488io.grpc.p5525e.C70460dv;
import p5488io.grpc.p5525e.C70676lv;
import p5488io.grpc.p5527g.p5528a.p5529a.C70775d;
import p5589m.C71831h;
import p5589m.C71832i;

/* renamed from: io.grpc.g.j */
/* compiled from: PG */
final class C70829j {

    /* renamed from: a */
    public static final C70775d f188899a;

    /* renamed from: b */
    public static final C70775d f188900b = new C70775d(C70775d.f188722d, C71831h.m105170a("http"));

    /* renamed from: c */
    public static final C70775d f188901c = new C70775d(C70775d.f188720b, C71831h.m105170a("POST"));

    /* renamed from: d */
    public static final C70775d f188902d = new C70775d(C70775d.f188720b, C71831h.m105170a("GET"));

    /* renamed from: e */
    public static final C70775d f188903e = new C70775d(C70460dv.f187789h.f187370a, "application/grpc");

    /* renamed from: f */
    public static final C70775d f188904f = new C70775d("te", "trailers");

    static {
        C71832i iVar = C70775d.f188722d;
        C71832i iVar2 = C71832i.f191357a;
        f188899a = new C70775d(iVar, C71831h.m105170a("https"));
    }

    /* renamed from: a */
    public static List m103640a(C70334de deVar, String str, String str2, String str3, boolean z, boolean z2) {
        C58838bb.m90866a(deVar, "headers");
        C58838bb.m90866a(str2, "authority");
        deVar.mo62031f(C70460dv.f187789h);
        deVar.mo62031f(C70460dv.f187790i);
        deVar.mo62031f(C70460dv.f187791j);
        ArrayList arrayList = new ArrayList(C70251bv.m102398a(deVar) + 7);
        if (z2) {
            arrayList.add(f188900b);
        } else {
            arrayList.add(f188899a);
        }
        arrayList.add(f188901c);
        C71832i iVar = C70775d.f188723e;
        C71832i iVar2 = C71832i.f191357a;
        arrayList.add(new C70775d(iVar, C71831h.m105170a(str2)));
        arrayList.add(new C70775d(C70775d.f188721c, C71831h.m105170a(str)));
        arrayList.add(new C70775d(C70460dv.f187791j.f187370a, str3));
        arrayList.add(f188903e);
        arrayList.add(f188904f);
        byte[][] a = C70676lv.m103338a(deVar);
        for (int i = 0; i < a.length; i += 2) {
            C71832i b = C71831h.m105171b(a[i]);
            byte[] bArr = b.f191358b;
            if (!(bArr.length == 0 || bArr[0] == 58)) {
                arrayList.add(new C70775d(b, C71831h.m105171b(a[i + 1])));
            }
        }
        return arrayList;
    }
}
