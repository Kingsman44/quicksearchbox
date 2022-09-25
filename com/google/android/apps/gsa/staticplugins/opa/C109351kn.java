package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6976ag.p6979c.C89108b;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108212aj;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc;
import com.google.android.apps.gsa.staticplugins.opa.chatui.OpaSliceCard;
import com.google.android.apps.gsa.staticplugins.opa.chatui.ToggleSettingCard;
import com.google.android.apps.gsa.staticplugins.opa.util.C113863cr;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.material.p3505b.C44534d;
import com.google.assistant.p3897e.p3921j.C52128gg;
import com.google.assistant.p3897e.p3921j.C52131gj;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.kn */
/* compiled from: PG */
public final class C109351kn {

    /* renamed from: a */
    public final C68214a f304618a;

    /* renamed from: b */
    private final C109430lc f304619b;

    /* renamed from: c */
    private final Context f304620c;

    /* renamed from: d */
    private final C68214a f304621d;

    /* renamed from: e */
    private final C68214a f304622e;

    /* renamed from: f */
    private final boolean f304623f;

    /* renamed from: g */
    private final C68214a f304624g;

    public C109351kn(C109430lc lcVar, Context context, C68214a aVar, C68214a aVar2, C68214a aVar3, boolean z, C68214a aVar4) {
        this.f304619b = lcVar;
        this.f304620c = context;
        this.f304618a = aVar;
        this.f304621d = aVar2;
        this.f304622e = aVar3;
        this.f304623f = z;
        this.f304624g = aVar4;
    }

    /* renamed from: e */
    private final View m182039e(int i) {
        ContextThemeWrapper contextThemeWrapper;
        C104149a aVar = (C104149a) this.f304624g.mo27525b();
        if (aVar.mo93970a()) {
            contextThemeWrapper = new ContextThemeWrapper(this.f304620c, 2132148956);
            if (C44534d.m78715b()) {
                contextThemeWrapper.getTheme().applyStyle(2132148957, true);
            }
        } else if (aVar.mo93971b()) {
            contextThemeWrapper = new ContextThemeWrapper(this.f304620c, 2132149689);
            if (C44534d.m78715b()) {
                contextThemeWrapper.getTheme().applyStyle(2132149690, true);
            }
        } else {
            contextThemeWrapper = new ContextThemeWrapper(this.f304620c, 2132149688);
        }
        return LayoutInflater.from(contextThemeWrapper).inflate(i, (ViewGroup) null);
    }

    /* renamed from: f */
    private final String m182040f(int i) {
        return ((C73841bf) this.f304621d.mo27525b()).mo65322a().getString(i);
    }

    /* renamed from: a */
    public final C109355kr mo97785a(int i, C87739bu buVar, C109354kq kqVar) {
        String f = m182040f(i);
        View e = m182039e(R.layout.opa_offline_settings_card);
        ((TextView) e.findViewById(R.id.text)).setText(f);
        C58976aa aaVar = C58975e.f156826a;
        buVar.name();
        C108212aj h = C109355kr.m182053h(e);
        h.f300978d = 123399;
        C113896v vVar = new C113896v();
        vVar.f315348a = h;
        C109355kr g = vVar.mo97789a().mo97799g(kqVar);
        e.setOnClickListener(new C109350km(this, buVar, g));
        return g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C109355kr mo97786b(C109339kb kbVar, C109354kq kqVar) {
        Optional optional;
        String uri = kbVar.mo97768b().toString();
        String f = m182040f(kbVar.mo97767a());
        OpaSliceCard opaSliceCard = (OpaSliceCard) m182039e(R.layout.opa_settings_slice_card_with_icon);
        opaSliceCard.mo96567b((Integer) C89108b.f241543c.get(uri));
        if (!opaSliceCard.mo96568c(uri, f, 1, (byte[]) null, (String) null)) {
            optional = Optional.empty();
        } else {
            C58976aa aaVar = C58975e.f156826a;
            C109355kr g = C109355kr.m182052f(opaSliceCard).mo97799g(kqVar);
            opaSliceCard.f300922a = Optional.m71637of(new C109349kl(this, g));
            optional = Optional.m71637of(g);
        }
        if (optional.isPresent()) {
            return (C109355kr) optional.get();
        }
        String uri2 = kbVar.mo97769c().toString();
        String name = kbVar.mo97770d().name();
        String f2 = m182040f(kbVar.mo97767a());
        ToggleSettingCard toggleSettingCard = (ToggleSettingCard) m182039e(R.layout.toggle_setting_card);
        C52128gg ggVar = (C52128gg) C52131gj.f136789h.createBuilder();
        ggVar.copyOnWrite();
        C52131gj gjVar = (C52131gj) ggVar.instance;
        uri2.getClass();
        gjVar.f136791a |= 1;
        gjVar.f136792b = uri2;
        ggVar.copyOnWrite();
        C52131gj gjVar2 = (C52131gj) ggVar.instance;
        f2.getClass();
        gjVar2.f136791a |= 2;
        gjVar2.f136793c = f2;
        ggVar.copyOnWrite();
        C52131gj gjVar3 = (C52131gj) ggVar.instance;
        gjVar3.f136795e = 0;
        gjVar3.f136791a |= 8;
        ggVar.copyOnWrite();
        C52131gj gjVar4 = (C52131gj) ggVar.instance;
        name.getClass();
        gjVar4.f136791a |= 32;
        gjVar4.f136797g = name;
        toggleSettingCard.f301430g = this.f304623f;
        toggleSettingCard.mo96538b((C52131gj) ggVar.build());
        C58976aa aaVar2 = C58975e.f156826a;
        C109355kr g2 = C109355kr.m182052f(toggleSettingCard).mo97799g(kqVar);
        toggleSettingCard.f300944n.f301638a = Optional.m71637of(new C109348kk(this, g2));
        return g2;
    }

    /* renamed from: c */
    public final void mo97787c(C109355kr krVar) {
        C109430lc lcVar = this.f304619b;
        C108232bc b = krVar.mo97796b();
        C28292j jVar = b.f301030l;
        b.mo95829g();
        long a = C109430lc.m182113a(krVar);
        long longValue = ((Long) krVar.mo97797c().map(C109428la.f304754a).orElse(0L)).longValue();
        if (jVar == null) {
            C109430lc.m182114b(a);
            return;
        }
        C109430lc.m182114b(a);
        ((C113863cr) lcVar.f304759b.mo27525b()).mo100721a(a, longValue, C28285c.m52883j(jVar, 5, (Integer) null));
    }

    /* renamed from: d */
    public final boolean mo97788d() {
        return ((C89037bh) this.f304622e.mo27525b()).mo27386l();
    }
}
