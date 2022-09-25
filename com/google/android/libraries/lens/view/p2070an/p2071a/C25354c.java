package com.google.android.libraries.lens.view.p2070an.p2071a;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.connectivity.LensConnectivityManager;
import com.google.android.libraries.lens.view.filters.translation.C26217r;
import com.google.android.libraries.lens.view.filters.translation.p2106a.C26034j;
import com.google.android.libraries.lens.view.utils.C28110al;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4541l.C59326i;
import com.google.lens.p4707j.C62510ef;
import com.google.lens.p4707j.C62511eg;
import com.google.lens.p4707j.C62574h;
import com.google.lens.p4707j.C62576j;
import com.google.p4017at.p4056g.p4057a.p4058a.C53951a;
import com.google.p4017at.p4056g.p4057a.p4058a.C53969ad;
import com.google.p4017at.p4056g.p4057a.p4058a.C53970ae;
import com.google.p4017at.p4056g.p4057a.p4058a.C53992b;
import com.google.p4017at.p4056g.p4057a.p4058a.C54044cy;
import com.google.p4017at.p4056g.p4057a.p4058a.C54045cz;
import com.google.p4017at.p4056g.p4057a.p4058a.C54055g;
import com.google.p4017at.p4056g.p4057a.p4058a.C54056h;
import com.google.p4017at.p4056g.p4057a.p4058a.C54057i;
import com.google.p4017at.p4056g.p4057a.p4058a.C54058j;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56277cd;
import com.google.protobuf.C63088z;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.lens.view.an.a.c */
/* compiled from: PG */
public final class C25354c {

    /* renamed from: a */
    public static final C25353b f69034a = new C25352a("https://www.gstatic.com/images/branding/product/2x/translate_48dp.png", "https://www.gstatic.com/images/branding/product/2x/translate_48dp.png");

    /* renamed from: b */
    public static final C25353b f69035b = new C25352a("https://www.gstatic.com/images/icons/material/system/2x/share_googblue_48dp.png", "https://www.gstatic.com/lens/cards/assets/share_icon_dark_mode.png");

    /* renamed from: c */
    public static final C25353b f69036c = new C25352a("https://fonts.gstatic.com/s/i/googlematerialicons/file_download/v6/googblue-48dp/2x/gm_file_download_googblue_48dp.png", "https://www.gstatic.com/lens/cards/assets/offline_translate_download_dark_mode_icon.png");

    /* renamed from: d */
    public static final C25353b f69037d = new C25352a("https://fonts.gstatic.com/s/i/googlematerialicons/file_download_done/v6/googblue-48dp/2x/gm_file_download_done_googblue_48dp.png", "https://www.gstatic.com/lens/cards/assets/offline_translate_download_done_dark_mode_icon.png");

    /* renamed from: e */
    public static final C25353b f69038e = new C25352a("https://fonts.gstatic.com/s/i/googlematerialicons/pause_circle/v6/googblue-48dp/2x/gm_pause_circle_googblue_48dp.png", "https://www.gstatic.com/lens/cards/assets/offline_translate_download_queued_dark_mode_icon.png");

    /* renamed from: f */
    public static final Locale f69039f = Locale.forLanguageTag("en");

    /* renamed from: k */
    private static final C25353b f69040k = new C25352a("https://fonts.gstatic.com/s/i/googlematerialicons/content_copy/v6/googblue-48dp/2x/gm_content_copy_googblue_48dp.png", "https://www.gstatic.com/lens/cards/assets/content_copy_dark_mode.png");

    /* renamed from: l */
    private static final C25353b f69041l = new C25352a("https://www.gstatic.com/lens/ui/icon/googleg_48px_2x.png", "https://www.gstatic.com/lens/ui/icon/googleg_48px_2x.png");

    /* renamed from: m */
    private static final C25353b f69042m = new C25352a("https://fonts.gstatic.com/s/i/googlematerialicons/arrow_forward/v11/gm_blue-24dp/2x/gm_arrow_forward_gm_blue_24dp.png", "https://www.gstatic.com/lens/cards/assets/arrow_forward_icon_dark_mode.png");

    /* renamed from: n */
    private static final C25353b f69043n = new C25352a("https://www.gstatic.com/lens/cards/assets/select_text.png", "https://www.gstatic.com/lens/cards/assets/select_text_dark_mode.png");

