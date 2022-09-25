package com.google.android.apps.gsa.shared.speech;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.common.base.C58833ax;
import com.google.speech.p5224k.p5225a.C67229g;

/* compiled from: PG */
public abstract class HotwordResultMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C90575f();

    /* renamed from: q */
    public static C90576g m147623q() {
        C90508a aVar = new C90508a();
        aVar.mo84632c(0.0f);
        aVar.mo84634e(0.0f);
        aVar.mo84635f(0.0f);
        aVar.mo84643n(0.0f);
        aVar.mo84644o(0);
        aVar.mo84631b(C67229g.UNKNOWN);
        aVar.mo84642m(false);
        aVar.mo84633d(true);
        aVar.mo84639j(false);
        aVar.mo84641l(0);
        aVar.mo84636g(false);
        aVar.mo84638i(false);
        aVar.mo84637h(false);
        aVar.mo84640k(0);
        return aVar;
    }

    /* renamed from: r */
    public static HotwordResultMetadata m147624r(Context context, HotwordResult hotwordResult, boolean z, long j, boolean z2) {
        long l = hotwordResult.mo84694l();
        long j2 = j - l;
        boolean z3 = false;
        if (j2 > 0 && j2 <= 10000) {
            z3 = true;
        }
        C90576g q = m147623q();
        q.mo84632c(hotwordResult.mo84681a());
        q.mo84634e(hotwordResult.mo84682b());
        q.mo84635f(hotwordResult.mo84683c());
        q.mo84643n(hotwordResult.mo84684d());
        q.mo84631b(hotwordResult.mo84706w());
        q.mo84644o(j);
        q.mo84642m(z);
        q.mo84633d(true);
        q.mo84639j(z2);
        q.mo84641l(hotwordResult.mo84691i());
        q.mo84636g(hotwordResult.mo84679D());
        q.mo84638i(hotwordResult.mo84677B());
        q.mo84637h(z3);
        q.mo84640k(l);
        String x = hotwordResult.mo84707x();
        if (x != null) {
            ((C90508a) q).f253063a = C58833ax.m90834k(x);
        }
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (string != null) {
            ((C90508a) q).f253064b = C58833ax.m90834k(string);
        }
        return q.mo84630a();
    }

    /* renamed from: s */
    public static HotwordResultMetadata m147625s(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        C90576g q = m147623q();
        q.mo84634e(bundle.getFloat("key_result_hotword_power", 0.0f));
        q.mo84635f(bundle.getFloat("key_result_hotword_score", 0.0f));
        q.mo84632c(bundle.getFloat("key_background_power", 0.0f));
        q.mo84643n(bundle.getFloat("key_result_speaker_id_score", 0.0f));
        q.mo84644o(bundle.getLong("key_result_trigger_time", 0));
        q.mo84673p(bundle.getInt("key_always_on_detector_type", 0));
        q.mo84642m(bundle.getBoolean("key_result_screen_on", false));
        q.mo84633d(bundle.getBoolean("key_is_hotword_triggered", false));
        q.mo84639j(bundle.getBoolean("key_is_voice_unlocked", false));
        q.mo84641l(bundle.getInt("key_sample_rate", 0));
        q.mo84636g(bundle.getBoolean("key_is_low_confidence_trigger", false));
        q.mo84638i(bundle.getBoolean("key_is_speaker_authenticated", false));
        q.mo84637h(bundle.getBoolean("key_is_near_miss", false));
        q.mo84640k(bundle.getLong("key_near_miss_time"));
        String string = bundle.getString("key_result_model_id");
        if (string != null) {
            ((C90508a) q).f253063a = C58833ax.m90834k(string);
        }
        String string2 = bundle.getString("key_result_device_id");
        if (string2 != null) {
            ((C90508a) q).f253064b = C58833ax.m90834k(string2);
        }
        return q.mo84630a();
    }

    /* renamed from: t */
    public static HotwordResultMetadata m147626t(Intent intent) {
        C90576g q = m147623q();
        q.mo84634e(intent.getFloatExtra("key_result_hotword_power", 0.0f));
        q.mo84635f(intent.getFloatExtra("key_result_hotword_score", 0.0f));
        q.mo84632c(intent.getFloatExtra("key_background_power", 0.0f));
        q.mo84643n(intent.getFloatExtra("key_result_speaker_id_score", 0.0f));
        q.mo84644o(intent.getLongExtra("key_result_trigger_time", 0));
        q.mo84673p(intent.getIntExtra("key_always_on_detector_type", 0));
        q.mo84642m(intent.getBooleanExtra("key_result_screen_on", false));
        q.mo84633d(intent.getBooleanExtra("key_is_hotword_triggered", false));
        q.mo84639j(intent.getBooleanExtra("key_is_voice_unlocked", false));
        q.mo84641l(intent.getIntExtra("key_sample_rate", 0));
        q.mo84636g(intent.getBooleanExtra("key_is_low_confidence_trigger", false));
        q.mo84638i(intent.getBooleanExtra("key_is_speaker_authenticated", false));
        q.mo84637h(intent.getBooleanExtra("key_is_near_miss", false));
        q.mo84640k(intent.getLongExtra("key_near_miss_time", 0));
        String stringExtra = intent.getStringExtra("key_result_model_id");
        if (stringExtra != null) {
            ((C90508a) q).f253063a = C58833ax.m90834k(stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("key_result_device_id");
        if (stringExtra2 != null) {
            ((C90508a) q).f253064b = C58833ax.m90834k(stringExtra2);
        }
        return q.mo84630a();
    }

    /* renamed from: u */
    public static void m147627u(Bundle bundle, HotwordResultMetadata hotwordResultMetadata) {
        if (hotwordResultMetadata != null) {
            bundle.putBoolean("key_is_hotword_triggered", true);
            bundle.putFloat("key_result_hotword_power", hotwordResultMetadata.mo84598b());
            bundle.putFloat("key_background_power", hotwordResultMetadata.mo84597a());
            bundle.putFloat("key_result_hotword_score", hotwordResultMetadata.mo84599c());
            bundle.putFloat("key_result_speaker_id_score", hotwordResultMetadata.mo84600d());
            bundle.putLong("key_result_trigger_time", hotwordResultMetadata.mo84604g());
            bundle.putInt("key_always_on_detector_type", hotwordResultMetadata.mo84608j().f182718e);
            bundle.putBoolean("key_result_screen_on", hotwordResultMetadata.mo84614p());
            bundle.putBoolean("key_is_hotword_triggered", hotwordResultMetadata.mo84609k());
            bundle.putBoolean("key_is_voice_unlocked", hotwordResultMetadata.mo84613o());
            bundle.putString("key_result_model_id", (String) hotwordResultMetadata.mo84607i().mo56109e(BuildConfig.FLAVOR));
            bundle.putString("key_result_device_id", (String) hotwordResultMetadata.mo84605h().mo56109e(BuildConfig.FLAVOR));
            bundle.putInt("key_sample_rate", hotwordResultMetadata.mo84601e());
            bundle.putBoolean("key_is_low_confidence_trigger", hotwordResultMetadata.mo84610l());
            bundle.putBoolean("key_is_speaker_authenticated", hotwordResultMetadata.mo84612n());
            bundle.putBoolean("key_is_near_miss", hotwordResultMetadata.mo84611m());
            bundle.putLong("key_near_miss_time", hotwordResultMetadata.mo84603f());
        }
    }

    /* renamed from: a */
    public abstract float mo84597a();

    /* renamed from: b */
    public abstract float mo84598b();

    /* renamed from: c */
    public abstract float mo84599c();

    /* renamed from: d */
    public abstract float mo84600d();

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public abstract int mo84601e();

    /* renamed from: f */
    public abstract long mo84603f();

    /* renamed from: g */
    public abstract long mo84604g();

    /* renamed from: h */
    public abstract C58833ax mo84605h();

    /* renamed from: i */
    public abstract C58833ax mo84607i();

    /* renamed from: j */
    public abstract C67229g mo84608j();

    /* renamed from: k */
    public abstract boolean mo84609k();

    /* renamed from: l */
    public abstract boolean mo84610l();

    /* renamed from: m */
    public abstract boolean mo84611m();

    /* renamed from: n */
    public abstract boolean mo84612n();

    /* renamed from: o */
    public abstract boolean mo84613o();

    /* renamed from: p */
    public abstract boolean mo84614p();

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(mo84597a());
        parcel.writeFloat(mo84598b());
        parcel.writeFloat(mo84599c());
        parcel.writeFloat(mo84600d());
        parcel.writeLong(mo84604g());
        parcel.writeInt(mo84608j().f182718e);
        parcel.writeByte(mo84614p() ? (byte) 1 : 0);
        parcel.writeByte(mo84609k() ? (byte) 1 : 0);
        parcel.writeString((String) mo84607i().mo56109e(BuildConfig.FLAVOR));
        parcel.writeString((String) mo84605h().mo56109e(BuildConfig.FLAVOR));
        parcel.writeInt(mo84601e());
        parcel.writeByte(mo84613o() ? (byte) 1 : 0);
        parcel.writeByte(mo84610l() ? (byte) 1 : 0);
        parcel.writeByte(mo84612n() ? (byte) 1 : 0);
        parcel.writeByte(mo84611m() ? (byte) 1 : 0);
        parcel.writeLong(mo84603f());
    }
}
