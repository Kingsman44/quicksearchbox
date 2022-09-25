package com.google.android.apps.gsa.staticplugins.opa.samson.p8442n;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadata;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.C89946n;
import com.google.android.googlequicksearchbox.R;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.n.f */
/* compiled from: PG */
final class C110269f {

    /* renamed from: a */
    public final WeakReference f307291a;

    /* renamed from: b */
    public final Map f307292b;

    /* renamed from: c */
    private final View f307293c;

    /* renamed from: d */
    private final C110289z f307294d;

    /* renamed from: e */
    private final ImageView f307295e;

    /* renamed from: f */
    private final TextView f307296f;

    /* renamed from: g */
    private final TextView f307297g;

    /* renamed from: h */
    private final AtomicBoolean f307298h = new AtomicBoolean();

    /* renamed from: i */
    private final Drawable f307299i;

    public C110269f(C110289z zVar, Activity activity, Map map) {
        this.f307291a = new WeakReference(activity);
        this.f307294d = zVar;
        this.f307292b = map;
        this.f307293c = zVar.f307386d;
        this.f307295e = zVar.f307392j;
        this.f307297g = zVar.f307393k;
        this.f307296f = zVar.f307394l;
        this.f307299i = activity.getResources().getDrawable(R.drawable.quantum_ic_play_music_white_24, (Resources.Theme) null);
        m183617c();
    }

    /* renamed from: c */
    private final void m183617c() {
        if (!this.f307298h.getAndSet(true)) {
            this.f307293c.setOnTouchListener(new C89946n(C110267d.f307289a));
            this.f307293c.setOnClickListener(new C89943l(new C110268e(this)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo98517a() {
        this.f307297g.setText(BuildConfig.FLAVOR);
        this.f307297g.setVisibility(8);
        this.f307296f.setText(BuildConfig.FLAVOR);
        this.f307296f.setVisibility(8);
        this.f307295e.setImageDrawable((Drawable) null);
        this.f307295e.setVisibility(8);
        this.f307293c.setOnClickListener((View.OnClickListener) null);
        this.f307293c.setOnTouchListener((View.OnTouchListener) null);
        this.f307294d.mo98538a(this.f307293c, 8);
        this.f307298h.set(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo98518b(MediaMetadata mediaMetadata) {
        if (mediaMetadata == null) {
            mo98517a();
            return;
        }
        String string = mediaMetadata.getString("android.media.metadata.TITLE");
        String string2 = mediaMetadata.getString("android.media.metadata.ARTIST");
        if (string != null) {
            this.f307297g.setText(string);
            this.f307297g.setVisibility(0);
        } else {
            this.f307297g.setText(BuildConfig.FLAVOR);
            this.f307297g.setVisibility(8);
        }
        if (string2 != null) {
            this.f307296f.setText(string2);
            this.f307296f.setVisibility(0);
        } else {
            this.f307296f.setText(BuildConfig.FLAVOR);
            this.f307296f.setVisibility(8);
        }
        if (((Activity) this.f307291a.get()) != null) {
            this.f307295e.setImageDrawable(this.f307299i);
            this.f307295e.setVisibility(0);
        } else {
            this.f307295e.setImageDrawable((Drawable) null);
            this.f307295e.setVisibility(8);
        }
        this.f307294d.mo98538a(this.f307293c, 0);
        m183617c();
    }
}