    /* renamed from: o */
    private static final C25353b f69044o = new C25352a("https://fonts.gstatic.com/s/i/googlematerialicons/volume_up/v6/gm_blue-48dp/2x/gm_volume_up_gm_blue_48dp.png", "https://www.gstatic.com/lens/cards/assets/gm_volume_up_dark_mode.png");

    /* renamed from: p */
    private static final C25353b f69045p = new C25352a("https://www.gstatic.com/images/icons/material/system/2x/pause_googblue_18dp.png", "https://www.gstatic.com/lens/cards/assets/pause_dark_mode.png");

    /* renamed from: q */
    private static final C25353b f69046q = new C25352a("https://www.gstatic.com/images/icons/material/system/2x/phonelink_gm_blue_48dp.png", "https://www.gstatic.com/lens/cards/assets/phonelink_icon_dark_mode.png");

    /* renamed from: r */
    private static final C25353b f69047r = new C25352a("https://fonts.gstatic.com/s/i/googlematerialicons/language/v9/gm_blue-48dp/2x/gm_language_gm_blue_48dp.png", "https://www.gstatic.com/lens/cards/assets/change_language_dark_mode_icon.png");

    /* renamed from: s */
    private static final Uri f69048s = Uri.parse("https://www.google.com/search");

    /* renamed from: g */
    public final Resources f69049g;

    /* renamed from: h */
    public final LensConnectivityManager f69050h;

    /* renamed from: i */
    public final C26217r f69051i;

    /* renamed from: j */
    public final C26034j f69052j;

    /* renamed from: t */
    private final AtomicInteger f69053t = new AtomicInteger();

    /* renamed from: u */
    private final boolean f69054u;

    /* renamed from: v */
    private final C58833ax f69055v;

    public C25354c(Context context, LensConnectivityManager lensConnectivityManager, C26034j jVar, C58833ax axVar, C26217r rVar) {
        this.f69049g = context.getResources();
        this.f69054u = C28110al.m52391c(context);
        this.f69050h = lensConnectivityManager;
        this.f69052j = jVar;
        this.f69055v = axVar;
        this.f69051i = rVar;
    }

    /* renamed from: l */
    public static C54045cz m46681l(int i) {
        C54044cy cyVar = (C54044cy) C54045cz.f141801b.createBuilder();
        cyVar.copyOnWrite();
        ((C54045cz) cyVar.instance).f141803a = i;
        return (C54045cz) cyVar.build();
    }

    /* renamed from: m */
    public static String m46682m(String str) {
        return "intent://" + str + "#Intent;scheme=ae-action;";
    }

    /* renamed from: n */
    public static String m46683n(String str, String str2) {
        return "S." + str + "=" + str2 + ";";
    }

    /* renamed from: p */
    public static Locale m46684p(String str) {
        Locale forLanguageTag = Locale.forLanguageTag(str);
        return Locale.SIMPLIFIED_CHINESE.equals(forLanguageTag) ? Locale.CHINESE : forLanguageTag;
    }

    /* renamed from: q */
    private static String m46685q(String str) {
        return "ae-action://" + str + "/";
    }

    /* renamed from: a */
    public final C54056h mo30394a(int i, String str, C25353b bVar, String str2) {
        C54056h hVar = (C54056h) C54057i.f141819g.createBuilder();
        hVar.copyOnWrite();
        ((C54057i) hVar.instance).f141821a = i;
        hVar.copyOnWrite();
        str.getClass();
        ((C54057i) hVar.instance).f141822b = str;
        C53970ae k = mo30404k(bVar);
        hVar.copyOnWrite();
        k.getClass();
        ((C54057i) hVar.instance).f141824d = k;
        C53951a aVar = (C53951a) C53992b.f141653e.createBuilder();
        aVar.copyOnWrite();
        ((C53992b) aVar.instance).f141657c = 1;
        aVar.copyOnWrite();
        C53992b bVar2 = (C53992b) aVar.instance;
        str2.getClass();
        bVar2.f141655a = 3;
        bVar2.f141656b = str2;
        hVar.copyOnWrite();
        C53992b bVar3 = (C53992b) aVar.build();
        bVar3.getClass();
        ((C54057i) hVar.instance).f141825e = bVar3;
        return hVar;
    }

