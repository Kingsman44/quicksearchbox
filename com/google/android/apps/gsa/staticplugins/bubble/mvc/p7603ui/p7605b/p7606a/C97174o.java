package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7605b.p7606a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7587c.C97003h;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7587c.C97004i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.p2460r.p2469c.C32145w;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57438di;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57440dk;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.b.a.o */
/* compiled from: PG */
public final class C97174o {

    /* renamed from: a */
    public final View f271508a;

    /* renamed from: b */
    public final C32145w f271509b;

    /* renamed from: c */
    public final C97173n f271510c;

    /* renamed from: d */
    public final C97160aj f271511d;

    /* renamed from: e */
    public final C22871g f271512e;

    /* renamed from: f */
    private final C97160aj f271513f;

    public C97174o(Context context, C32145w wVar, C97160aj ajVar, C97160aj ajVar2, C22871g gVar, C97004i iVar) {
        int i;
        this.f271508a = LayoutInflater.from(context).inflate(R.layout.expandable_section_view, (ViewGroup) null);
        this.f271509b = wVar;
        this.f271511d = ajVar;
        this.f271513f = ajVar2;
        this.f271512e = gVar;
        int a = C97003h.m160578a(iVar.f271088c);
        int i2 = 1;
        a = a == 0 ? 1 : a;
        C28292j jVar = new C28292j(71339);
        C28292j jVar2 = new C28292j(71340);
        jVar2.mo33795i(5);
        if (a == 2) {
            a = 2;
            i = 1;
        } else {
            i = 2;
        }
        jVar2.mo33794h(i);
        C28292j jVar3 = new C28292j(71341);
        jVar3.mo33795i(5);
        i2 = a != 3 ? 2 : i2;
        jVar3.mo33794h(i2);
        C28292j jVar4 = new C28292j(71342);
        jVar4.mo33794h(i2);
        this.f271510c = new C97167h(jVar, jVar2, jVar3, jVar4);
    }

    /* renamed from: a */
    public static FrameLayout m160860a(View view) {
        return (FrameLayout) view.findViewById(R.id.expand_section_view);
    }

    /* renamed from: b */
    public final C60870cx mo90570b(C97004i iVar) {
        ((TextView) this.f271508a.findViewById(R.id.title_text)).setText(iVar.f271086a);
        C57438di diVar = iVar.f271087b;
        if (diVar == null) {
            diVar = C57438di.f153417i;
        }
        this.f271509b.mo37956c();
        this.f271513f.mo90555c();
        this.f271509b.mo37957d(diVar, 0, C58485gu.m89846n(C57440dk.f153428c));
        return this.f271513f.mo90553a();
    }

    /* renamed from: c */
    public final void mo90571c(int i) {
        ImageView imageView = (ImageView) this.f271508a.findViewById(R.id.expand_more_less_image);
        if (i == 3) {
            m160860a(this.f271508a).setVisibility(0);
            imageView.setImageResource(R.drawable.bubble_ic_expand_less_grey600_24dp);
            return;
        }
        m160860a(this.f271508a).setVisibility(8);
        imageView.setImageResource(R.drawable.bubble_ic_expand_more_grey600_24dp);
    }
}
