package com.google.android.apps.education.bloom.mathview.render.keyboard;

import android.graphics.Typeface;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.p3589d.p3590a.C45704u;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.keyboard.l */
/* compiled from: PG */
public final class C9091l extends C0640fb implements C9074aa {

    /* renamed from: a */
    public Typeface f31349a;

    /* renamed from: b */
    public final List f31350b;

    /* renamed from: c */
    private final C69626l f31351c;

    /* renamed from: d */
    private final C69626l f31352d;

    /* renamed from: e */
    private final int[] f31353e = {R.layout.view_keyboard_home, R.layout.view_keyboard_alt};

    public C9091l(C9074aa aaVar, C69626l lVar, C69626l lVar2) {
        C69664n.m101061g(aaVar, "mathKeyboardBinding");
        this.f31351c = lVar;
        this.f31352d = lVar2;
        C69496am amVar = C69496am.f185918a;
        this.f31350b = C69540x.m100949g(amVar, amVar);
    }

    public final int getItemCount() {
        return 2;
    }

    public final int getItemViewType(int i) {
        return this.f31353e[i];
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C9097r rVar = (C9097r) ghVar;
        C69664n.m101061g(rVar, "holder");
        Typeface typeface = this.f31349a;
        C69626l lVar = this.f31351c;
        C69626l lVar2 = this.f31352d;
        Iterable iterable = (Iterable) this.f31350b.get(i);
        C69664n.m101061g(iterable, "customVars");
        C9088i iVar = C9088i.f31339a;
        C9088i.f31343e.mo42045b(C9088i.f31340b[0], typeface);
        List X = C69540x.m100842X(C69540x.m100837S(iterable, new C9095p()));
        if (X.size() >= rVar.f31364f || rVar.mo17408b().isEmpty()) {
            int size = X.size();
            int i2 = rVar.f31364f;
            if (size > i2) {
                X = X.subList(0, i2);
            }
        } else {
            for (C45704u uVar : rVar.mo17408b()) {
                if (!(X instanceof Collection) || !X.isEmpty()) {
                    Iterator it = X.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!(!C69664n.m101066l(((C45704u) it.next()).mo49750c(), uVar.mo49750c()))) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                X.add(uVar);
                X.size();
            }
        }
        C9088i iVar2 = C9088i.f31339a;
        View findViewById = ((ViewGroup) rVar.itemView).findViewById(rVar.mo17407a());
        C69664n.m101060f(findViewById, "itemView as ViewGroup).f…ewById(customVarAnchorId)");
        iVar2.mo17406b((ImageView) findViewById, (C45704u) X.get(0));
        C9085f fVar = C9085f.f31334a;
        int a = rVar.mo17407a();
        String c = ((C45704u) X.get(0)).mo49750c();
        C69664n.m101060f(c, "resolvedVars[0].latex()");
        C9085f.m23623c(a, c);
        rVar.f31362d = X.size() > 1 ? X.subList(1, X.size()) : null;
        rVar.f31360b = lVar;
        rVar.f31361c = lVar2;
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == R.layout.view_keyboard_home) {
            return new C9090k(viewGroup);
        }
        return new C9089j(viewGroup);
    }
}