    /* renamed from: b */
    public final C54058j mo30395b(String str) {
        C54055g gVar = (C54055g) C54058j.f141828j.createBuilder();
        String o = mo30405o();
        gVar.copyOnWrite();
        o.getClass();
        ((C54058j) gVar.instance).f141830a = o;
        C53970ae k = mo30404k(f69040k);
        gVar.copyOnWrite();
        k.getClass();
        ((C54058j) gVar.instance).f141832c = k;
        String string = this.f69049g.getString(R.string.lens_info_panel_on_device_chip_copy_text);
        gVar.copyOnWrite();
        string.getClass();
        ((C54058j) gVar.instance).f141831b = string;
        String string2 = this.f69049g.getString(R.string.lens_info_panel_on_device_chip_copy_content_description);
        gVar.copyOnWrite();
        string2.getClass();
        ((C54058j) gVar.instance).f141836g = string2;
        C53951a aVar = (C53951a) C53992b.f141653e.createBuilder();
        aVar.copyOnWrite();
        ((C53992b) aVar.instance).f141657c = 1;
        String q = m46685q("copy");
        String encode = Uri.encode(str);
        aVar.copyOnWrite();
        C53992b bVar = (C53992b) aVar.instance;
        bVar.f141655a = 3;
        bVar.f141656b = q.concat(String.valueOf(encode));
        gVar.copyOnWrite();
        C53992b bVar2 = (C53992b) aVar.build();
        bVar2.getClass();
        ((C54058j) gVar.instance).f141833d = bVar2;
        gVar.copyOnWrite();
        ((C54058j) gVar.instance).f141835f = 2;
        C54045cz l = m46681l(61165);
        gVar.copyOnWrite();
        l.getClass();
        ((C54058j) gVar.instance).f141834e = l;
        return (C54058j) gVar.build();
    }

    /* renamed from: c */
    public final C54058j mo30396c() {
        C54055g gVar = (C54055g) C54058j.f141828j.createBuilder();
        String o = mo30405o();
        gVar.copyOnWrite();
        o.getClass();
        ((C54058j) gVar.instance).f141830a = o;
        C53970ae k = mo30404k(f69043n);
        gVar.copyOnWrite();
        k.getClass();
        ((C54058j) gVar.instance).f141832c = k;
        String string = this.f69049g.getString(R.string.lens_info_panel_on_device_chip_select_all_text);
        gVar.copyOnWrite();
        string.getClass();
        ((C54058j) gVar.instance).f141831b = string;
        C53951a aVar = (C53951a) C53992b.f141653e.createBuilder();
        aVar.copyOnWrite();
        ((C53992b) aVar.instance).f141657c = 1;
        String q = m46685q("select-all-text");
        aVar.copyOnWrite();
        C53992b bVar = (C53992b) aVar.instance;
        bVar.f141655a = 3;
        bVar.f141656b = q;
        gVar.copyOnWrite();
        C53992b bVar2 = (C53992b) aVar.build();
        bVar2.getClass();
        ((C54058j) gVar.instance).f141833d = bVar2;
        gVar.copyOnWrite();
        ((C54058j) gVar.instance).f141835f = 2;
        C54045cz l = m46681l(64625);
        gVar.copyOnWrite();
        l.getClass();
        ((C54058j) gVar.instance).f141834e = l;
        return (C54058j) gVar.build();
    }

