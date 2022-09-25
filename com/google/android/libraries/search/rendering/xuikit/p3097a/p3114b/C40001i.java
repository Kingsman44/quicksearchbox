package com.google.android.libraries.search.rendering.xuikit.p3097a.p3114b;

import android.content.Context;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.protobuf.C62917ay;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4928b.C64251h;
import com.google.protos.youtube.elements.C66059au;
import dagger.C68214a;
import p5488io.p5490b.C69794a;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.b.i */
/* compiled from: PG */
public final class C40001i implements C21312s {

    /* renamed from: a */
    private final C40007o f105142a;

    public C40001i(Fragment fragment, C68214a aVar) {
        View view;
        Context context = fragment.getContext();
        View view2 = fragment.getView();
        if (view2 != null) {
            view = view2.getRootView();
        } else {
            C0167am activity = fragment.getActivity();
            view = activity != null ? activity.getWindow().getDecorView() : null;
        }
        view.getClass();
        this.f105142a = new C40007o(context, view, aVar);
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C64251h.f173722h;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        return this.f105142a.mo25804c((C64251h) obj, rVar);
    }
}
