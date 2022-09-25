package com.google.android.libraries.lens.view.p2051ab;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.libraries.lens.view.InProcessBitmap;
import com.google.lens.p4707j.C62433bj;
import com.google.lens.p4707j.C62471cu;

/* renamed from: com.google.android.libraries.lens.view.ab.c */
/* compiled from: PG */
public final class C24970c {

    /* renamed from: A */
    public Rect f68090A = null;

    /* renamed from: B */
    public String f68091B = null;

    /* renamed from: C */
    public boolean f68092C = false;

    /* renamed from: a */
    public boolean f68093a = false;

    /* renamed from: b */
    public C62471cu f68094b = null;

    /* renamed from: c */
    public byte[] f68095c = null;

    /* renamed from: d */
    public Uri f68096d = null;

    /* renamed from: e */
    public Bitmap f68097e = null;

    /* renamed from: f */
    public String f68098f = null;

    /* renamed from: g */
    public String f68099g = null;

    /* renamed from: h */
    public String f68100h = null;

    /* renamed from: i */
    public byte[] f68101i = null;

    /* renamed from: j */
    public String f68102j;

    /* renamed from: k */
    public String f68103k;

    /* renamed from: l */
    public int f68104l = 0;

    /* renamed from: m */
    public int f68105m = C62433bj.UNKNOWN.f168594ao;

    /* renamed from: n */
    public Integer f68106n = null;

    /* renamed from: o */
    public String f68107o = null;

    /* renamed from: p */
    public PointF f68108p = null;

    /* renamed from: q */
    public int f68109q = 0;

    /* renamed from: r */
    public Location f68110r = null;

    /* renamed from: s */
    public String f68111s = null;

    /* renamed from: t */
    public boolean f68112t = true;

    /* renamed from: u */
    public boolean f68113u;

    /* renamed from: v */
    public boolean f68114v = true;

    /* renamed from: w */
    public int f68115w = 0;

    /* renamed from: x */
    public boolean f68116x = false;

    /* renamed from: y */
    public boolean f68117y = false;

    /* renamed from: z */
    public Long f68118z = null;

    /* renamed from: a */
    public final Bundle mo30192a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("triggered_by_deeplink", this.f68093a);
        C62471cu cuVar = this.f68094b;
        if (cuVar != null) {
            bundle.putByteArray("lens_initial_parameters", cuVar.toByteArray());
        }
        bundle.putByteArray("bootstrap_image", this.f68095c);
        bundle.putParcelable("injected_image_uri", this.f68096d);
        bundle.putParcelable("injected_image_bitmap", new InProcessBitmap(this.f68097e));
        bundle.putString("fife_url", this.f68098f);
        bundle.putByteArray("injected_image_payload", this.f68101i);
        bundle.putString("caller_package", this.f68102j);
        bundle.putString("account_name", this.f68103k);
        bundle.putString("ImageSrc", this.f68099g);
        bundle.putString("PageDomain", this.f68100h);
        bundle.putInt("lens_transition_type", this.f68104l);
        bundle.putInt("lens_intent_type", this.f68105m);
        bundle.putParcelable("lens_tap_location", this.f68108p);
        bundle.putInt("lens_theme", this.f68109q);
        bundle.putParcelable("location", this.f68110r);
        bundle.putString("image_place_id", this.f68111s);
        bundle.putBoolean("enable_art_lookalike_feature", this.f68112t);
        bundle.putBoolean("hide_lens_close_button", this.f68113u);
        bundle.putBoolean("clear_task_stack", this.f68114v);
        bundle.putInt("screen_orientation", this.f68115w);
        bundle.putBoolean("from_incognito", this.f68116x);
        bundle.putString("chrome_finch_variations", this.f68091B);
        bundle.putBoolean("treat_as_external", this.f68117y);
        Integer num = this.f68106n;
        if (num != null) {
            bundle.putInt("proactive_query_id", num.intValue());
        }
        String str = this.f68107o;
        if (str != null) {
            bundle.putString("proactive_session_id", str);
        }
        Long l = this.f68118z;
        if (l != null) {
            bundle.putLong("activity_launch_timestamp_nanos", l.longValue());
        }
        bundle.putBoolean("include_return_text_intent", false);
        bundle.putParcelable("lens_sreen_image_location", this.f68090A);
        bundle.putBoolean("promo_add_shorcut", this.f68092C);
        return bundle;
    }
}
