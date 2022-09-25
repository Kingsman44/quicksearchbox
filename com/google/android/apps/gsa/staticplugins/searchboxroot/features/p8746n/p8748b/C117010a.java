package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n.p8748b;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86318i;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.searchbox.p6944c.p6945a.C88544d;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89203h;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89204i;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89205j;
import com.google.android.apps.gsa.shared.p7066m.C89995ba;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.searchbox.shared.p3200a.C41641b;
import com.google.common.p4552o.amt;
import com.google.common.p4552o.anm;
import com.google.common.p4552o.ann;
import com.google.common.p4552o.ano;
import com.google.common.p4552o.anq;
import com.google.common.p4552o.anr;
import com.google.common.p4552o.aoa;
import com.google.common.p4552o.aob;
import com.google.common.p4552o.apd;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.b.a */
/* compiled from: PG */
public final class C117010a extends C41641b implements C89203h, C89204i {

    /* renamed from: a */
    private C89205j f324833a;

    /* renamed from: b */
    private final C68214a f324834b;

    /* renamed from: c */
    private final C86124t f324835c;

    /* renamed from: d */
    private final C21370a f324836d;

    /* renamed from: e */
    private final C88544d f324837e = new C88544d("IPA");

    public C117010a(C68214a aVar, C86124t tVar, C21370a aVar2) {
        this.f324834b = aVar;
        this.f324835c = tVar;
        this.f324836d = aVar2;
    }

    /* renamed from: a */
    public final synchronized void mo103094a() {
        C89205j jVar = this.f324833a;
        if (jVar != null) {
            jVar.mo83169i("YOUTUBE_VIDEO_FILTERED_OUT_COUNT");
        }
    }

    /* renamed from: c */
    public final synchronized void mo103095c(boolean z) {
        C89205j jVar = this.f324833a;
        if (jVar != null) {
            jVar.mo83170j("IS_YOUTUBE_DATA_CACHE", z);
        }
    }

    /* renamed from: e */
    public final void mo78004e() {
    }

