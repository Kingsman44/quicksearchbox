package androidx.slice.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.slice.SliceItem;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.slice.widget.ag */
/* compiled from: PG */
public abstract class C4129ag extends FrameLayout {

    /* renamed from: o */
    protected C4141as f13256o;

    /* renamed from: p */
    protected int f13257p;

    /* renamed from: q */
    protected boolean f13258q;

    /* renamed from: r */
    protected long f13259r;

    /* renamed from: s */
    protected int f13260s;

    /* renamed from: t */
    protected int f13261t;

    /* renamed from: u */
    protected int f13262u;

    /* renamed from: v */
    protected int f13263v;

    /* renamed from: w */
    protected C4123aa f13264w;

    /* renamed from: x */
    protected C4137ao f13265x;

    /* renamed from: y */
    protected C4161q f13266y;

    /* renamed from: z */
    protected C4143au f13267z;

    public C4129ag(Context context) {
        super(context);
        this.f13257p = -1;
        this.f13259r = -1;
    }

    /* renamed from: f */
    public abstract void mo8642f();

    /* renamed from: fq */
    public Set mo8698fq() {
        return null;
    }

    /* renamed from: fr */
    public void mo8699fr(boolean z) {
    }

    /* renamed from: fs */
    public void mo8700fs(long j) {
        this.f13259r = j;
    }

    /* renamed from: ft */
    public void mo8701ft(Set set) {
    }

    /* renamed from: fu */
    public void mo8702fu(boolean z) {
        this.f13258q = z;
    }

    /* renamed from: fv */
    public void mo8703fv(List list) {
    }

    /* renamed from: fw */
    public void mo8704fw(C4137ao aoVar, C4161q qVar) {
        this.f13265x = aoVar;
        this.f13266y = qVar;
    }

    /* renamed from: fx */
    public void mo8705fx(C4154j jVar) {
    }

    /* renamed from: fy */
    public final int mo8706fy() {
        C4143au auVar = this.f13267z;
        if (auVar != null) {
            return auVar.f13326d;
        }
        return 2;
    }

    /* renamed from: fz */
    public void mo8643fz(C4130ah ahVar, boolean z, int i, int i2, C4141as asVar) {
    }

    /* renamed from: g */
    public void mo8644g(int i, int i2, int i3, int i4) {
        this.f13260s = i;
        this.f13261t = i2;
        this.f13262u = i3;
        this.f13263v = i4;
    }

    /* renamed from: i */
    public void mo8645i(int i) {
        this.f13257p = i;
    }

    /* renamed from: n */
    public void mo8707n(SliceItem sliceItem) {
    }

    /* renamed from: o */
    public void mo8708o(C4143au auVar) {
        this.f13267z = auVar;
    }

    /* renamed from: p */
    public void mo8709p(C4141as asVar) {
        this.f13256o = asVar;
    }

    public C4129ag(Context context, AttributeSet attributeSet) {
        this(context);
    }
}
