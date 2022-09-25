package com.google.android.apps.search.googleapp.search.voicesearch.settings;

import android.content.Context;
import android.content.res.Resources;
import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.h.u.d;
import com.google.android.apps.gsa.h.u.e;
import com.google.android.apps.gsa.h.u.f;
import com.google.android.apps.search.googleapp.p10536x.C139858a;
import com.google.android.apps.search.googleapp.search.voicesearch.p10468b.C138717c;
import com.google.android.apps.search.googleapp.search.voicesearch.p10468b.C138720f;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
public final class VoiceMatchSettingUiElement implements C139858a {

    /* renamed from: a */
    public static final C59071e f377729a = C59071e.m91332i("com.google.android.apps.search.googleapp.search.voicesearch.settings.VoiceMatchSettingUiElement");

    /* renamed from: b */
    public final d f377730b;

    /* renamed from: c */
    public final C46440f f377731c = new C138865a();

    /* renamed from: d */
    public final C62921ba f377732d;

    /* renamed from: e */
    private final Resources f377733e;

    /* renamed from: f */
    private final C138717c f377734f;

    /* renamed from: g */
    private final C46439e f377735g;

    /* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.settings.VoiceMatchSettingUiElement$a */
    /* compiled from: PG */
    final class C138865a implements C46440f {
        public C138865a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            ((C59052c) ((C59052c) ((C59052c) VoiceMatchSettingUiElement.f377729a.mo56226d()).mo56382g(th)).mo56372aa(41304)).mo56386p("Error acquiring ClassicVoiceMatchOptions");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            C138720f fVar = (C138720f) ((ProtoParsers.ParcelableProto) obj2).mo58938a(C138720f.f377293d, VoiceMatchSettingUiElement.this.f377732d.mo58829b());
            d dVar = VoiceMatchSettingUiElement.this.f377730b;
            e createBuilder = f.d.createBuilder();
            boolean z = fVar.f377296b;
            createBuilder.copyOnWrite();
            f fVar2 = createBuilder.instance;
            fVar2.a |= 1;
            fVar2.b = z;
            boolean z2 = fVar.f377297c;
            createBuilder.copyOnWrite();
            f fVar3 = createBuilder.instance;
            fVar3.a |= 2;
            fVar3.c = z2;
            dVar.mo41490e(createBuilder.build());
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public VoiceMatchSettingUiElement(Fragment fragment, Context context, d dVar, C138717c cVar, final C46439e eVar, C62921ba baVar) {
        this.f377733e = context.getResources();
        this.f377730b = dVar;
        this.f377734f = cVar;
        this.f377735g = eVar;
        this.f377732d = baVar;
        fragment.getLifecycle().mo5790b(new C2376g() {
            /* renamed from: gV */
            public final void mo3520gV(C2391v vVar) {
                eVar.mo50429i(VoiceMatchSettingUiElement.this.f377731c);
            }

            /* renamed from: gW */
            public final /* synthetic */ void mo3521gW(C2391v vVar) {
            }

            /* renamed from: gX */
            public final /* synthetic */ void mo3522gX(C2391v vVar) {
            }

            /* renamed from: gY */
            public final /* synthetic */ void mo3523gY(C2391v vVar) {
            }

            /* renamed from: gZ */
            public final /* synthetic */ void mo3524gZ(C2391v vVar) {
            }

            /* renamed from: ha */
            public final /* synthetic */ void mo3525ha(C2391v vVar) {
            }
        });
    }

    /* renamed from: a */
    public final int mo111452a() {
        return 142885;
    }

    /* renamed from: b */
    public final int mo111854b() {
        return -1;
    }

    /* renamed from: g */
    public final String mo111457g() {
        return this.f377733e.getString(R.string.googleapp_voice_settings_voice_match_setting_summary);
    }

    /* renamed from: j */
    public final String mo111460j() {
        return this.f377733e.getString(R.string.googleapp_voice_settings_voice_match_setting_title);
    }

    /* renamed from: l */
    public final boolean mo111462l() {
        return true;
    }

    /* renamed from: m */
    public final boolean mo111463m() {
        return false;
    }

    /* renamed from: o */
    public final C60870cx mo111855o() {
        C46439e eVar = this.f377735g;
        C46438d a = C46438d.m82809a(this.f377734f.mo103998a());
        eVar.mo50428h(a.f121541a, (Object) null, this.f377731c);
        return C60866ct.f164955a;
    }
}
