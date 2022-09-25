package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14742l;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14270d;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14548nh;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14594p;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62971cq;
import p3186j$.util.OptionalInt;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.i */
/* compiled from: PG */
public final class C15253i {

    /* renamed from: e */
    private static final C59071e f45758e = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.g.d.i");

    /* renamed from: f */
    private static final C58495hd f45759f = C58495hd.m89903q(C14594p.BLUETOOTH, new C15254j(R.drawable.quantum_gm_ic_bluetooth_gm_grey_36, R.drawable.quantum_gm_ic_bluetooth_gm_blue_36), C14594p.SPEAKER, new C15254j(R.drawable.quantum_gm_ic_volume_up_gm_grey_36, R.drawable.quantum_gm_ic_volume_up_gm_blue_36), C14594p.WIRED_HEADSET, new C15254j(R.drawable.quantum_gm_ic_headset_gm_grey_36, R.drawable.quantum_gm_ic_headset_gm_blue_36), C14594p.EARPIECE, new C15254j(R.drawable.quantum_gm_ic_phone_in_talk_gm_grey_36, R.drawable.quantum_gm_ic_phone_in_talk_gm_blue_36));

    /* renamed from: g */
    private static final C15252h f45760g = new C15254j(R.drawable.quantum_gm_ic_phone_in_talk_gm_grey_36, R.drawable.quantum_gm_ic_phone_in_talk_gm_blue_36);

    /* renamed from: a */
    public final C14986h f45761a;

    /* renamed from: b */
    public OptionalInt f45762b = OptionalInt.empty();

    /* renamed from: c */
    public LinearLayout f45763c;

    /* renamed from: d */
    public View f45764d;

    /* renamed from: h */
    private C14548nh f45765h;

    /* renamed from: i */
    private ViewGroup f45766i;

    /* renamed from: j */
    private ImageView f45767j;

    /* renamed from: k */
    private TextView f45768k;

    /* renamed from: l */
    private ViewGroup f45769l;

    /* renamed from: m */
    private ImageView f45770m;

    /* renamed from: n */
    private TextView f45771n;

    /* renamed from: o */
    private ViewGroup f45772o;

    /* renamed from: p */
    private ImageView f45773p;

    /* renamed from: q */
    private TextView f45774q;

    /* renamed from: r */
    private ViewGroup f45775r;

    /* renamed from: s */
    private ImageView f45776s;

    /* renamed from: t */
    private TextView f45777t;

    public C15253i(C14986h hVar) {
        this.f45761a = hVar;
    }

    /* renamed from: d */
    private static int m31831d(C14594p pVar, boolean z) {
        C15252h hVar = (C15252h) f45759f.getOrDefault(pVar, f45760g);
        return z ? hVar.mo22134a() : hVar.mo22135b();
    }

    /* renamed from: e */
    private static void m31832e(TextView textView, boolean z) {
        textView.setTextAppearance(true != z ? R.style.AudioOutputPickerTextStyle : R.style.AudioOutputPickerHighlightedTextStyle);
    }

    /* renamed from: a */
    public final void mo22136a(ContextThemeWrapper contextThemeWrapper) {
        Animation loadAnimation = AnimationUtils.loadAnimation(contextThemeWrapper, R.anim.immersive_shelf_animate_out);
        loadAnimation.setAnimationListener(new C15250f(this));
        LinearLayout linearLayout = this.f45763c;
        linearLayout.getClass();
        linearLayout.startAnimation(loadAnimation);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(contextThemeWrapper, R.anim.immersive_scrim_animate_out);
        loadAnimation2.setAnimationListener(new C15251g(this));
        View view = this.f45764d;
        view.getClass();
        view.startAnimation(loadAnimation2);
    }

    /* renamed from: c */
    public final void mo22138c() {
        this.f45765h = null;
        this.f45762b = OptionalInt.empty();
        this.f45763c = null;
        this.f45766i = null;
        this.f45767j = null;
        this.f45768k = null;
        this.f45769l = null;
        this.f45770m = null;
        this.f45771n = null;
        this.f45772o = null;
        this.f45773p = null;
        this.f45774q = null;
        this.f45775r = null;
        this.f45776s = null;
        this.f45777t = null;
        this.f45764d = null;
    }

