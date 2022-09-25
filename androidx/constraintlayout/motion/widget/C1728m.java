package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.C1761t;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.motion.widget.m */
/* compiled from: PG */
public final class C1728m extends C1718c {

    /* renamed from: f */
    public String f5072f;

    /* renamed from: g */
    public int f5073g = -1;

    /* renamed from: h */
    public float f5074h = Float.NaN;

    /* renamed from: i */
    public float f5075i = Float.NaN;

    /* renamed from: j */
    public float f5076j = Float.NaN;

    /* renamed from: k */
    public float f5077k = Float.NaN;

    /* renamed from: l */
    public float f5078l = Float.NaN;

    /* renamed from: m */
    public float f5079m = Float.NaN;

    /* renamed from: n */
    public float f5080n = Float.NaN;

    /* renamed from: o */
    public float f5081o = Float.NaN;

    /* renamed from: p */
    public float f5082p = Float.NaN;

    /* renamed from: q */
    public float f5083q = Float.NaN;

    /* renamed from: r */
    public float f5084r = Float.NaN;

    /* renamed from: s */
    public float f5085s = Float.NaN;

    /* renamed from: t */
    public int f5086t = 0;

    /* renamed from: u */
    public float f5087u = Float.NaN;

    /* renamed from: v */
    public float f5088v = 0.0f;

    public C1728m() {
        this.f5016d = 3;
        this.f5017e = new HashMap();
    }

    /* renamed from: a */
    public final C1718c clone() {
        C1728m mVar = new C1728m();
        super.mo4797f(this);
        mVar.f5072f = this.f5072f;
        mVar.f5073g = this.f5073g;
        mVar.f5086t = this.f5086t;
        mVar.f5087u = this.f5087u;
        mVar.f5088v = this.f5088v;
        mVar.f5085s = this.f5085s;
        mVar.f5074h = this.f5074h;
        mVar.f5075i = this.f5075i;
        mVar.f5076j = this.f5076j;
        mVar.f5079m = this.f5079m;
        mVar.f5077k = this.f5077k;
        mVar.f5078l = this.f5078l;
        mVar.f5080n = this.f5080n;
        mVar.f5081o = this.f5081o;
        mVar.f5082p = this.f5082p;
        mVar.f5083q = this.f5083q;
        mVar.f5084r = this.f5084r;
        return mVar;
    }

    /* renamed from: b */
    public final void mo4792b(HashMap hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    /* renamed from: c */
    public final void mo4793c(HashSet hashSet) {
        if (!Float.isNaN(this.f5074h)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f5075i)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f5076j)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f5077k)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f5078l)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f5082p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f5083q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f5084r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f5079m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f5080n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f5081o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f5085s)) {
            hashSet.add("progress");
        }
        if (this.f5017e.size() > 0) {
            for (String valueOf : this.f5017e.keySet()) {
                String valueOf2 = String.valueOf(valueOf);
                hashSet.add(valueOf2.length() != 0 ? "CUSTOM,".concat(valueOf2) : new String("CUSTOM,"));
            }
        }
    }

    /* renamed from: d */
    public final void mo4795d(Context context, AttributeSet attributeSet) {
        C1727l.m4686a(this, context.obtainStyledAttributes(attributeSet, C1761t.f5466h));
    }

    /* renamed from: e */
    public final void mo4796e(HashMap hashMap) {
        if (this.f5073g != -1) {
            if (!Float.isNaN(this.f5074h)) {
                hashMap.put("alpha", Integer.valueOf(this.f5073g));
            }
            if (!Float.isNaN(this.f5075i)) {
                hashMap.put("elevation", Integer.valueOf(this.f5073g));
            }
            if (!Float.isNaN(this.f5076j)) {
                hashMap.put("rotation", Integer.valueOf(this.f5073g));
            }
            if (!Float.isNaN(this.f5077k)) {
                hashMap.put("rotationX", Integer.valueOf(this.f5073g));
            }
            if (!Float.isNaN(this.f5078l)) {
                hashMap.put("rotationY", Integer.valueOf(this.f5073g));
            }
            if (!Float.isNaN(this.f5082p)) {
                hashMap.put("translationX", Integer.valueOf(this.f5073g));
            }
            if (!Float.isNaN(this.f5083q)) {
                hashMap.put("translationY", Integer.valueOf(this.f5073g));
            }
            if (!Float.isNaN(this.f5084r)) {
                hashMap.put("translationZ", Integer.valueOf(this.f5073g));
            }
            if (!Float.isNaN(this.f5079m)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f5073g));
            }
            if (!Float.isNaN(this.f5080n)) {
                hashMap.put("scaleX", Integer.valueOf(this.f5073g));
            }
            if (!Float.isNaN(this.f5080n)) {
                hashMap.put("scaleY", Integer.valueOf(this.f5073g));
            }
            if (!Float.isNaN(this.f5085s)) {
                hashMap.put("progress", Integer.valueOf(this.f5073g));
            }
            if (this.f5017e.size() > 0) {
                for (String valueOf : this.f5017e.keySet()) {
                    String valueOf2 = String.valueOf(valueOf);
                    hashMap.put(valueOf2.length() != 0 ? "CUSTOM,".concat(valueOf2) : new String("CUSTOM,"), Integer.valueOf(this.f5073g));
                }
            }
        }
    }
}
