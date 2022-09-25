package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.p287f.C5593j;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14649e;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15375c;
import com.google.apps.tiktok.media.C47449e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.f.z */
/* compiled from: PG */
public final class C15352z {

    /* renamed from: a */
    public static final C59071e f46060a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.g.f.z");

    /* renamed from: b */
    static final Duration f46061b = Duration.ofSeconds(1);

    /* renamed from: c */
    public static final Duration f46062c = Duration.ofMillis(160);

    /* renamed from: d */
    private static final Duration f46063d = Duration.ofMinutes(5);

    /* renamed from: e */
    private final PackageManager f46064e;

    /* renamed from: f */
    private final C47449e f46065f;

    public C15352z(Context context, C47449e eVar) {
        this.f46064e = context.getPackageManager();
        this.f46065f = eVar;
    }

    /* renamed from: a */
    public static float m31949a(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    /* renamed from: b */
    public static int m31950b(Context context, int i) {
        return context.getResources().getDimensionPixelSize(i);
    }

    /* renamed from: c */
    public static int m31951c(Context context) {
        return C14649e.m30711b(context).getDefaultDisplay().getRotation();
    }

    /* renamed from: d */
    public static int m31952d(Context context, int i) {
        Point point = new Point();
        C14649e.m30711b(context).getDefaultDisplay().getRealSize(point);
        return point.y - i;
    }

    /* renamed from: e */
    public static AnimatorSet m31953e(View view, long j) {
        if (f46061b.isZero()) {
            return new AnimatorSet();
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            long millis = f46063d.toMillis();
            Duration duration = f46061b;
            long millis2 = duration.toMillis();
            if (((long) i) < millis / (millis2 + millis2)) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.4f});
                ofFloat.setDuration(duration.toMillis());
                ofFloat.setInterpolator(new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f));
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f});
                ofFloat2.setDuration(duration.toMillis());
                ofFloat2.setInterpolator(new LinearInterpolator());
                arrayList.add(ofFloat);
                arrayList.add(ofFloat2);
                i++;
            } else {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(arrayList);
                animatorSet.setStartDelay(j);
                animatorSet.start();
                return animatorSet;
            }
        }
    }

    /* renamed from: f */
    public static Animation m31954f(Context context, ViewGroup viewGroup) {
        Animation g = m31955g(context, 0);
        g.setAnimationListener(new C15350x(viewGroup));
        return g;
    }

    /* renamed from: g */
    public static Animation m31955g(Context context, int i) {
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.fullscreen_switch_in);
        loadAnimation.setStartOffset((long) (context.getResources().getInteger(R.integer.motion_fast02) + (context.getResources().getInteger(R.integer.motion_micro) * i)));
        return loadAnimation;
    }

    /* renamed from: i */
    public static void m31956i(ImageView imageView) {
        imageView.setImageResource(R.drawable.caller_avatar);
    }

    /* renamed from: j */
    public static void m31957j(ImageView imageView, int i) {
        imageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: p */
    public static Animation m31958p(Context context, float f, int i, int i2) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, m31949a(context, f), 0.0f);
        translateAnimation.setDuration((long) context.getResources().getInteger(i));
        translateAnimation.setInterpolator(context, R.anim.enter_interpolator);
        translateAnimation.setStartOffset((long) i2);
        return translateAnimation;
    }

    /* renamed from: q */
    private final C6007z m31959q(ImageView imageView, String str, C15351y yVar) {
        C47449e eVar = this.f46065f;
        return eVar.mo51286a().mo11870h(Uri.parse(str)).mo12439a(new C15348v(yVar, imageView));
    }

    /* renamed from: h */
    public final String mo22227h(String str) {
        if (str.isEmpty()) {
            C59104x b = f46060a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "Morris.RenderingUtils");
            ((C59052c) ((C59052c) b).mo56372aa(46082)).mo56386p("Package name is empty.");
            return BuildConfig.FLAVOR;
        }
        try {
            return this.f46064e.getApplicationLabel(this.f46064e.getApplicationInfo(str, 0)).toString();
        } catch (PackageManager.NameNotFoundException e) {
            C59104x d = f46060a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.RenderingUtils");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(46081)).mo56389s("ApplicationInfo for %s not found.", str);
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: k */
    public final void mo22228k(ImageView imageView, String str) {
        if (str.isEmpty()) {
            C59104x b = f46060a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "Morris.RenderingUtils");
            ((C59052c) ((C59052c) b).mo56372aa(46084)).mo56386p("Package name is empty");
            return;
        }
        try {
            Drawable applicationIcon = this.f46064e.getApplicationIcon(str);
            if (applicationIcon != null) {
                imageView.setImageDrawable(applicationIcon);
            } else {
                imageView.setImageDrawable((Drawable) null);
            }
        } catch (PackageManager.NameNotFoundException e) {
            C59104x c = f46060a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.RenderingUtils");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(46083)).mo56389s("App icon for %s not found from package manager", str);
            imageView.setImageDrawable((Drawable) null);
        }
    }

    /* renamed from: l */
    public final void mo22229l(ImageView imageView, C14361gj gjVar, C15351y yVar) {
        C58976aa aaVar = C58975e.f156826a;
        Bitmap a = C15375c.m31983a(gjVar);
        if (a == null) {
            yVar.mo21894a(imageView);
        } else {
            imageView.setImageBitmap(a);
        }
    }

    /* renamed from: m */
    public final void mo22230m(ImageView imageView, C63088z zVar, C15351y yVar) {
        C47449e eVar = this.f46065f;
        eVar.mo51286a().mo11874l(zVar.mo59174N()).mo12439a(new C15349w(yVar, imageView)).mo12454r(imageView);
    }

    /* renamed from: n */
    public final void mo22231n(ImageView imageView, String str, C15351y yVar) {
        if (str.isEmpty()) {
            yVar.mo21894a(imageView);
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        m31959q(imageView, str, yVar).mo12454r(imageView);
    }

    /* renamed from: o */
    public final void mo22232o(ImageView imageView, String str, C15351y yVar, C5593j jVar) {
        if (str.isEmpty()) {
            yVar.mo21894a(imageView);
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        m31959q(imageView, str, yVar).mo11982o(jVar).mo12454r(imageView);
    }
}
