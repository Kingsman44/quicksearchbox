package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8160b.p8161a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C1877c;
import androidx.core.graphics.drawable.C1929b;
import androidx.core.widget.C2134u;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.C105770h;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.p8162a.C105749b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.b.a.h */
/* compiled from: PG */
public final class C105729h extends C22939d {

    /* renamed from: a */
    public final C105749b f295070a;

    /* renamed from: b */
    private final Context f295071b;

    /* renamed from: c */
    private final C105770h f295072c;

    /* renamed from: d */
    private final Drawable f295073d;

    /* renamed from: e */
    private Drawable f295074e;

    /* renamed from: f */
    private View f295075f;

    public C105729h(C22945j jVar, C105770h hVar, Context context, C105749b bVar) {
        super(jVar);
        this.f295071b = context;
        this.f295074e = m176010g(context, R.drawable.quantum_ic_cloud_off_white_48, R.color.minus_one_sign_in_error_light_cloud);
        this.f295073d = m176010g(context, R.drawable.quantum_ic_refresh_white_24, R.color.minus_one_white);
        this.f295070a = bVar;
        this.f295072c = hVar;
    }

    /* renamed from: g */
    private static Drawable m176010g(Context context, int i, int i2) {
        Drawable mutate = C1877c.m5125a(context, i).mutate();
        C1929b.m5225f(mutate, context.getResources().getColor(i2));
        return mutate;
    }

    /* renamed from: e */
    public final void mo95021e(boolean z) {
        this.f295074e = m176010g(this.f295071b, R.drawable.quantum_ic_cloud_off_white_48, z ? R.color.minus_one_sign_in_error_dark_cloud : R.color.minus_one_sign_in_error_light_cloud);
        ((ImageView) this.f295075f.findViewById(R.id.disconnected_cloud)).setImageDrawable(this.f295074e);
        C2134u.m5914f((Button) this.f295075f.findViewById(R.id.try_again_button), this.f295073d, (Drawable) null, (Drawable) null, (Drawable) null);
        ((TextView) this.f295075f.findViewById(R.id.sign_in_error_description)).setTextColor(this.f295071b.getResources().getColor(true != z ? R.color.minus_one_sign_in_error_light_text : R.color.minus_one_sign_in_error_dark_text));
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        this.f295075f = LayoutInflater.from(this.f295071b).inflate(R.layout.sign_in_error, (ViewGroup) null, false);
        mo95021e(false);
        ((Button) this.f295075f.findViewById(R.id.try_again_button)).setOnClickListener(new C105727f(this));
        mo28295iC(this.f295075f);
        ((C105717a) this.f295072c).f294990a.mo28726b(new C105728g(this));
    }
}
