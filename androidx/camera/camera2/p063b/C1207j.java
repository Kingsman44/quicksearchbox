package androidx.camera.camera2.p063b;

import androidx.camera.camera2.p063b.p064a.p067c.C1051i;
import androidx.camera.core.p069a.p070a.p072b.C1252a;
import androidx.camera.core.p069a.p070a.p072b.C1257f;
import androidx.camera.core.p069a.p070a.p072b.C1263l;
import androidx.camera.core.p069a.p070a.p072b.C1266o;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import p3186j$.util.Objects;

/* renamed from: androidx.camera.camera2.b.j */
/* compiled from: PG */
public final /* synthetic */ class C1207j implements C1252a {

    /* renamed from: a */
    public final /* synthetic */ C1217t f3543a;

    /* renamed from: b */
    public final /* synthetic */ List f3544b;

    /* renamed from: c */
    public final /* synthetic */ int f3545c;

    /* renamed from: d */
    public final /* synthetic */ int f3546d;

    /* renamed from: e */
    public final /* synthetic */ int f3547e;

    public /* synthetic */ C1207j(C1217t tVar, List list, int i, int i2, int i3) {
        this.f3543a = tVar;
        this.f3544b = list;
        this.f3545c = i;
        this.f3546d = i2;
        this.f3547e = i3;
    }

    /* renamed from: a */
    public final C60870cx mo3782a(Object obj) {
        C60870cx cxVar;
        C1217t tVar = this.f3543a;
        List list = this.f3544b;
        int i = this.f3545c;
        int i2 = this.f3546d;
        int i3 = this.f3547e;
        Void voidR = (Void) obj;
        C1122br brVar = tVar.f3568g;
        C1051i iVar = new C1051i(brVar.f3334c);
        C1112bh bhVar = new C1112bh(brVar.f3337f, brVar.f3335d, brVar.f3332a, brVar.f3336e, iVar);
        if (i == 0) {
            bhVar.mo3871a(new C1101ax(brVar.f3332a));
        }
        if (brVar.f3333b.f3189a || brVar.f3337f == 3 || i3 == 1) {
            bhVar.mo3871a(new C1121bq(brVar.f3332a, i2, brVar.f3335d));
        } else {
            bhVar.mo3871a(new C1100aw(brVar.f3332a, i2, iVar));
        }
        C60870cx cxVar2 = C1266o.f3667a;
        if (!bhVar.f3311h.isEmpty()) {
            if (bhVar.f3312i.mo3862c()) {
                cxVar = C1122br.m3143a(0, bhVar.f3307d, (C1115bk) null);
            } else {
                cxVar = C1266o.f3667a;
            }
            cxVar2 = C1263l.m3434f(C1263l.m3434f(C1257f.m3422a(cxVar), new C1105ba(bhVar, i2), bhVar.f3306c), new C1106bb(bhVar), bhVar.f3306c);
        }
        C60870cx f = C1263l.m3434f(C1257f.m3422a(cxVar2), new C1107bc(bhVar, list, i2), bhVar.f3306c);
        C1113bi biVar = bhVar.f3312i;
        Objects.requireNonNull(biVar);
        f.mo4106b(new C1108bd(biVar), bhVar.f3306c);
        return C1263l.m3431c(f);
    }
}
