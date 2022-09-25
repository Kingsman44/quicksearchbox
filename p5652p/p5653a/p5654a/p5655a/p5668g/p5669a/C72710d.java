package p5652p.p5653a.p5654a.p5655a.p5668g.p5669a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import com.google.android.libraries.componentview.components.base.C19898a;
import com.google.android.libraries.componentview.components.base.p1687a.C19926b;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1680c.p1681a.C19752a;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1697d.C20477h;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20598by;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20621l;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p211b.p212a.p220h.C4674a;
import p211b.p212a.p220h.C4675b;
import p211b.p212a.p227o.C4689b;

/* renamed from: p.a.a.a.g.a.d */
/* compiled from: PG */
public class C72710d extends C19898a {

    /* renamed from: b */
    public static final /* synthetic */ int f193337b = 0;

    /* renamed from: a */
    public PopupWindow f193338a;

    /* renamed from: c */
    private C4675b f193339c;

    /* renamed from: d */
    private C19926b f193340d;

    public C72710d(C56425d dVar, C20537f fVar, C20601ca caVar, Context context, C20621l lVar) {
        super(dVar, context, fVar, caVar, lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C19926b mo25154e() {
        return this.f193340d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C56425d mo25128f() {
        C4675b bVar = this.f193339c;
        if ((bVar.f14660a & 1) == 0) {
            return null;
        }
        C56425d dVar = bVar.f14661b;
        return dVar == null ? C56425d.f150537g : dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C56425d mo25107g(C56425d dVar) {
        if (dVar != null) {
            C4674a aVar = (C4674a) this.f193339c.toBuilder();
            aVar.copyOnWrite();
            C4675b bVar = (C4675b) aVar.instance;
            bVar.f14661b = dVar;
            bVar.f14660a |= 1;
            this.f193339c = (C4675b) aVar.build();
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C4675b.f14658f, this.f193339c);
        return (C56425d) cVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo25129h(View view) {
        view.setOnClickListener(new C72709c(this, view));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo25130i(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C4675b.f14658f);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C4675b bVar = (C4675b) obj;
        this.f193339c = bVar;
        C4689b bVar2 = bVar.f14663d;
        if (bVar2 == null) {
            bVar2 = C4689b.f14726d;
        }
        this.f193340d = C19752a.m37608a(bVar2);
    }

    /* renamed from: j */
    public final void mo25180j() {
        super.mo25180j();
        PopupWindow popupWindow = new PopupWindow(this.f55670f, (AttributeSet) null, 16843519);
        this.f193338a = popupWindow;
        C4675b bVar = this.f193339c;
        if ((bVar.f14660a & 2) != 0) {
            C20470a aVar = this.f57601m;
            if (aVar == null) {
                C20598by G = mo25418G();
                G.mo25535e(C19742a.INVALID_CHILD);
                G.mo25536f("Child component was null");
                C20520h.m38498c("PopupComponent", G.mo25531a(), this.f55671g, new Object[0]);
                return;
            }
            C20537f fVar = this.f55672h;
            C56425d dVar = bVar.f14662c;
            if (dVar == null) {
                dVar = C56425d.f150537g;
            }
            C20470a a = fVar.mo25450a(aVar, dVar);
            if (a == null) {
                C20598by G2 = mo25418G();
                G2.mo25535e(C19742a.INVALID_CHILD);
                G2.mo25536f("Popup component was null");
                C20520h.m38498c("PopupComponent", G2.mo25531a(), this.f55671g, new Object[0]);
                return;
            }
            View kH = a.mo25098kH();
            if (kH == null) {
                C20598by G3 = mo25418G();
                G3.mo25535e(C19742a.NULL_VIEW);
                G3.mo25536f("Popup view was null");
                C20520h.m38498c("PopupComponent", G3.mo25531a(), this.f55671g, new Object[0]);
                return;
            }
            ScrollView scrollView = new ScrollView(this.f55670f);
            kH.setOnClickListener(new C72708b(popupWindow));
            scrollView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            scrollView.setBackgroundColor(-1);
            scrollView.addView(kH);
            popupWindow.setContentView(scrollView);
            popupWindow.setWidth(-2);
            popupWindow.setHeight(-2);
            popupWindow.setFocusable(true);
            return;
        }
        C20598by G4 = mo25418G();
        G4.mo25535e(C19742a.NULL_CONTENT);
        G4.mo25536f("Popup content was null");
        C20520h.m38498c("PopupComponent", G4.mo25531a(), this.f55671g, new Object[0]);
    }

    /* renamed from: kC */
    public final boolean mo25115kC(int i, C20477h hVar) {
        if (i != 7) {
            return false;
        }
        this.f193338a.dismiss();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo25182l() {
        if (mo25098kH() instanceof Button) {
            return false;
        }
        return super.mo25182l();
    }
}
