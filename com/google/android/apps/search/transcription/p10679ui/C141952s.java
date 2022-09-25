package com.google.android.apps.search.transcription.p10679ui;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.search.transcription.C141734a;
import com.google.android.apps.search.transcription.C141741b;
import com.google.android.apps.search.transcription.p10666b.C141743b;
import com.google.android.apps.search.transcription.p10666b.C141761t;
import com.google.android.apps.search.transcription.p10670f.C141786ae;
import com.google.android.apps.search.transcription.p10670f.C141806ay;
import com.google.android.apps.search.transcription.p10670f.C141853bu;
import com.google.android.apps.search.transcription.p10670f.C141921o;
import com.google.android.apps.search.transcription.p10670f.p10673b.C141829u;
import com.google.android.apps.search.transcription.p10670f.p10673b.C141831w;
import com.google.android.apps.search.transcription.p10670f.p10673b.C141832x;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4575r.C60752i;
import java.util.ArrayList;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.transcription.ui.s */
/* compiled from: PG */
public final class C141952s {

    /* renamed from: a */
    public static final C59071e f385185a = C59071e.m91332i("com.google.android.apps.search.transcription.ui.s");

    /* renamed from: b */
    public final Activity f385186b;

    /* renamed from: c */
    public final C141829u f385187c;

    /* renamed from: d */
    public final C46801dp f385188d;

    /* renamed from: e */
    public final C47770dh f385189e;

    /* renamed from: f */
    public final C141741b f385190f;

    /* renamed from: g */
    private final C141947n f385191g;

    /* renamed from: h */
    private final C141853bu f385192h;

    /* renamed from: com.google.android.apps.search.transcription.ui.s$a */
    /* compiled from: PG */
    final class C141953a implements C46792di {

        /* renamed from: b */
        private final TextView f385194b;

        /* renamed from: c */
        private final TextView f385195c;

        /* renamed from: d */
        private final C141938e f385196d;

        /* renamed from: e */
        private final Button f385197e;

        /* renamed from: f */
        private final C141940g f385198f;

        /* renamed from: g */
        private C141832x f385199g = C141832x.m230155k().mo116762a();

        /* renamed from: h */
        private boolean f385200h = false;