    /* renamed from: f */
    public final synchronized void mo44231f(amt amt) {
        if (this.f324833a != null) {
            anr anr = ((apd) amt.instance).f159624p;
            if (anr == null) {
                anr = anr.f159389m;
            }
            anm anm = (anm) anr.toBuilder();
            aob aob = ((anr) anm.instance).f159392b;
            if (aob == null) {
                aob = aob.f159424i;
            }
            aoa aoa = (aoa) aob.toBuilder();
            if (this.f324833a.mo83177q("CANCELLED_RESPONSE_COUNT")) {
                int a = this.f324833a.mo83161a("CANCELLED_RESPONSE_COUNT");
                aoa.copyOnWrite();
                aob aob2 = (aob) aoa.instance;
                aob2.f159426a |= 1;
                aob2.f159427b = a;
            }
            if (this.f324833a.mo83177q("CONTACT_ACTIONS_CP2_CURSOR_EMPTY_COUNT")) {
                int a2 = this.f324833a.mo83161a("CONTACT_ACTIONS_CP2_CURSOR_EMPTY_COUNT");
                anm.copyOnWrite();
                anr anr2 = (anr) anm.instance;
                anr2.f159391a |= 1024;
                anr2.f159393c = a2;
            }
            if (this.f324833a.mo83177q("ZERO_CONTACT_METHODS_FROM_CP2_COUNT")) {
                int a3 = this.f324833a.mo83161a("ZERO_CONTACT_METHODS_FROM_CP2_COUNT");
                anm.copyOnWrite();
                anr anr3 = (anr) anm.instance;
                anr3.f159391a |= 2048;
                anr3.f159394d = a3;
            }
            if (this.f324833a.mo83177q("LOOKUP_KEY_NOT_FOUND_CONTACT_METHODS_SUGGEST_COUNT")) {
                int a4 = this.f324833a.mo83161a("LOOKUP_KEY_NOT_FOUND_CONTACT_METHODS_SUGGEST_COUNT");
                anm.copyOnWrite();
                anr anr4 = (anr) anm.instance;
                anr4.f159391a |= 4096;
                anr4.f159395e = a4;
            }
            if (this.f324833a.mo83177q("YOUTUBE_VIDEO_FILTERED_OUT_COUNT")) {
                int a5 = this.f324833a.mo83161a("YOUTUBE_VIDEO_FILTERED_OUT_COUNT");
                anm.copyOnWrite();
                anr anr5 = (anr) anm.instance;
                anr5.f159391a |= 8192;
                anr5.f159396f = a5;
            }
            if (this.f324833a.mo83177q("MERGE_NAV_APP_SUGGEST_COUNT")) {
                int a6 = this.f324833a.mo83161a("MERGE_NAV_APP_SUGGEST_COUNT");
                anm.copyOnWrite();
                anr anr6 = (anr) anm.instance;
                anr6.f159391a |= 16384;
                anr6.f159397g = a6;
            }
            if (this.f324833a.mo83177q("MDH_YOUTUBE_DURATION_MSEC")) {
                int a7 = this.f324833a.mo83161a("MDH_YOUTUBE_DURATION_MSEC");
                anm.copyOnWrite();
                anr anr7 = (anr) anm.instance;
                anr7.f159391a |= C89885b.S3REQUEST_VALUE;
                anr7.f159398h = a7;
            }
            if (this.f324833a.mo83177q("MDH_YOUTUBE_SOURCE")) {
                int a8 = anq.m92442a(this.f324833a.mo83161a("MDH_YOUTUBE_SOURCE"));
                anm.copyOnWrite();
                anr anr8 = (anr) anm.instance;
                int i = a8 - 1;
                if (a8 != 0) {
                    anr8.f159399i = i;
                    anr8.f159391a |= C89885b.HTTP_VALUE;
                } else {
                    throw null;
                }
            }
            if (this.f324833a.mo83177q("IS_YOUTUBE_DATA_CACHE")) {
                boolean r = this.f324833a.mo83178r("IS_YOUTUBE_DATA_CACHE");
                anm.copyOnWrite();
                anr anr9 = (anr) anm.instance;
                anr9.f159391a |= C89885b.NOW_VALUE;
                anr9.f159401k = r;
            }
            if (this.f324833a.mo83177q("YOUTUBE_DELETION_STATE")) {
                int a9 = this.f324833a.mo83161a("YOUTUBE_DELETION_STATE");
                anm.copyOnWrite();
                anr anr10 = (anr) anm.instance;
                anr10.f159391a |= 4194304;
                anr10.f159402l = a9;
            }
            int a10 = this.f324837e.mo82207a();
            aoa.copyOnWrite();
            aob aob3 = (aob) aoa.instance;
            aob3.f159426a |= 2;
            aob3.f159428c = a10;
            int b = this.f324837e.mo82208b();
            aoa.copyOnWrite();
            aob aob4 = (aob) aoa.instance;
            aob4.f159426a |= 4;
            aob4.f159429d = b;
            String c = this.f324837e.mo82209c();
            aoa.copyOnWrite();
            aob aob5 = (aob) aoa.instance;
            aob5.f159426a |= 8;
            aob5.f159430e = c;
            anm.copyOnWrite();
            anr anr11 = (anr) anm.instance;
            aob aob6 = (aob) aoa.build();
            aob6.getClass();
            anr11.f159392b = aob6;
            anr11.f159391a |= 2;
            if (this.f324835c.mo79746e(C89995ba.f246756d)) {
                ann ann = (ann) ano.f159377j.createBuilder();
                if (this.f324833a.mo83177q("APPS_NEW_MORE_THAN_OLD")) {
                    int a11 = this.f324833a.mo83161a("APPS_NEW_MORE_THAN_OLD");
                    ann.copyOnWrite();
                    ano ano = (ano) ann.instance;
                    ano.f159379a |= 1;
                    ano.f159380b = a11;
                }
                if (this.f324833a.mo83177q("APPS_OLD_MORE_THAN_NEW")) {
                    int a12 = this.f324833a.mo83161a("APPS_OLD_MORE_THAN_NEW");
                    ann.copyOnWrite();
                    ano ano2 = (ano) ann.instance;
                    ano2.f159379a |= 2;
                    ano2.f159381c = a12;
                }
                if (this.f324833a.mo83177q("APPS_NEW_AND_OLD_SAME")) {
                    int a13 = this.f324833a.mo83161a("APPS_NEW_AND_OLD_SAME");
                    ann.copyOnWrite();
                    ano ano3 = (ano) ann.instance;
                    ano3.f159379a |= 4;
                    ano3.f159382d = a13;
                }
                if (this.f324833a.mo83177q("APPS_NEW_MORE_THAN_ZERO_OLD")) {
                    int a14 = this.f324833a.mo83161a("APPS_NEW_MORE_THAN_ZERO_OLD");
                    ann.copyOnWrite();
                    ano ano4 = (ano) ann.instance;
                    ano4.f159379a |= 16;
                    ano4.f159384f = a14;
                }
                if (this.f324833a.mo83177q("APPS_OLD_MORE_THAN_ZERO_NEW")) {
                    int a15 = this.f324833a.mo83161a("APPS_OLD_MORE_THAN_ZERO_NEW");
                    ann.copyOnWrite();
                    ano ano5 = (ano) ann.instance;
                    ano5.f159379a |= 8;
                    ano5.f159383e = a15;
                }
                if (this.f324833a.mo83177q("APPS_NEW_AND_OLD_SAME_ZERO")) {
                    int a16 = this.f324833a.mo83161a("APPS_NEW_AND_OLD_SAME_ZERO");
                    ann.copyOnWrite();
                    ano ano6 = (ano) ann.instance;
                    ano6.f159379a |= 32;
                    ano6.f159385g = a16;
                }
                C86338r a17 = ((C86318i) this.f324834b.mo27525b()).mo80039a("ipa", "IpaBgTask");
                if (a17.getInt("status_ipa_bg_task_run_5", 0) > 0) {
                    int i2 = a17.getInt("status_ipa_bg_task_run_5", 0);
                    ann.copyOnWrite();
                    ano ano7 = (ano) ann.instance;
                    ano7.f159379a |= 64;
                    ano7.f159386h = i2;
                }
                if (a17.getLong("last_time_ipa_bg_task_run_5", 0) > 0) {
                    long b2 = this.f324836d.mo26870b();
                    long j = a17.getLong("last_time_ipa_bg_task_run_5", 0);
                    ann.copyOnWrite();
                    ano ano8 = (ano) ann.instance;
                    ano8.f159379a |= 128;
                    ano8.f159387i = b2 - j;
                }
                anm.copyOnWrite();
                anr anr12 = (anr) anm.instance;
                ano ano9 = (ano) ann.build();
                ano9.getClass();
                anr12.f159400j = ano9;
                anr12.f159391a |= 1048576;
            }
            amt.copyOnWrite();
            apd apd = (apd) amt.instance;
            anr anr13 = (anr) anm.build();
            anr13.getClass();
            apd.f159624p = anr13;
            apd.f159583a |= 16384;
        }
    }