    /* renamed from: d */
    public final C54058j mo30397d(String str) {
        C54055g gVar = (C54055g) C54058j.f141828j.createBuilder();
        String o = mo30405o();
        gVar.copyOnWrite();
        o.getClass();
        ((C54058j) gVar.instance).f141830a = o;
        String string = this.f69049g.getString(R.string.lens_info_panel_on_device_chip_send_to_translate_home);
        gVar.copyOnWrite();
        string.getClass();
        ((C54058j) gVar.instance).f141831b = string;
        C53970ae k = mo30404k(f69042m);
        gVar.copyOnWrite();
        k.getClass();
        ((C54058j) gVar.instance).f141832c = k;
        C53951a aVar = (C53951a) C53992b.f141653e.createBuilder();
        aVar.copyOnWrite();
        ((C53992b) aVar.instance).f141657c = 1;
        String q = m46685q("translate-in-app");
        String encode = Uri.encode(str);
        aVar.copyOnWrite();
        C53992b bVar = (C53992b) aVar.instance;
        bVar.f141655a = 3;
        bVar.f141656b = q.concat(String.valueOf(encode));
        gVar.copyOnWrite();
        C53992b bVar2 = (C53992b) aVar.build();
        bVar2.getClass();
        ((C54058j) gVar.instance).f141833d = bVar2;
        gVar.copyOnWrite();
        ((C54058j) gVar.instance).f141835f = 2;
        C54045cz l = m46681l(61796);
        gVar.copyOnWrite();
        l.getClass();
        ((C54058j) gVar.instance).f141834e = l;
        return (C54058j) gVar.build();
    }

    /* renamed from: e */
    public final C54058j mo30398e(String str, C56277cd cdVar) {
        Locale p = m46684p(cdVar.f149985c);
        if (p.equals(C26217r.f71251a) && !str.isEmpty()) {
            p = m46684p(str);
        }
        if (!p.equals(m46684p(cdVar.f149984b))) {
            return null;
        }
        C54055g gVar = (C54055g) C54058j.f141828j.createBuilder();
        String o = mo30405o();
        gVar.copyOnWrite();
        o.getClass();
        ((C54058j) gVar.instance).f141830a = o;
        String string = this.f69049g.getString(R.string.lens_info_panel_on_device_chip_change_language);
        gVar.copyOnWrite();
        string.getClass();
        ((C54058j) gVar.instance).f141831b = string;
        C53951a aVar = (C53951a) C53992b.f141653e.createBuilder();
        aVar.copyOnWrite();
        ((C53992b) aVar.instance).f141657c = 1;
        String q = m46685q("change-language");
        aVar.copyOnWrite();
        C53992b bVar = (C53992b) aVar.instance;
        bVar.f141655a = 3;
        bVar.f141656b = q;
        gVar.copyOnWrite();
        C53992b bVar2 = (C53992b) aVar.build();
        bVar2.getClass();
        ((C54058j) gVar.instance).f141833d = bVar2;
        C53970ae k = mo30404k(f69047r);
        gVar.copyOnWrite();
        k.getClass();
        ((C54058j) gVar.instance).f141832c = k;
        gVar.copyOnWrite();
        ((C54058j) gVar.instance).f141835f = 2;
        C54045cz l = m46681l(121477);
        gVar.copyOnWrite();
        l.getClass();
        ((C54058j) gVar.instance).f141834e = l;
        return (C54058j) gVar.build();
    }

    /* renamed from: f */
    public final C54058j mo30399f(String str) {
        if (!this.f69050h.mo30907k() || !this.f69055v.mo56113h()) {
            return null;
        }
        C62574h hVar = (C62574h) C62576j.f168937e.createBuilder();
        C63088z E = C63088z.m96143E(str);
        hVar.copyOnWrite();
        ((C62576j) hVar.instance).f168940b = E;
        hVar.copyOnWrite();
        ((C62576j) hVar.instance).f168941c = 0;
        hVar.copyOnWrite();
        ((C62576j) hVar.instance).f168942d = true;
        String m = m46682m("cloud-copy");
        C59326i iVar = C59326i.f157517e;
        byte[] byteArray = ((C62576j) hVar.build()).toByteArray();
        String str2 = m + m46683n("com.google.opa.eyes.EXTRA_CLOUD_COPY_METADATA", iVar.mo56837l(byteArray, byteArray.length)) + "end;";
        C54055g gVar = (C54055g) C54058j.f141828j.createBuilder();
        String o = mo30405o();
        gVar.copyOnWrite();
        o.getClass();
        ((C54058j) gVar.instance).f141830a = o;
        String string = this.f69049g.getString(R.string.lens_info_panel_on_device_chip_cloud_copy);
        gVar.copyOnWrite();
        string.getClass();
        ((C54058j) gVar.instance).f141831b = string;
        C53951a aVar = (C53951a) C53992b.f141653e.createBuilder();
        aVar.copyOnWrite();
        ((C53992b) aVar.instance).f141657c = 1;
        aVar.copyOnWrite();
        C53992b bVar = (C53992b) aVar.instance;
        bVar.f141655a = 3;
        bVar.f141656b = str2;
        gVar.copyOnWrite();
        C53992b bVar2 = (C53992b) aVar.build();
        bVar2.getClass();
        ((C54058j) gVar.instance).f141833d = bVar2;
        C53970ae k = mo30404k(f69046q);
        gVar.copyOnWrite();
        k.getClass();
        ((C54058j) gVar.instance).f141832c = k;
        gVar.copyOnWrite();
        ((C54058j) gVar.instance).f141835f = 2;
        C54045cz l = m46681l(92041);
        gVar.copyOnWrite();
        l.getClass();
        ((C54058j) gVar.instance).f141834e = l;
        return (C54058j) gVar.build();
    }

