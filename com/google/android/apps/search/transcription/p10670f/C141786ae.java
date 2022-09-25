package com.google.android.apps.search.transcription.p10670f;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.core.p094f.C1888a;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p590as.p591a.C10770d;
import com.google.common.base.C58832aw;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.speech.recognizer.p5233a.C67451at;
import java.io.IOException;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.transcription.f.ae */
/* compiled from: PG */
public final class C141786ae {

    /* renamed from: a */
    public static final C59071e f384786a = C59071e.m91332i("com.google.android.apps.search.transcription.f.ae");

    /* renamed from: a */
    public static int m230047a(Intent intent) {
        int intExtra = intent.getIntExtra("android.speech.extra.MAX_RESULTS", 1);
        if (intExtra > 0) {
            return intExtra;
        }
        ((C59052c) ((C59052c) f384786a.mo56225c()).mo56372aa(41833)).mo56387q("Unsupported EXTRA_MAX_RESULTS %d", intExtra);
        return 1;
    }

    /* renamed from: b */
    public static Optional m230048b(Intent intent) {
        if (C1888a.m5150d() && intent.hasExtra("android.speech.extra.AUDIO_SOURCE")) {
            C141855c d = C141860d.m230258d();
            Parcelable parcelableExtra = intent.getParcelableExtra("android.speech.extra.AUDIO_SOURCE");
            if (!(parcelableExtra instanceof ParcelFileDescriptor)) {
                ((C59052c) ((C59052c) f384786a.mo56225c()).mo56372aa(41851)).mo56386p("No valid audio source passed to EXTRA_AUDIO_SOURCE; ignoring audio source");
                return Optional.empty();
            }
            try {
                d.mo116849f(Optional.m71637of(((ParcelFileDescriptor) parcelableExtra).dup()));
                int intExtra = intent.getIntExtra("android.speech.extra.AUDIO_SOURCE_CHANNEL_COUNT", 1);
                if (intExtra <= 0 || intExtra > 2) {
                    ((C59052c) ((C59052c) f384786a.mo56225c()).mo56372aa(41847)).mo56387q("EXTRA_AUDIO_SOURCE_CHANNEL_COUNT must be 1 or 2; passed value is %d; ignoring audio source", intExtra);
                    return Optional.empty();
                }
                d.mo116847d(intExtra);
                int intExtra2 = intent.getIntExtra("android.speech.extra.AUDIO_SOURCE_ENCODING", 2);
                if (intExtra2 <= 0) {
                    ((C59052c) ((C59052c) f384786a.mo56225c()).mo56372aa(41849)).mo56386p("Invalid value passed to EXTRA_AUDIO_SOURCE_ENCODING; value must come from AudioFormat; ignoring audio source");
                    return Optional.empty();
                }
                d.mo116848e(intExtra2);
                int intExtra3 = intent.getIntExtra("android.speech.extra.AUDIO_SOURCE_SAMPLING_RATE", 16000);
                if (intExtra3 <= 0) {
                    ((C59052c) ((C59052c) f384786a.mo56225c()).mo56372aa(41848)).mo56386p("Invalid value passed to EXTRA_AUDIO_SOURCE_SAMPLING_RATE; ignoring audio source");
                    return Optional.empty();
                }
                d.mo116851h(intExtra3);
                d.mo116850g(!intent.getBooleanExtra("com.google.recognition.extra.EXTRA_AUDIO_SOURCE_NON_MIC", false));
                return Optional.m71637of(d.mo116846c());
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) f384786a.mo56225c()).mo56382g(e)).mo56372aa(41850)).mo56386p("Failed to dup the ParcelFileDescriptor.");
                return Optional.empty();
            }
        } else if (!intent.hasExtra("com.google.recognition.extra.AUDIO_SOURCE")) {
            return Optional.empty();
        } else {
            C141855c d2 = C141860d.m230258d();
            Parcelable parcelableExtra2 = intent.getParcelableExtra("com.google.recognition.extra.AUDIO_SOURCE");
            if (parcelableExtra2 == null) {
                return Optional.empty();
            }
            if (parcelableExtra2 instanceof Uri) {
                ((C59052c) ((C59052c) f384786a.mo56224b()).mo56372aa(41842)).mo56386p("Audio source is passed in format of URI");
                Uri uri = (Uri) parcelableExtra2;
                if (C58832aw.m90831a(uri, Uri.EMPTY)) {
                    return Optional.empty();
                }
                d2.mo116852i(Optional.m71637of(uri));
            } else if (parcelableExtra2 instanceof ParcelFileDescriptor) {
                ((C59052c) ((C59052c) f384786a.mo56224b()).mo56372aa(41838)).mo56386p("Audio source is passed in format of ParcelFileDescriptor");
                try {
                    d2.mo116849f(Optional.m71637of(((ParcelFileDescriptor) parcelableExtra2).dup()));
                } catch (IOException e2) {
                    ((C59052c) ((C59052c) ((C59052c) f384786a.mo56225c()).mo56382g(e2)).mo56372aa(41841)).mo56386p("Failed to dup the ParcelFileDescriptor.");
                    return Optional.empty();
                }
            } else {
                ((C59052c) ((C59052c) f384786a.mo56225c()).mo56372aa(41837)).mo56386p("Audio source is passed in wrong format. Formats accepted are URI And ParcelFileDescriptor.");
                return Optional.empty();
            }
            int intExtra4 = intent.getIntExtra("com.google.recognition.extra.AUDIO_SOURCE_CHANNEL_COUNT", 1);
            if (intExtra4 <= 0 || intExtra4 > 2) {
                ((C59052c) ((C59052c) f384786a.mo56225c()).mo56372aa(41839)).mo56387q("EXTRA_AUDIO_SOURCE_CHANNEL_COUNT must be 1 or 2; passed value is %d", intExtra4);
                return Optional.empty();
            }
            d2.mo116847d(intExtra4);
            int intExtra5 = intent.getIntExtra("com.google.recognition.extra.AUDIO_SOURCE_SAMPLING_RATE", 16000);
            if (intExtra5 <= 0) {
                ((C59052c) ((C59052c) f384786a.mo56225c()).mo56372aa(41840)).mo56386p("Invalid value passed to EXTRA_AUDIO_SOURCE_SAMPLING_RATE; ignoring audio source");
                return Optional.empty();
            }
            d2.mo116851h(intExtra5);
            d2.mo116850g(!intent.getBooleanExtra("com.google.recognition.extra.EXTRA_AUDIO_SOURCE_NON_MIC", false));
            return Optional.m71637of(d2.mo116846c());
        }
    }

    /* renamed from: c */
    public static Optional m230049c(Intent intent) {
        String stringExtra = intent.getStringExtra("android.speech.extra.GET_AUDIO_FORMAT");
        if (C10770d.AMR.f35759e.equals(stringExtra)) {
            return Optional.m71637of(C67451at.AMR);
        }
        if (C10770d.AMRWB.f35759e.equals(stringExtra)) {
            return Optional.m71637of(C67451at.AMR_WB);
        }
        if (stringExtra != null) {
            ((C59052c) ((C59052c) f384786a.mo56225c()).mo56372aa(41852)).mo56359L("The audio format is not supported [requested=%s supported=[%s, %s]]", stringExtra, C10770d.AMR.f35759e, C10770d.AMRWB.f35759e);
        }
        return Optional.empty();
    }

    /* renamed from: d */
    public static String m230050d(Activity activity) {
        String str;
        Intent intent = activity.getIntent();
        if (activity.getCallingPackage() != null) {
            str = activity.getCallingPackage();
        } else {
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("android.speech.extra.RESULTS_PENDINGINTENT");
            str = pendingIntent != null ? pendingIntent.getCreatorPackage() : BuildConfig.FLAVOR;
        }
        if ("android".equals(str) && intent.hasExtra("calling_package")) {
            str = intent.getStringExtra("calling_package");
        }
        return C58837ba.m90858g(str);
    }

    /* renamed from: e */
    public static String m230051e(Intent intent) {
        String stringExtra = intent.getStringExtra("android.speech.extra.LANGUAGE");
        if (C58837ba.m90859h(stringExtra)) {
            String languageTag = Locale.getDefault().toLanguageTag();
            ((C59052c) ((C59052c) f384786a.mo56224b()).mo56372aa(41854)).mo56389s("Using Locale.getDefault() for recognition: %s", languageTag);
            return languageTag;
        }
        ((C59052c) ((C59052c) f384786a.mo56224b()).mo56372aa(41853)).mo56389s("Using language specified in RecognizerIntent: %s", stringExtra);
        return stringExtra;
    }

    /* renamed from: f */
    public static String m230052f(Intent intent) {
        if (!C1888a.m5150d() || !intent.hasExtra("android.speech.extra.SEGMENTED_SESSION")) {
            return null;
        }
        String stringExtra = intent.getStringExtra("android.speech.extra.SEGMENTED_SESSION");
        if (stringExtra != null && (stringExtra.equals("android.speech.extra.AUDIO_SOURCE") || stringExtra.equals("android.speech.extras.SPEECH_INPUT_MINIMUM_LENGTH_MILLIS") || stringExtra.equals("android.speech.extras.SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS"))) {
            return stringExtra;
        }
        ((C59052c) ((C59052c) f384786a.mo56225c()).mo56372aa(41855)).mo56386p("Wrong value passed to EXTRA_SEGMENTED_SESSION; ignoring it");
        return BuildConfig.FLAVOR;
    }

    /* renamed from: g */
    public static boolean m230053g(Intent intent) {
        return intent.getBooleanExtra("android.speech.extra.PREFER_OFFLINE", false);
    }
}
