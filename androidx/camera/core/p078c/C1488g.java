package androidx.camera.core.p078c;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.C1547dx;
import androidx.camera.core.C1561k;
import androidx.camera.core.p069a.C1311ay;
import androidx.camera.core.p069a.C1314ba;
import androidx.camera.core.p069a.p070a.C1285p;
import androidx.camera.core.p069a.p070a.p071a.C1238a;
import androidx.camera.core.p069a.p070a.p071a.C1247j;
import androidx.camera.core.p069a.p070a.p072b.C1263l;
import androidx.core.p097i.C1974i;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: androidx.camera.core.c.g */
/* compiled from: PG */
public final class C1488g extends C1314ba {

    /* renamed from: t */
    public static final /* synthetic */ int f4086t = 0;

    /* renamed from: a */
    C2164c f4087a;

    /* renamed from: b */
    public final Matrix f4088b;

    /* renamed from: c */
    public final Rect f4089c;

    /* renamed from: d */
    public final boolean f4090d;

    /* renamed from: e */
    public final int f4091e;

    /* renamed from: f */
    public int f4092f;

    /* renamed from: g */
    public C1496o f4093g;

    /* renamed from: h */
    public boolean f4094h = false;

    /* renamed from: u */
    private final C60870cx f4095u;

    /* renamed from: v */
    private boolean f4096v = false;

    /* renamed from: w */
    private C1547dx f4097w;

    public C1488g(int i, Size size, int i2, Matrix matrix, Rect rect, int i3) {
        super(size, i2);
        this.f4091e = i;
        this.f4088b = matrix;
        this.f4089c = rect;
        this.f4092f = i3;
        this.f4090d = false;
        this.f4095u = C2169h.m6027a(new C1483b(this, size));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C60870cx mo4175a() {
        return this.f4095u;
    }

    /* renamed from: c */
    public final void mo4177c() {
        super.mo4177c();
        C1247j.m3414a().execute(new C1485d(this));
    }

    /* renamed from: g */
    public final void mo4369g() {
        C1547dx dxVar = this.f4097w;
        if (dxVar != null) {
            dxVar.mo4410b(new C1561k(this.f4089c, this.f4092f, -1));
        }
    }

    /* renamed from: h */
    public final C1547dx mo4370h() {
        C1285p.m3462a();
        C1547dx dxVar = new C1547dx(this.f3778q);
        try {
            C1314ba baVar = dxVar.f4254e;
            C1285p.m3462a();
            C60870cx b = baVar.mo4176b();
            C1285p.m3462a();
            C1974i.m5315c(!this.f4096v, "Provider can only be linked once.");
            this.f4096v = true;
            C1263l.m3437i(b, this.f4087a);
            baVar.mo4179e();
            C1263l.m3431c(this.f3777p).mo4106b(new C1486e(baVar), C1238a.m3410a());
            this.f4097w = dxVar;
            mo4369g();
            return dxVar;
        } catch (C1311ay e) {
            throw g$$ExternalSyntheticBackport0.m3995m("Surface is somehow already closed", e);
        }
    }
}
