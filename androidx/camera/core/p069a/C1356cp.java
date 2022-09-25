package androidx.camera.core.p069a;

import android.hardware.camera2.params.InputConfiguration;
import androidx.camera.core.C1477bw;
import androidx.camera.core.p073b.p074a.p076b.C1432a;
import androidx.camera.core.p073b.p074a.p076b.C1433b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.camera.core.a.cp */
/* compiled from: PG */
public final class C1356cp extends C1350cj {

    /* renamed from: h */
    private static final List f3838h = Arrays.asList(new Integer[]{1, 5, 3});

    /* renamed from: i */
    private final C1433b f3839i = new C1433b();

    /* renamed from: j */
    private boolean f3840j = true;

    /* renamed from: k */
    private boolean f3841k = false;

    /* renamed from: a */
    public final C1357cq mo4239a() {
        if (this.f3840j) {
            ArrayList arrayList = new ArrayList(this.f3831a);
            if (this.f3839i.f3990a) {
                Collections.sort(arrayList, new C1432a());
            }
            return new C1357cq(arrayList, this.f3833c, this.f3834d, this.f3836f, this.f3835e, this.f3832b.mo4157a(), this.f3837g);
        }
        throw new IllegalArgumentException("Unsupported session configuration combination");
    }

    /* renamed from: b */
    public final void mo4240b(C1357cq cqVar) {
        C1302ap apVar = cqVar.f3847f;
        int i = apVar.f3751e;
        if (i != -1) {
            this.f3841k = true;
            C1300an anVar = this.f3832b;
            int i2 = anVar.f3742c;
            List list = f3838h;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
            anVar.f3742c = i;
        }
        C1364cx cxVar = cqVar.f3847f.f3754h;
        C1341ca caVar = this.f3832b.f3744e;
        caVar.f3853b.putAll(cxVar.f3853b);
        this.f3833c.addAll(cqVar.f3843b);
        this.f3834d.addAll(cqVar.f3844c);
        this.f3832b.mo4158b(cqVar.f3847f.f3752f);
        this.f3836f.addAll(cqVar.f3845d);
        this.f3835e.addAll(cqVar.f3846e);
        InputConfiguration inputConfiguration = cqVar.f3848g;
        if (inputConfiguration != null) {
            this.f3837g = inputConfiguration;
        }
        this.f3831a.addAll(cqVar.f3842a);
        this.f3832b.f3740a.addAll(Collections.unmodifiableList(apVar.f3749c));
        ArrayList arrayList = new ArrayList();
        for (C1355co coVar : this.f3831a) {
            arrayList.add(coVar.mo4236b());
            for (C1314ba add : coVar.mo4238d()) {
                arrayList.add(add);
            }
        }
        if (!arrayList.containsAll(this.f3832b.f3740a)) {
            C1477bw.m3978a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
            this.f3840j = false;
        }
        this.f3832b.mo4161e(apVar.f3750d);
    }

    /* renamed from: c */
    public final boolean mo4241c() {
        return this.f3841k && this.f3840j;
    }
}
