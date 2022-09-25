package com.google.android.apps.search.transcription.voiceime;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.search.transcription.C141741b;
import com.google.android.apps.search.transcription.p10666b.C141743b;
import com.google.android.apps.search.transcription.p10666b.C141761t;
import com.google.android.apps.search.transcription.p10670f.p10673b.C141832x;
import com.google.android.apps.search.transcription.p10679ui.C141938e;
import com.google.android.apps.search.transcription.voiceime.p10680a.C141961d;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p3186j$.util.concurrent.atomic.DesugarAtomicLong;

/* renamed from: com.google.android.apps.search.transcription.voiceime.at */
/* compiled from: PG */
public final class C141981at {

    /* renamed from: a */
    public static final C59071e f385258a = C59071e.m91332i("com.google.android.apps.search.transcription.voiceime.at");

    /* renamed from: b */
    public final Fragment f385259b;

    /* renamed from: c */
    public final C46801dp f385260c;

    /* renamed from: d */
    public final C141741b f385261d;

    /* renamed from: e */
    public final String f385262e;

    /* renamed from: f */
    public final C141993bd f385263f;

    /* renamed from: g */
    public final C141972ak f385264g;

    /* renamed from: h */
    public final C47770dh f385265h;

    /* renamed from: i */
    public final Context f385266i;

    /* renamed from: j */
    public final C142006i f385267j;

    /* renamed from: com.google.android.apps.search.transcription.voiceime.at$a */
    /* compiled from: PG */
    final class C141982a implements C46792di {

        /* renamed from: b */
        private final TextView f385269b;

        /* renamed from: c */
        private final C141938e f385270c;

        /* renamed from: d */
        private final TextView f385271d;

        /* renamed from: e */
        private C141832x f385272e = C141832x.m230155k().mo116762a();

        public C141982a(TextView textView, C141938e eVar, TextView textView2) {
            this.f385269b = textView;
            this.f385270c = eVar;
            this.f385271d = textView2;
        }

        /* renamed from: d */
        private final void m230492d(View.OnClickListener onClickListener, String str) {
            this.f385269b.setOnClickListener(onClickListener);
            this.f385270c.mo116911a(onClickListener, str);
            this.f385271d.setOnClickListener(onClickListener);
        }

        /* renamed from: e */
        private final void m230493e() {
            C141981at atVar = C141981at.this;
            m230492d(new C47591co(atVar.f385265h, "Clicked 'mic image' to start listening", new C141978aq(this)), atVar.f385259b.getString(R.string.transcription_app_voice_ime_tap_to_speak));
            this.f385269b.setText(R.string.transcription_app_voice_ime_tap_to_speak);
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C141981at.f385258a.mo56226d()).mo56382g(th)).mo56372aa(41982)).mo56388r("#onError, request-id = %d", C141981at.this.f385261d.f384722b);
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C141832x xVar = (C141832x) obj;
            long j = C141981at.this.f385261d.f384722b;
            if (this.f385272e.mo116774c() == null) {
                C141743b c = xVar.mo116774c();
                if (c != null) {
                    ((C59052c) ((C59052c) C141981at.f385258a.mo56224b()).mo56372aa(41985)).mo56389s("Showing error %s", c);
                    this.f385271d.setText(C141761t.m229997a(C141981at.this.f385266i, c, false));
                    if (c.mo116705d() == 2 || c.mo116705d() == 8) {
                        this.f385270c.mo116913c();
                    } else {
                        this.f385270c.mo116912b();
                        this.f385271d.setImportantForAccessibility(1);
                        this.f385271d.sendAccessibilityEvent(128);
                    }
                    m230493e();
                    this.f385272e = xVar;
                    return;
                }
                if (xVar.mo116783j() && !this.f385272e.mo116783j()) {
                    C141972ak akVar = C141981at.this.f385264g;
                    if (C141972ak.f385236a.compareTo(Duration.ofMillis(akVar.f385245j.mo26870b() - akVar.f385247l.get())) < 0) {
                        Toast.makeText(C141981at.this.f385266i, R.string.transcription_app_voice_ime_audio_rationale_message, 1).show();
                        C141981at atVar = C141981at.this;
                        C141972ak akVar2 = atVar.f385264g;
                        long j2 = atVar.f385261d.f384722b;
                        akVar2.f385243h.mo46039a(new C142044x(DesugarAtomicLong.updateAndGet(akVar2.f385247l, new C142043w(akVar2))), akVar2.f385242g);
                    }
                }
                if (xVar.mo116772a() != this.f385272e.mo116772a()) {
                    C141938e eVar = this.f385270c;
                    eVar.f385158b.mo116900a(xVar.mo116772a());
                }
                if (!Objects.equals(xVar.mo116779g(), this.f385272e.mo116779g())) {
                    if (Objects.equals(xVar.mo116779g(), false)) {
                        this.f385270c.mo116913c();
                        m230493e();
                    } else if (Objects.equals(xVar.mo116779g(), true)) {
                        this.f385270c.mo116914d();
                        C141938e eVar2 = this.f385270c;
                        C141981at atVar2 = C141981at.this;
                        eVar2.mo116911a(new C47591co(atVar2.f385265h, "Clicked 'mic image' to stop listening", new C141979ar(this)), atVar2.f385259b.getString(R.string.transcription_app_voice_ime_tap_to_pause));
                        this.f385269b.setText(R.string.transcription_app_start_speaking);
                    }
                }
                if (xVar.mo116782i() != this.f385272e.mo116782i() && xVar.mo116782i() && Objects.equals(xVar.mo116779g(), true)) {
                    this.f385269b.setText(R.string.transcription_app_voice_ime_tap_to_pause);
                    C141981at atVar3 = C141981at.this;
                    m230492d(new C47591co(atVar3.f385265h, "Clicked 'Tap to pause' to stop listening", new C141980as(this)), atVar3.f385259b.getString(R.string.transcription_app_voice_ime_tap_to_pause));
                }
                this.f385272e = xVar;
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C141981at(Fragment fragment, C46801dp dpVar, C141961d dVar, C141993bd bdVar, C141972ak akVar, C47770dh dhVar, Context context, C142006i iVar) {
        this.f385259b = fragment;
        this.f385260c = dpVar;
        C141741b bVar = dVar.f385219b;
        this.f385261d = bVar == null ? C141741b.f384719d : bVar;
        this.f385262e = dVar.f385220c;
        this.f385263f = bdVar;
        this.f385264g = akVar;
        this.f385265h = dhVar;
        this.f385266i = context;
        this.f385267j = iVar;
    }
}