    /* renamed from: g */
    public final synchronized void mo103096g(int i) {
        C89205j jVar = this.f324833a;
        if (jVar != null) {
            jVar.mo83171k("MDH_YOUTUBE_DURATION_MSEC", i);
        }
    }

    /* renamed from: h */
    public final synchronized void mo103097h(int i) {
        C89205j jVar = this.f324833a;
        if (jVar != null) {
            jVar.mo83171k("YOUTUBE_DELETION_STATE", i);
        }
    }

    /* renamed from: hC */
    public final void mo78005hC(C89205j jVar) {
        this.f324833a = jVar;
        this.f324837e.f239315a = jVar;
    }

    /* renamed from: hE */
    public final synchronized void mo78006hE() {
        C89205j jVar = this.f324833a;
        if (jVar != null) {
            jVar.mo83168h();
            this.f324837e.mo82211e();
        }
    }

    /* renamed from: i */
    public final synchronized void mo103098i(int i, int i2) {
        C89205j jVar = this.f324833a;
        if (jVar == null) {
            return;
        }
        if (i == i2) {
            if (i == 0) {
                jVar.mo83169i("APPS_NEW_AND_OLD_SAME_ZERO");
            } else {
                jVar.mo83169i("APPS_NEW_AND_OLD_SAME");
            }
        } else if (i > i2) {
            if (i2 == 0) {
                jVar.mo83169i("APPS_OLD_MORE_THAN_ZERO_NEW");
            } else {
                jVar.mo83169i("APPS_OLD_MORE_THAN_NEW");
            }
        } else if (i == 0) {
            jVar.mo83169i("APPS_NEW_MORE_THAN_ZERO_OLD");
        } else {
            jVar.mo83169i("APPS_NEW_MORE_THAN_OLD");
        }
    }

    /* renamed from: j */
    public final synchronized void mo103099j(int i) {
        C89205j jVar = this.f324833a;
        if (jVar != null) {
            jVar.mo83171k("MDH_YOUTUBE_SOURCE", i - 1);
        }
    }
}