        public C141953a(TextView textView, TextView textView2, C141938e eVar, Button button) {
            this.f385194b = textView;
            this.f385195c = textView2;
            this.f385196d = eVar;
            this.f385197e = button;
            this.f385198f = new C141940g(textView2.getContext(), textView2.getPaint());
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C141952s.f385185a.mo56226d()).mo56382g(th)).mo56372aa(41958)).mo56386p("#onError");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C141832x xVar = (C141832x) obj;
            String h = xVar.mo116780h();
            if (h != null && !h.equals(this.f385199g.mo116780h())) {
                this.f385194b.setText(xVar.mo116780h());
            }
            if (!Objects.equals(xVar.mo116774c(), this.f385199g.mo116774c()) && xVar.mo116774c() != null) {
                C141743b c = xVar.mo116774c();
                this.f385196d.mo116912b();
                C141938e eVar = this.f385196d;
                C141952s sVar = C141952s.this;
                eVar.mo116911a(new C47591co(sVar.f385189e, "Clicked 'mic image' to restart", new C141950q(this)), sVar.f385186b.getString(R.string.transcription_app_tap_to_try_again));
                this.f385197e.setVisibility(0);
                this.f385197e.setEnabled(true);
                TextView textView = this.f385195c;
                Activity activity = C141952s.this.f385186b;
                textView.setText(C141761t.m229997a(activity, c, C141786ae.m230053g(activity.getIntent())));
                this.f385195c.setImportantForAccessibility(1);
                this.f385195c.sendAccessibilityEvent(128);
            }
            if (xVar.mo116774c() != null) {
                this.f385199g = xVar;
                return;
            }
            if (!Objects.equals(xVar.mo116776e(), this.f385199g.mo116776e()) || xVar.mo116782i() != this.f385199g.mo116782i()) {
                C141831w f = this.f385199g.mo116778f();
                f.mo116770i(xVar.mo116776e());
                this.f385199g = f.mo116762a();
                C141806ay e = xVar.mo116776e();
                if (e == null || (e.f384848b.isEmpty() && e.f384849c.isEmpty())) {
                    if (xVar.mo116782i()) {
                        this.f385195c.setText(R.string.transcription_app_big_ellipsis);
                    }
                } else if (C2043bi.m5570ax(this.f385195c)) {
                    mo116925d();
                } else if (!this.f385200h) {
                    this.f385200h = true;
                    this.f385195c.getViewTreeObserver().addOnGlobalLayoutListener(new C141951r(this));
                }
            }
            if (xVar.mo116772a() != this.f385199g.mo116772a()) {
                C141938e eVar2 = this.f385196d;
                eVar2.f385158b.mo116900a(xVar.mo116772a());
            }
            if (!Objects.equals(xVar.mo116779g(), this.f385199g.mo116779g()) || !Objects.equals(xVar.mo116775d(), this.f385199g.mo116775d()) || !Objects.equals(xVar.mo116773b(), this.f385199g.mo116773b())) {
                if (xVar.mo116775d() != null && xVar.mo116773b() != null) {
                    C141938e eVar3 = this.f385196d;
                    eVar3.f385157a.setVisibility(4);
                    eVar3.f385159c.setImageDrawable(eVar3.f385162f);
                    eVar3.f385160d.setBackgroundResource(R.drawable.transcription_intent_api_green_ring);
                    eVar3.f385158b.setEnabled(false);
                    this.f385196d.mo116911a((View.OnClickListener) null, (String) null);
                    C141952s.this.mo116923a(xVar.mo116775d(), xVar.mo116773b());
                } else if (Objects.equals(xVar.mo116779g(), false)) {
                    C141938e eVar4 = this.f385196d;
                    eVar4.f385157a.setVisibility(0);
                    eVar4.f385159c.setImageDrawable(eVar4.f385161e);
                    eVar4.f385160d.setBackgroundResource(R.drawable.transcription_intent_api_initializing_mic_ring);
                    eVar4.f385158b.setEnabled(false);
                } else if (Objects.equals(xVar.mo116779g(), true)) {
                    this.f385196d.mo116914d();
                }
            }
            this.f385199g = xVar;
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }

        /* renamed from: d */
        public final void mo116925d() {
            int following;
            C141806ay e = this.f385199g.mo116776e();
            ((C59052c) ((C59052c) C141952s.f385185a.mo56224b()).mo56372aa(41959)).mo56354G("#setLatestRecognizedText stableText: %s, pendingText: %s", e.f384848b, e.f384849c);
            C141940g gVar = this.f385198f;
            TextView textView = this.f385195c;
            int width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight();
            int i = 0;
            if (gVar.f385170e != width) {
                gVar.f385169d = 0;
                gVar.f385170e = width;
            }
            C141940g gVar2 = this.f385198f;
            String str = e.f384848b;
            String str2 = e.f384849c;
            String concat = String.valueOf(str).concat(String.valueOf(str2));
            int i2 = gVar2.f385169d;
            if (i2 > concat.length()) {
                gVar2.f385169d = 0;
                i2 = 0;
            }
            if (gVar2.mo116915a(concat.substring(i2)).getLineCount() > 2) {
                gVar2.f385167b.setText(concat);
                while (gVar2.mo116915a("…".concat(String.valueOf(concat.substring(gVar2.f385169d).trim()))).getLineCount() > 2 && (following = gVar2.f385167b.following(gVar2.f385169d)) != -1) {
                    gVar2.f385169d = following;
                }
            }
            gVar2.f385166a.clear();
            gVar2.f385166a.clearSpans();
            if (gVar2.f385169d > 0) {
                gVar2.f385166a.append("…");
            }
            gVar2.f385166a.append(concat.substring(gVar2.f385169d).trim());
            if (str2.length() < gVar2.f385166a.length()) {
                i = gVar2.f385166a.length() - str2.length();
            }
            if (i != gVar2.f385166a.length()) {
                SpannableStringBuilder spannableStringBuilder = gVar2.f385166a;
                spannableStringBuilder.setSpan(gVar2.f385168c, i, spannableStringBuilder.length(), 33);
            }
            this.f385195c.setText(new SpannedString(this.f385198f.f385166a));
        }
    }

    public C141952s(Activity activity, C141829u uVar, C46801dp dpVar, C47770dh dhVar, C141741b bVar, C141947n nVar, C141853bu buVar) {
        this.f385186b = activity;
        this.f385187c = uVar;
        this.f385188d = dpVar;
        this.f385189e = dhVar;
        this.f385190f = bVar;
        this.f385191g = nVar;
        this.f385192h = buVar;
    }

    /* renamed from: a */
    public final void mo116923a(C141921o oVar, Uri uri) {
        Intent intent = new Intent();
        intent.putStringArrayListExtra("android.speech.extra.RESULTS", new ArrayList(oVar.f385104a));
        intent.putExtra("android.speech.extra.CONFIDENCE_SCORES", C60752i.m92732f(oVar.f385105b));
        intent.putExtra("query", (String) oVar.f385104a.get(0));
        if (!Objects.equals(uri, Uri.EMPTY)) {
            intent.setData(uri);
            intent.setFlags(1);
        }
        Intent intent2 = this.f385186b.getIntent();
        PendingIntent pendingIntent = (PendingIntent) intent2.getParcelableExtra("android.speech.extra.RESULTS_PENDINGINTENT");
        if (pendingIntent == null) {
            this.f385186b.setResult(-1, intent);
            this.f385186b.finish();
            return;
        }
        Bundle bundleExtra = intent2.getBundleExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE");
        if (bundleExtra != null) {
            intent.putExtras(bundleExtra);
        }
        try {
            pendingIntent.send(this.f385186b, -1, intent);
        } catch (PendingIntent.CanceledException e) {
            ((C59052c) ((C59052c) ((C59052c) f385185a.mo56225c()).mo56382g(e)).mo56372aa(41960)).mo56386p("Not possible to start pending intent");
        } finally {
            this.f385186b.finish();
        }
    }

    /* renamed from: b */
    public final void mo116924b() {
        C0154a aVar = new C0154a(this.f385191g.getParentFragment().getChildFragmentManager());
        C141853bu buVar = this.f385192h;
        long j = this.f385190f.f384722b;
        C141734a aVar2 = (C141734a) C141741b.f384719d.createBuilder();
        long incrementAndGet = buVar.f384949a.incrementAndGet();
        aVar2.copyOnWrite();
        C141741b bVar = (C141741b) aVar2.instance;
        bVar.f384721a |= 1;
        bVar.f384722b = incrementAndGet;
        aVar2.copyOnWrite();
        C141741b bVar2 = (C141741b) aVar2.instance;
        bVar2.f384721a |= 2;
        bVar2.f384723c = j;
        aVar.mo689v(R.id.transcription_fragment_container, C141947n.m230436f((C141741b) aVar2.build()), "transcriptionFragment");
        aVar.mo509f();
    }
}
