package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8252g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.smartspace.C92125t;
import com.google.android.apps.gsa.smartspace.p7259c.C92087c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106734a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.C106740b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4661a.p4662a.C61745g;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61747i;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61757s;
import com.google.knowledge.p4661a.p4662a.C61758t;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.g.b */
/* compiled from: PG */
public final class C106772b implements C106740b {

    /* renamed from: a */
    public final ViewGroup f297548a;

    /* renamed from: b */
    public final C87568k f297549b;

    /* renamed from: c */
    public final String f297550c;

    /* renamed from: d */
    public final Optional f297551d;

    /* renamed from: e */
    public final C58974d f297552e;

    /* renamed from: f */
    public final C92125t f297553f;

    public C106772b(C87568k kVar, C83564a aVar, C92125t tVar, Context context, String str, Optional optional, ViewGroup viewGroup) {
        aVar.mo76900a("SleepSound");
        this.f297549b = kVar;
        this.f297550c = str;
        this.f297551d = optional;
        this.f297552e = aVar.mo76901b(this);
        this.f297553f = tVar;
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.aa_generic_tile, viewGroup, false);
        this.f297548a = viewGroup2;
        C28292j jVar = new C28292j(108845);
        jVar.mo33795i(5);
        C28295m.m52919e(viewGroup2, jVar);
        ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.aa_icon);
        View inflate = LayoutInflater.from(context).inflate(R.layout.aa_generic_deeplink_content, viewGroup2, true);
        TextView textView = (TextView) inflate.findViewById(R.id.aa_generic_tile_desc);
        TextView textView2 = (TextView) inflate.findViewById(R.id.aa_generic_tile_footer);
        imageView.setImageResource(R.drawable.quantum_gm_ic_music_note_vd_theme_24);
        imageView.setImageTintList(ColorStateList.valueOf(C1878d.m5128a(context, R.color.aa_sleep_sound_high_low)));
        ((TextView) viewGroup2.findViewById(R.id.aa_generic_tile_title)).setText(R.string.aa_sleep_sounds_title);
        if (str.isEmpty()) {
            textView.setVisibility(0);
            textView.setText(R.string.aa_sleep_sounds_desc);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
        if (optional.isPresent()) {
            textView2.setVisibility(0);
            textView2.setText(((C92087c) optional.get()).f256723b);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        } else {
            textView2.setVisibility(8);
        }
        viewGroup2.setOnClickListener(new C106771a(this, context));
    }

    /* renamed from: c */
    public static C61746h m177526c(String str, String str2) {
        C61745g gVar = (C61745g) C61746h.f166791g.createBuilder();
        gVar.copyOnWrite();
        C61746h hVar = (C61746h) gVar.instance;
        hVar.f166793a |= 2;
        hVar.f166796d = str;
        C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
        C61757s sVar = (C61757s) C61758t.f166824c.createBuilder();
        sVar.copyOnWrite();
        C61758t tVar = (C61758t) sVar.instance;
        str2.getClass();
        tVar.f166826a = 1;
        tVar.f166827b = str2;
        iVar.copyOnWrite();
        C61748j jVar = (C61748j) iVar.instance;
        C61758t tVar2 = (C61758t) sVar.build();
        tVar2.getClass();
        jVar.f166803b = tVar2;
        jVar.f166802a = 3;
        gVar.copyOnWrite();
        C61746h hVar2 = (C61746h) gVar.instance;
        C61748j jVar2 = (C61748j) iVar.build();
        jVar2.getClass();
        hVar2.f166797e = jVar2;
        hVar2.f166793a |= 4;
        return (C61746h) gVar.build();
    }

    /* renamed from: a */
    public final List mo95632a() {
        return C58485gu.m89846n(C106734a.MINI);
    }

    /* renamed from: b */
    public final C60870cx mo95633b() {
        return C60856cj.m92900i(Optional.m71637of(this.f297548a));
    }
}
