package com.google.lens.sdk;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87955ju;
import com.google.lens.p4707j.C62471cu;
import java.util.BitSet;

/* renamed from: com.google.lens.sdk.m */
/* compiled from: PG */
public abstract class C62647m {
    /* renamed from: u */
    private final BitSet m94862u() {
        if (mo58546h() == null) {
            return null;
        }
        BitSet bitSet = new BitSet();
        bitSet.set(0, mo58546h().booleanValue());
        return bitSet;
    }

    /* renamed from: a */
    public abstract Bitmap mo58538a();

    /* renamed from: b */
    public abstract PointF mo58539b();

    /* renamed from: c */
    public abstract Rect mo58540c();

    /* renamed from: d */
    public abstract Location mo58541d();

    /* renamed from: e */
    public abstract Uri mo58542e();

    /* renamed from: f */
    public abstract C62471cu mo58544f();

    /* renamed from: g */
    public abstract C62646l mo58545g();

    /* renamed from: h */
    public abstract Boolean mo58546h();

    /* renamed from: i */
    public abstract Boolean mo58548i();

    /* renamed from: j */
    public abstract Boolean mo58549j();

    /* renamed from: k */
    public abstract Integer mo58550k();

    /* renamed from: l */
    public abstract Integer mo58551l();

    /* renamed from: m */
    public abstract Integer mo58552m();

    /* renamed from: n */
    public abstract Long mo58553n();

    /* renamed from: o */
    public abstract String mo58554o();

    /* renamed from: p */
    public abstract String mo58555p();

    /* renamed from: q */
    public abstract String mo58556q();

    /* renamed from: r */
    public abstract byte[] mo58557r();

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final Bundle mo58566s(C87955ju juVar) {
        Bundle bundle = new Bundle();
        if (mo58542e() != null) {
            bundle.putParcelable("uri", mo58542e());
        }
        int i = 0;
        if (mo58538a() != null) {
            Bitmap a = mo58538a();
            int i2 = (juVar.f237884a & 4) != 0 ? juVar.f237887d : 33554432;
            if (a.getByteCount() > i2) {
                Log.w("LensMetadata", String.format("Input bitmap is %d bytes, which is larger than our maximum of %d bytes. Downsampling...", new Object[]{Integer.valueOf(a.getByteCount()), Integer.valueOf(i2)}));
                float sqrt = (float) Math.sqrt((double) (((float) i2) / ((float) a.getByteCount())));
                Matrix matrix = new Matrix();
                matrix.setScale(sqrt, sqrt);
                a = Bitmap.createBitmap(a, 0, 0, a.getWidth(), a.getHeight(), matrix, true);
            }
            bundle.putParcelable("bitmap", a);
        }
        if (mo58557r() != null) {
            bundle.putByteArray("image_payload", mo58557r());
        }
        if (mo58555p() != null) {
            bundle.putString("lens_fife_url", mo58555p());
        }
        if (mo58554o() != null) {
            bundle.putString("account", mo58554o());
        }
        if (mo58541d() != null) {
            bundle.putParcelable("location", mo58541d());
        }
        if (mo58556q() != null) {
            bundle.putString("image_place_id", mo58556q());
        }
        if (mo58552m() != null) {
            i = mo58552m().intValue();
        }
        bundle.putInt("lens_transition_type", i);
        if (mo58539b() != null) {
            bundle.putParcelable("lens_tap_location", mo58539b());
        }
        if (mo58551l() != null) {
            bundle.putInt("lens_theme", mo58551l().intValue());
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final Bundle mo58567t() {
        Bundle bundle = new Bundle();
        if (mo58553n() != null) {
            bundle.putLong("activity_launch_timestamp_nanos", mo58553n().longValue());
        }
        if (mo58548i() != null) {
            bundle.putBoolean("hide_lens_close_button", mo58548i().booleanValue());
        }
        if (m94862u() != null) {
            bundle.putSerializable("disable_lens_features", m94862u());
        }
        if (mo58544f() != null) {
            bundle.putByteArray("lens_initial_parameters", mo58544f().toByteArray());
        }
        if (mo58550k() != null) {
            bundle.putInt("lens_intent_type", mo58550k().intValue());
        }
        if (mo58551l() != null) {
            bundle.putInt("lens_theme", mo58551l().intValue());
        }
        if (mo58540c() != null) {
            bundle.putParcelable("lens_sreen_image_location", mo58540c());
        }
        if (mo58556q() != null) {
            bundle.putString("image_place_id", mo58556q());
        }
        if (mo58549j() != null) {
            bundle.putBoolean("promo_add_shorcut", mo58549j().booleanValue());
        }
        return bundle;
    }
}
