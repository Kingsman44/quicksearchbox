package androidx.camera.core;

import android.util.SparseArray;
import androidx.camera.core.p069a.C1329bp;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.camera.core.df */
/* compiled from: PG */
final class C1529df implements C1329bp {

    /* renamed from: a */
    final Object f4219a = new Object();

    /* renamed from: b */
    final SparseArray f4220b = new SparseArray();

    /* renamed from: c */
    private final SparseArray f4221c = new SparseArray();

    /* renamed from: d */
    private final List f4222d = new ArrayList();

    /* renamed from: e */
    private final List f4223e;

    /* renamed from: f */
    private final String f4224f;

    /* renamed from: g */
    private boolean f4225g = false;

    public C1529df(List list, String str) {
        this.f4223e = list;
        this.f4224f = str;
        m4083f();
    }

    /* renamed from: f */
    private final void m4083f() {
        synchronized (this.f4219a) {
            for (Integer intValue : this.f4223e) {
                int intValue2 = intValue.intValue();
                this.f4221c.put(intValue2, C2169h.m6027a(new C1528de(this, intValue2)));
            }
        }
    }

    /* renamed from: a */
    public final C60870cx mo4196a(int i) {
        C60870cx cxVar;
        synchronized (this.f4219a) {
            if (!this.f4225g) {
                cxVar = (C60870cx) this.f4221c.get(i);
                if (cxVar == null) {
                    throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + i);
                }
            } else {
                throw new IllegalStateException("ImageProxyBundle already closed.");
            }
        }
        return cxVar;
    }

    /* renamed from: b */
    public final List mo4197b() {
        return Collections.unmodifiableList(this.f4223e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo4394c(C1473bs bsVar) {
        synchronized (this.f4219a) {
            if (!this.f4225g) {
                Integer num = (Integer) bsVar.mo4305e().mo4333d().mo4257d(this.f4224f);
                if (num != null) {
                    C2164c cVar = (C2164c) this.f4220b.get(num.intValue());
                    if (cVar != null) {
                        this.f4222d.add(bsVar);
                        cVar.mo5437b(bsVar);
                        return;
                    }
                    throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + num);
                }
                throw new IllegalArgumentException("CaptureId is null.");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo4395d() {
        synchronized (this.f4219a) {
            if (!this.f4225g) {
                for (C1473bs close : this.f4222d) {
                    close.close();
                }
                this.f4222d.clear();
                this.f4221c.clear();
                this.f4220b.clear();
                this.f4225g = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo4396e() {
        synchronized (this.f4219a) {
            if (!this.f4225g) {
                for (C1473bs close : this.f4222d) {
                    close.close();
                }
                this.f4222d.clear();
                this.f4221c.clear();
                this.f4220b.clear();
                m4083f();
            }
        }
    }
}