    /* renamed from: g */
    public final C54058j mo30400g(String str, int i) {
        if (!this.f69050h.mo30907k()) {
            return null;
        }
        String o = mo30405o();
        C62510ef efVar = (C62510ef) C62511eg.f168775b.createBuilder();
        efVar.copyOnWrite();
        str.getClass();
        ((C62511eg) efVar.instance).f168777a = str;
        String m = m46682m("text-to-speech");
        C59326i iVar = C59326i.f157517e;
        byte[] byteArray = ((C62511eg) efVar.build()).toByteArray();
        String str2 = m + m46683n("com.google.opa.eyes.EXTRA_TEXT_TO_SPEECH_METADATA", iVar.mo56837l(byteArray, byteArray.length)) + m46683n("com.google.opa.eyes.EXTRA_SOURCE_CHIP_ID", o) + "end;";
        C54055g gVar = (C54055g) C54058j.f141828j.createBuilder();
        gVar.copyOnWrite();
        o.getClass();
        ((C54058j) gVar.instance).f141830a = o;
        String string = this.f69049g.getString(R.string.lens_info_panel_on_device_chip_listen);
        C25353b bVar = f69044o;
        C54056h a = mo30394a(1, string, bVar, str2);
        String string2 = this.f69049g.getString(R.string.lens_info_panel_on_device_chip_listen_loading);
        a.copyOnWrite();
        C54057i iVar2 = C54057i.f141819g;
        string2.getClass();
        ((C54057i) a.instance).f141823c = string2;
        String string3 = this.f69049g.getString(R.string.lens_info_panel_on_device_chip_listen_content_description);
        a.copyOnWrite();
        string3.getClass();
        ((C54057i) a.instance).f141826f = string3;
        gVar.mo54061a(a);
        C54056h a2 = mo30394a(2, this.f69049g.getString(R.string.lens_info_panel_on_device_chip_listen_pause), f69045p, str2);
        String string4 = this.f69049g.getString(R.string.lens_info_panel_on_device_chip_listen_pause_content_description);
        a2.copyOnWrite();
        string4.getClass();
        ((C54057i) a2.instance).f141826f = string4;
        gVar.mo54061a(a2);
        C54056h a3 = mo30394a(3, this.f69049g.getString(R.string.lens_info_panel_on_device_chip_listen_resume), bVar, str2);
        String string5 = this.f69049g.getString(R.string.lens_info_panel_on_device_chip_listen_resume_content_description);
        a3.copyOnWrite();
        string5.getClass();
        ((C54057i) a3.instance).f141826f = string5;
        gVar.mo54061a(a3);
        gVar.copyOnWrite();
        ((C54058j) gVar.instance).f141835f = 2;
        C54045cz l = m46681l(i);
        gVar.copyOnWrite();
        l.getClass();
        ((C54058j) gVar.instance).f141834e = l;
        gVar.copyOnWrite();
        ((C54058j) gVar.instance).f141838i = 1;
        return (C54058j) gVar.build();
    }

    /* renamed from: h */
    public final C54058j mo30401h(String str) {
        return mo30403j(str, this.f69049g.getString(R.string.lens_info_panel_on_device_chip_open_in_translate), f69034a, C58836b.f156633a);
    }