    /* renamed from: b */
    public final void mo22137b(C14548nh nhVar, ViewGroup viewGroup, ContextThemeWrapper contextThemeWrapper) {
        if (this.f45763c == null) {
            LayoutInflater.from(contextThemeWrapper).inflate(R.layout.audio_output_picker, viewGroup, true);
            this.f45763c = (LinearLayout) viewGroup.findViewById(R.id.bottom_sheet);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.bluetooth_audio_output);
            this.f45766i = viewGroup2;
            if (viewGroup2 != null) {
                viewGroup2.setOnClickListener(new C15163a(this, contextThemeWrapper));
            }
            this.f45767j = (ImageView) viewGroup.findViewById(R.id.bluetooth_audio_output_icon_image);
            this.f45768k = (TextView) viewGroup.findViewById(R.id.bluetooth_audio_output_text);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.speaker_audio_output);
            this.f45769l = viewGroup3;
            if (viewGroup3 != null) {
                viewGroup3.setOnClickListener(new C15190b(this, contextThemeWrapper));
            }
            this.f45770m = (ImageView) viewGroup.findViewById(R.id.speaker_audio_output_icon_image);
            this.f45771n = (TextView) viewGroup.findViewById(R.id.speaker_audio_output_text);
            ViewGroup viewGroup4 = (ViewGroup) viewGroup.findViewById(R.id.earpiece_audio_output);
            this.f45772o = viewGroup4;
            if (viewGroup4 != null) {
                viewGroup4.setOnClickListener(new C15217c(this, contextThemeWrapper));
            }
            this.f45773p = (ImageView) viewGroup.findViewById(R.id.earpiece_audio_output_icon_image);
            this.f45774q = (TextView) viewGroup.findViewById(R.id.earpiece_audio_output_text);
            ViewGroup viewGroup5 = (ViewGroup) viewGroup.findViewById(R.id.wired_headset_audio_output);
            this.f45775r = viewGroup5;
            if (viewGroup5 != null) {
                viewGroup5.setOnClickListener(new C15244d(this, contextThemeWrapper));
            }
            this.f45776s = (ImageView) viewGroup.findViewById(R.id.wired_headset_audio_output_icon_image);
            this.f45777t = (TextView) viewGroup.findViewById(R.id.wired_headset_audio_output_text);
            View findViewById = viewGroup.findViewById(R.id.scrim);
            this.f45764d = findViewById;
            findViewById.setOnClickListener(new C15249e(this, contextThemeWrapper));
            LinearLayout linearLayout = this.f45763c;
            linearLayout.getClass();
            linearLayout.startAnimation(AnimationUtils.loadAnimation(contextThemeWrapper, R.anim.immersive_shelf_show_up));
            View view = this.f45764d;
            view.getClass();
            view.startAnimation(AnimationUtils.loadAnimation(contextThemeWrapper, R.anim.immersive_scrim));
        }
        if (!nhVar.equals(this.f45765h)) {
            if (this.f45766i == null || this.f45769l == null || this.f45775r == null || this.f45772o == null) {
                C59104x c = f45758e.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Morris.AudioPickerRndr");
                ((C59052c) ((C59052c) c).mo56372aa(46000)).mo56386p("Audio route device views in bottom sheet have not been initialized");
                this.f45761a.mo21875g(C14742l.m31052h());
                return;
            }
            C62971cq<C14270d> cqVar = nhVar.f44003b;
            if (cqVar.isEmpty()) {
                this.f45761a.mo21875g(C14742l.m31052h());
                return;
            }
            ViewGroup viewGroup6 = this.f45766i;
            viewGroup6.getClass();
            viewGroup6.setVisibility(8);
            ViewGroup viewGroup7 = this.f45769l;
            viewGroup7.getClass();
            viewGroup7.setVisibility(8);
            ViewGroup viewGroup8 = this.f45775r;
            viewGroup8.getClass();
            viewGroup8.setVisibility(8);
            ViewGroup viewGroup9 = this.f45772o;
            viewGroup9.getClass();
            viewGroup9.setVisibility(8);
            this.f45762b = OptionalInt.m71640of(nhVar.f44002a);
            for (C14270d dVar : cqVar) {
                int i = dVar.f43167b;
                char c2 = i != 0 ? i != 1 ? i != 2 ? (char) 0 : 4 : 3 : 2;
                if (c2 == 0) {
                    c2 = 1;
                }
                boolean z = c2 == 4;
                C14594p pVar = C14594p.UNKNOWN;
                C14594p a = C14594p.m30642a(dVar.f43166a);
                if (a == null) {
                    a = C14594p.UNRECOGNIZED;
                }
                int ordinal = a.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                C59104x c3 = f45758e.mo56225c();
                                c3.mo56378ag(C58975e.f156826a, "Morris.AudioPickerRndr");
                                ((C59052c) ((C59052c) c3).mo56372aa(46001)).mo56387q("Found invalid audio route type in bottom sheet device UI state: %d", dVar.f43166a);
                            } else if (c2 != 2) {
                                ViewGroup viewGroup10 = this.f45775r;
                                viewGroup10.getClass();
                                viewGroup10.setVisibility(0);
                                ImageView imageView = this.f45776s;
                                imageView.getClass();
                                imageView.setImageResource(m31831d(C14594p.WIRED_HEADSET, z));
                                TextView textView = this.f45777t;
                                textView.getClass();
                                m31832e(textView, z);
                            }
                        } else if (c2 != 2) {
                            ViewGroup viewGroup11 = this.f45766i;
                            viewGroup11.getClass();
                            viewGroup11.setVisibility(0);
                            ImageView imageView2 = this.f45767j;
                            imageView2.getClass();
                            imageView2.setImageResource(m31831d(C14594p.BLUETOOTH, z));
                            TextView textView2 = this.f45768k;
                            textView2.getClass();
                            m31832e(textView2, z);
                        }
                    } else if (c2 != 2) {
                        ViewGroup viewGroup12 = this.f45769l;
                        viewGroup12.getClass();
                        viewGroup12.setVisibility(0);
                        ImageView imageView3 = this.f45770m;
                        imageView3.getClass();
                        imageView3.setImageResource(m31831d(C14594p.SPEAKER, z));
                        TextView textView3 = this.f45771n;
                        textView3.getClass();
                        m31832e(textView3, z);
                    }
                } else if (c2 != 2) {
                    ViewGroup viewGroup13 = this.f45772o;
                    viewGroup13.getClass();
                    viewGroup13.setVisibility(0);
                    ImageView imageView4 = this.f45773p;
                    imageView4.getClass();
                    imageView4.setImageResource(m31831d(C14594p.EARPIECE, z));
                    TextView textView4 = this.f45774q;
                    textView4.getClass();
                    m31832e(textView4, z);
                }
            }
            this.f45765h = nhVar;
        }
    }
}
