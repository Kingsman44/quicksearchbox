package androidx.camera.core;

import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.p069a.C1303aq;
import androidx.camera.core.p069a.C1314ba;
import androidx.camera.core.p069a.C1330bq;
import androidx.camera.core.p069a.C1384k;
import androidx.camera.core.p069a.p070a.p071a.C1238a;
import androidx.camera.core.p069a.p070a.p071a.C1244g;
import androidx.camera.core.p069a.p070a.p072b.C1257f;
import androidx.camera.core.p069a.p070a.p072b.C1263l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: androidx.camera.core.cz */
/* compiled from: PG */
final class C1522cz extends C1314ba {

    /* renamed from: a */
    final Object f4191a = new Object();

    /* renamed from: b */
    boolean f4192b;

    /* renamed from: c */
    public final C1497ca f4193c;

    /* renamed from: d */
    public final Surface f4194d;

    /* renamed from: e */
    final C1303aq f4195e;

    /* renamed from: f */
    public final C1384k f4196f;

    /* renamed from: g */
    public final C1314ba f4197g;

    /* renamed from: h */
    public final String f4198h;

    /* renamed from: t */
    private final C1330bq f4199t;

    /* renamed from: u */
    private final Size f4200u;

    /* renamed from: v */
    private final Handler f4201v;

    public C1522cz(int i, int i2, int i3, Handler handler, C1303aq aqVar, C1314ba baVar, String str) {
        super(new Size(i, i2), i3);
        C1519cw cwVar = new C1519cw(this);
        this.f4199t = cwVar;
        this.f4192b = false;
        Size size = new Size(i, i2);
        this.f4200u = size;
        this.f4201v = handler;
        C1244g gVar = new C1244g(handler);
        C1497ca caVar = new C1497ca(C1497ca.m4002l(i, i2, i3, 2));
        this.f4193c = caVar;
        caVar.mo4207j(cwVar, gVar);
        this.f4194d = caVar.mo4202e();
        this.f4196f = caVar.f4116b;
        this.f4195e = aqVar;
        aqVar.mo4166f(size);
        this.f4197g = baVar;
        this.f4198h = str;
        C1263l.m3436h(baVar.mo4176b(), new C1521cy(this), C1238a.m3410a());
        C1263l.m3431c(this.f3777p).mo4106b(new C1520cx(this), C1238a.m3410a());
    }

    /* renamed from: a */
    public final C60870cx mo4175a() {
        return C1263l.m3433e(C1257f.m3422a(this.f4197g.mo4176b()), new C1518cv(this), C1238a.m3410a());
    }
}