    /* renamed from: i */
    public final C54058j mo30402i(String str) {
        if (!this.f69050h.mo30907k()) {
            return null;
        }
        C54055g gVar = (C54055g) C54058j.f141828j.createBuilder();
        String o = mo30405o();
        gVar.copyOnWrite();
        o.getClass();
        ((C54058j) gVar.instance).f141830a = o;
        String string = this.f69049g.getString(R.string.lens_info_panel_on_device_chip_search);
        gVar.copyOnWrite();
        string.getClass();
        ((C54058j) gVar.instance).f141831b = string;
        String string2 = this.f69049g.getString(R.string.lens_info_panel_on_device_chip_search_content_description);
        gVar.copyOnWrite();
        string2.getClass();
        ((C54058j) gVar.instance).f141836g = string2;
        C53970ae k = mo30404k(f69041l);
        gVar.copyOnWrite();
        k.getClass();
        ((C54058j) gVar.instance).f141832c = k;
        C53951a aVar = (C53951a) C53992b.f141653e.createBuilder();
        aVar.copyOnWrite();
        ((C53992b) aVar.instance).f141657c = 1;
        String builder = f69048s.buildUpon().appendQueryParameter("q", str).toString();
        aVar.copyOnWrite();
        C53992b bVar = (C53992b) aVar.instance;
        builder.getClass();
        bVar.f141655a = 3;
        bVar.f141656b = builder;
        gVar.copyOnWrite();
        C53992b bVar2 = (C53992b) aVar.build();
        bVar2.getClass();
        ((C54058j) gVar.instance).f141833d = bVar2;
        gVar.copyOnWrite();
        ((C54058j) gVar.instance).f141835f = 2;
        C54045cz l = m46681l(61170);
        gVar.copyOnWrite();
        l.getClass();
        ((C54058j) gVar.instance).f141834e = l;
        return (C54058j) gVar.build();
    }

    /* renamed from: j */
    public final C54058j mo30403j(String str, String str2, C25353b bVar, C58833ax axVar) {
        if (!this.f69050h.mo30907k()) {
            return null;
        }
        C54055g gVar = (C54055g) C54058j.f141828j.createBuilder();
        String o = mo30405o();
        gVar.copyOnWrite();
        o.getClass();
        ((C54058j) gVar.instance).f141830a = o;
        gVar.copyOnWrite();
        str2.getClass();
        ((C54058j) gVar.instance).f141831b = str2;
        C53970ae k = mo30404k(bVar);
        gVar.copyOnWrite();
        k.getClass();
        ((C54058j) gVar.instance).f141832c = k;
        C53951a aVar = (C53951a) C53992b.f141653e.createBuilder();
        aVar.copyOnWrite();
        ((C53992b) aVar.instance).f141657c = 1;
        String q = m46685q("translate");
        String encode = Uri.encode(str);
        aVar.copyOnWrite();
        C53992b bVar2 = (C53992b) aVar.instance;
        bVar2.f141655a = 3;
        bVar2.f141656b = q.concat(String.valueOf(encode));
        gVar.copyOnWrite();
        C53992b bVar3 = (C53992b) aVar.build();
        bVar3.getClass();
        ((C54058j) gVar.instance).f141833d = bVar3;
        gVar.copyOnWrite();
        ((C54058j) gVar.instance).f141835f = 2;
        C54045cz l = m46681l(61796);
        gVar.copyOnWrite();
        l.getClass();
        ((C54058j) gVar.instance).f141834e = l;
        if (axVar.mo56113h()) {
            String str3 = (String) axVar.mo56107c();
            gVar.copyOnWrite();
            str3.getClass();
            ((C54058j) gVar.instance).f141836g = str3;
        }
        return (C54058j) gVar.build();
    }

    /* renamed from: k */
    public final C53970ae mo30404k(C25353b bVar) {
        String str;
        C53969ad adVar = (C53969ad) C53970ae.f141610b.createBuilder();
        if (this.f69054u) {
            str = ((C25352a) bVar).f69033b;
        } else {
            str = ((C25352a) bVar).f69032a;
        }
        adVar.copyOnWrite();
        ((C53970ae) adVar.instance).f141612a = str;
        return (C53970ae) adVar.build();
    }

    /* renamed from: o */
    public final String mo30405o() {
        return String.valueOf(this.f69053t.incrementAndGet());
    }
}
