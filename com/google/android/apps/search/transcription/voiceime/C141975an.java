package com.google.android.apps.search.transcription.voiceime;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.transcription.p10679ui.C141938e;
import com.google.android.apps.search.transcription.voiceime.C141981at;
import com.google.android.apps.search.transcription.voiceime.p10680a.C141961d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3659d.C47244m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.transcription.voiceime.an */
/* compiled from: PG */
public final class C141975an extends C142010m implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C141981at f385249a;

    /* renamed from: c */
    private Context f385250c;

    /* renamed from: d */
    private final C2393x f385251d = new C2393x(this);

    /* renamed from: e */
    private boolean f385252e;

    @Deprecated
    public C141975an() {
        C19559g.m37304c();
    }

    /* renamed from: f */
    public static C141975an m230484f(C141961d dVar) {
        C141975an anVar = new C141975an();
        C68324h.m98669f(anVar);
        C47243l.m84039a(anVar, dVar);
        return anVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo116934b() {
        return C47244m.m84042d(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f385250c == null) {
            this.f385250c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f385250c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f122869b.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f385251d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    /* renamed from: j */
    public final C141981at mo17754z() {
        C141981at atVar = this.f385249a;
        if (atVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f385252e) {
            return atVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141974am.m230483a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C141981at j = mo17754z();
            ((C59052c) ((C59052c) C141981at.f385258a.mo56224b()).mo56372aa(41986)).mo56388r("#onCreateView, request-id = %d", j.f385261d.f384722b);
            C141972ak akVar = j.f385264g;
            long j2 = j.f385261d.f384722b;
            C46723bg bgVar = akVar.f385239d;
            C142042v vVar = new C142042v(akVar, j2);
            C46719bc bcVar = new C46719bc(bgVar, vVar, "VoiceIME:transcriptionState:" + j2);
            View inflate = layoutInflater.inflate(R.layout.transcription_app_voice_ime_view, viewGroup, false);
            C141938e eVar = new C141938e(inflate);
            eVar.mo116913c();
            j.f385260c.mo50707a(bcVar, new C141981at.C141982a((TextView) inflate.findViewById(R.id.transcription_voice_ime_text), eVar, (TextView) inflate.findViewById(R.id.transcription_voice_ime_error_text)));
            ImageView imageView = (ImageView) inflate.findViewById(R.id.transcription_prev_ime);
            InputMethodManager inputMethodManager = (InputMethodManager) j.f385266i.getSystemService("input_method");
            if (inputMethodManager != null) {
                if (inputMethodManager.getEnabledInputMethodList() == null || inputMethodManager.getEnabledInputMethodList().size() > 1) {
                    imageView.setVisibility(0);
                    imageView.setOnClickListener(new C47591co(j.f385265h, "Clicked 'Previous IME' button to switch to previous IME", new C141976ao(j)));
                    ((ImageView) inflate.findViewById(R.id.transcription_voice_ime_settings_button)).setOnClickListener(new C47591co(j.f385265h, "Clicked 'settings button' button to enter settings", new C141977ap(j)));
                    C47831fm.m85019n();
                    return inflate;
                }
            }
            imageView.setVisibility(4);
            ((ImageView) inflate.findViewById(R.id.transcription_voice_ime_settings_button)).setOnClickListener(new C47591co(j.f385265h, "Clicked 'settings button' button to enter settings", new C141977ap(j)));
            C47831fm.m85019n();
            return inflate;
        } catch (Throwable th) {
            C141974am.m230483a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f385252e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C141974am.m230483a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C141974am.m230483a(th, th);
        }
        throw th;
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        this.f122869b.mo51381i();
        try {
            if (!this.f385252e) {
                super.onAttach(context);
                if (this.f385249a == null) {
                    this.f385249a = ((C141983au) mo116966a().mo17653jN()).mo116941M();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f385251d));
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f122869b;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C141974am.m230483a(th, th2);
            }
            throw th;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
