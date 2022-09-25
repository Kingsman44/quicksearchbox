package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9849e;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.LogoView;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9734a.C128567c;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.p9738b.C128583a;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.p9738b.C128584b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47244m;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47577ca;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.e.b */
/* compiled from: PG */
public final class C129766b extends C129782q implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C129776l f356075a;

    /* renamed from: c */
    private Context f356076c;

    /* renamed from: d */
    private final C2393x f356077d = new C2393x(this);

    /* renamed from: e */
    private boolean f356078e;

    @Deprecated
    public C129766b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C129776l mo17754z() {
        C129776l lVar = this.f356075a;
        if (lVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f356078e) {
            return lVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo109241b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f356076c == null) {
            this.f356076c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f356076c;
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
        return this.f356077d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129765a.m211855a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C129776l a = mo17754z();
            ((C59052c) ((C59052c) C129776l.f356094a.mo56224b()).mo56372aa(38459)).mo56386p("ImmersiveCanvasPlatePeer onCreate called");
            a.mo109249c();
            a.f356099f.mo50828h(R.id.assistant_canvas_plate_transcription_subscription, a.f356097d.mo107945d(), new C129769e(a));
            a.f356099f.mo50828h(R.id.assistant_canvas_p6glow_container, a.f356098e.mo108053a(), new C129770f(a));
            a.f356100g.mo50429i(a.f356101h);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129765a.m211855a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C129776l a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.assistant_immersive_canvas_plate, viewGroup, false);
            a.f356104k.mo108810b(151866, inflate.findViewById(R.id.assistant_canvas_plate_keyboard_indicator));
            a.f356104k.mo108810b(158124, inflate.findViewById(R.id.assistant_canvas_plate_send_button));
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C129765a.m211855a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f356078e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C129765a.m211855a(th, th);
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
            C129765a.m211855a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C129776l a = mo17754z();
            C47393f.m84233d(this, C128584b.class, new C129778m(a));
            C47393f.m84233d(this, C128583a.class, new C129779n(a));
            this.f54442o.mo24720k(bundle);
            C129776l a2 = mo17754z();
            ImageView a3 = C129776l.m211869a(a2.f356095b);
            LogoView logoView = (LogoView) a2.f356095b.requireView().findViewById(R.id.assistant_canvas_plate_mic_button_toggle);
            ImageView b = C129776l.m211870b(a2.f356095b);
            EditText editText = (EditText) a2.f356095b.requireView().findViewById(R.id.assistant_canvas_plate_input_text);
            if (a2.f356103j.mo109220b()) {
                a3.setVisibility(8);
            }
            C128567c.m209821d(a3, new C129768d(a3));
            logoView.mo104344d((float) a2.f356095b.getResources().getInteger(R.integer.assistant_canvas_logo_view_toggle_logo_width), (float) a2.f356095b.getResources().getInteger(R.integer.assistant_canvas_logo_view_toggle_logo_height));
            logoView.mo104345e(7, true);
            a3.setOnClickListener(new C47591co(a2.f356096c, "ImmersiveCanvas Input plate keyboard tap", new C129771g(a2, editText)));
            logoView.setOnClickListener(new C47591co(a2.f356096c, "Clicked Mic toggle button", new C129772h(a2, logoView, editText)));
            editText.setOnEditorActionListener(new C47577ca(a2.f356096c, new C129773i(a2, editText), "Clicked EditTextView"));
            editText.addTextChangedListener(new C129775k(logoView, b));
            b.setOnClickListener(new C47591co(a2.f356096c, "Clicked Send Button", new C129774j(a2, editText)));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129765a.m211855a(th, th);
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
            if (!this.f356078e) {
                super.onAttach(context);
                if (this.f356075a == null) {
                    this.f356075a = ((C129780o) mo109260d().mo17653jN()).mo109258aA();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f356077d));
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
                C129765a.m211855a(th, th2);
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
