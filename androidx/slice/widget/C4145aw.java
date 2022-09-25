package androidx.slice.widget;

import android.content.Context;
import android.support.p033v7.widget.C0646fh;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.slice.SliceItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.slice.widget.aw */
/* compiled from: PG */
public class C4145aw extends C4129ag implements C4142at {

    /* renamed from: a */
    public SliceView f13328a;

    /* renamed from: b */
    public final View f13329b;

    /* renamed from: c */
    public final int[] f13330c = new int[2];

    /* renamed from: d */
    private C4128af f13331d;

    /* renamed from: e */
    private final RecyclerView f13332e;

    /* renamed from: f */
    private C4154j f13333f;

    /* renamed from: g */
    private List f13334g = new ArrayList();

    /* renamed from: h */
    private int f13335h = 0;

    public C4145aw(Context context) {
        super(context);
        RecyclerView recyclerView = new RecyclerView(getContext());
        this.f13332e = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mo8734s(new C4128af(context));
        C4128af afVar = new C4128af(context);
        this.f13331d = afVar;
        recyclerView.setAdapter(afVar);
        addView(recyclerView);
        View view = new View(getContext());
        this.f13329b = view;
        view.setBackground(C4144av.m11883c(getContext(), 16843534));
        addView(view);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: t */
    private final void m11886t(int i) {
        C4146b bVar;
        C4154j jVar = this.f13333f;
        if (jVar == null || !jVar.mo8711d()) {
            mo8642f();
            return;
        }
        C4154j jVar2 = this.f13333f;
        C4137ao aoVar = this.f13265x;
        C4143au auVar = this.f13267z;
        int i2 = 1;
        if (auVar.f13326d == 1) {
            ArrayList arrayList = new ArrayList(Arrays.asList(new C4160p[]{jVar2.f13378a}));
            jVar2.f13380c.size();
            bVar = new C4146b(arrayList);
        } else if (auVar.f13325c || i <= 0) {
            List list = jVar2.f13380c;
            if (list.size() > 0 && aoVar.mo8721g(list)) {
                list = list.subList(1, list.size());
            }
            bVar = new C4146b(list);
        } else {
            bVar = aoVar.mo8719e(jVar2, i, auVar);
        }
        List list2 = bVar.f13336a;
        this.f13334g = list2;
        this.f13335h = this.f13265x.mo8717c(list2, this.f13267z);
        C4128af afVar = this.f13331d;
        List list3 = this.f13334g;
        int i3 = this.f13267z.f13326d;
        afVar.mo8697e(list3);
        int i4 = this.f13335h;
        int measuredHeight = getMeasuredHeight();
        RecyclerView recyclerView = this.f13332e;
        if (!this.f13267z.f13325c || i4 <= measuredHeight) {
            i2 = 2;
        }
        recyclerView.setOverScrollMode(i2);
    }

    /* renamed from: f */
    public final void mo8642f() {
        this.f13335h = 0;
        this.f13334g.clear();
        this.f13331d.mo8697e((List) null);
        this.f13333f = null;
    }

    /* renamed from: fq */
    public final Set mo8698fq() {
        return this.f13331d.f13251m;
    }

    /* renamed from: fr */
    public final void mo8699fr(boolean z) {
        C4128af afVar = this.f13331d;
        afVar.f13252n = z;
        afVar.mo8696d();
    }

    /* renamed from: fs */
    public final void mo8700fs(long j) {
        this.f13259r = j;
        C4128af afVar = this.f13331d;
        if (afVar.f13244f != j) {
            afVar.f13244f = j;
            afVar.mo8696d();
        }
    }

    /* renamed from: ft */
    public final void mo8701ft(Set set) {
        C4128af afVar = this.f13331d;
        if (set == null) {
            afVar.f13251m.clear();
        } else {
            afVar.f13251m = set;
        }
        afVar.mObservable.mo2879a();
    }

    /* renamed from: fu */
    public final void mo8702fu(boolean z) {
        this.f13258q = z;
        C4128af afVar = this.f13331d;
        if (afVar.f13243e != z) {
            afVar.f13243e = z;
            afVar.mo8696d();
        }
    }

    /* renamed from: fv */
    public final void mo8703fv(List list) {
        C4128af afVar = this.f13331d;
        afVar.f13242d = list;
        afVar.mo8696d();
    }

    /* renamed from: fw */
    public final void mo8704fw(C4137ao aoVar, C4161q qVar) {
        this.f13265x = aoVar;
        this.f13266y = qVar;
        C4128af afVar = this.f13331d;
        afVar.f13241c = aoVar;
        afVar.mObservable.mo2879a();
        if (qVar.f13422t) {
            this.f13332e.setItemAnimator((C0646fh) null);
        }
    }

    /* renamed from: fx */
    public final void mo8705fx(C4154j jVar) {
        this.f13333f = jVar;
        m11886t(this.f13265x.mo8716b(jVar, this.f13267z));
    }

    /* renamed from: g */
    public final void mo8644g(int i, int i2, int i3, int i4) {
        super.mo8644g(i, i2, i3, i4);
        C4128af afVar = this.f13331d;
        afVar.f13247i = i;
        afVar.f13248j = i2;
        afVar.f13249k = i3;
        afVar.f13250l = i4;
    }

    /* renamed from: h */
    public final void mo8727h(boolean z) {
        this.f13332e.getScrollingChildHelper().mo5279a(z);
        C4154j jVar = this.f13333f;
        if (jVar != null) {
            m11886t(this.f13265x.mo8716b(jVar, this.f13267z));
        }
    }

    /* renamed from: i */
    public final void mo8645i(int i) {
        this.f13257p = i;
        m11886t(getMeasuredHeight());
    }

    /* renamed from: m */
    public final void mo8728m() {
        C4154j jVar = this.f13333f;
        if (jVar != null) {
            m11886t(this.f13265x.mo8716b(jVar, this.f13267z));
        }
    }

    /* renamed from: n */
    public final void mo8707n(SliceItem sliceItem) {
        this.f13331d.mo8686a(sliceItem, 0);
    }

    /* renamed from: o */
    public final void mo8708o(C4143au auVar) {
        this.f13267z = auVar;
        this.f13331d.f13253o = auVar;
        auVar.f13327e = this;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SliceView sliceView = (SliceView) getParent();
        this.f13328a = sliceView;
        C4128af afVar = this.f13331d;
        afVar.f13245g = sliceView;
        afVar.f13246h = this;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        if (!this.f13267z.f13325c && this.f13334g.size() > 0 && this.f13335h != size) {
            m11886t(size);
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: p */
    public final void mo8709p(C4141as asVar) {
        this.f13256o = asVar;
        C4128af afVar = this.f13331d;
        if (afVar != null) {
            afVar.f13240b = this.f13256o;
        }
    }

    /* renamed from: q */
    public final void mo8729q() {
        C4128af afVar = this.f13331d;
        if (afVar != null) {
            afVar.mo8696d();
        }
    }

    /* renamed from: r */
    public final void mo8730r() {
        C4154j jVar = this.f13333f;
        if (jVar != null) {
            m11886t(this.f13265x.mo8716b(jVar, this.f13267z));
        }
    }

    /* renamed from: s */
    public final void mo8734s(C4128af afVar) {
        this.f13331d = afVar;
        this.f13332e.setAdapter(afVar);
    }
}
