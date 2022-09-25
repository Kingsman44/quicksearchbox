package com.google.android.apps.gsa.voiceinteraction.hotword;

import android.content.ContentUris;
import android.content.Context;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.PersistableBundle;
import android.os.SharedMemory;
import android.service.voice.AlwaysOnHotwordDetector;
import android.service.voice.HotwordDetectedResult;
import android.system.ErrnoException;
import com.google.android.apps.gsa.hotword.hotworddetectionservice.k;
import com.google.android.apps.gsa.shared.speech.hotword.C90578a;
import com.google.android.apps.gsa.shared.speech.hotword.C90599p;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.android.apps.gsa.shared.util.C90721ae;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.apps.gsa.voiceinteraction.hotword.n */
/* compiled from: PG */
public final class C118726n {

    /* renamed from: a */
    private static final C59071e f331188a = C59071e.m91332i("com.google.android.apps.gsa.voiceinteraction.hotword.n");

    /* renamed from: a */
    public static PersistableBundle m197093a(int i, SpeakerIdModel speakerIdModel, boolean z) {
        int i2;
        C58833ax axVar;
        PersistableBundle persistableBundle = new PersistableBundle();
        int i3 = 0;
        if (speakerIdModel == null || (axVar = speakerIdModel.f253284b) == null || !axVar.mo56113h() || axVar.mo56107c() == null) {
            i2 = 0;
        } else {
            i3 = ((byte[]) speakerIdModel.f253284b.mo56107c()).length;
            persistableBundle.putString("speakerIdAccounts", speakerIdModel.f253283a);
            i2 = 1;
        }
        persistableBundle.putInt("hotwordModelSize", i);
        persistableBundle.putInt("speakerIdModelSize", i3);
        persistableBundle.putInt("numberOfSpeakerIdModels", i2);
        persistableBundle.putBoolean("speakerVerificationRequired", z);
        return persistableBundle;
    }

    /* renamed from: b */
    public static SharedMemory m197094b(byte[] bArr, SpeakerIdModel speakerIdModel) {
        int i;
        SharedMemory sharedMemory = null;
        byte[] bArr2 = (speakerIdModel == null || !speakerIdModel.f253284b.mo56113h()) ? null : (byte[]) speakerIdModel.f253284b.mo56107c();
        if (bArr2 == null) {
            i = bArr.length;
        } else {
            i = bArr.length + bArr2.length;
        }
        if (i == 0) {
            ((C59052c) ((C59052c) f331188a.mo56226d()).mo56372aa(34157)).mo56386p("Shared Memory requested, but no models provided.");
            return null;
        }
        try {
            sharedMemory = SharedMemory.create("Hotword Models", i);
            ByteBuffer put = sharedMemory.mapReadWrite().put(bArr);
            if (bArr2 != null) {
                put.put(bArr2);
            }
        } catch (ErrnoException e) {
            ((C59052c) ((C59052c) ((C59052c) f331188a.mo56225c()).mo56382g(e)).mo56372aa(34156)).mo56386p("Error creating and sharing memory.");
        }
        return sharedMemory;
    }

    /* renamed from: c */
    public static boolean m197095c(boolean z) {
        return z && Build.VERSION.SDK_INT >= 31;
    }

    /* renamed from: d */
    public static HotwordResult m197096d(AlwaysOnHotwordDetector.EventPayload eventPayload, boolean z, boolean z2, Context context, AudioFormat audioFormat, String str, C58833ax axVar, C58833ax axVar2) {
        int i;
        k kVar;
        HotwordDetectedResult hotwordDetectedResult = eventPayload.getHotwordDetectedResult();
        if (hotwordDetectedResult == null) {
            ((C59052c) ((C59052c) f331188a.mo56225c()).mo56372aa(34165)).mo56386p("Hotword triggered, but no hotwordDetectedResult was found.");
            return null;
        }
        C90599p F = HotwordResult.m147742F();
        F.mo84732u(true);
        F.mo84734w(((float) hotwordDetectedResult.getPersonalizedScore()) / ((float) HotwordDetectedResult.getMaxScore()));
        F.mo84731t(((float) hotwordDetectedResult.getScore()) / ((float) HotwordDetectedResult.getMaxScore()));
        int hotwordPhraseId = hotwordDetectedResult.getHotwordPhraseId();
        int i2 = 2;
        C90578a aVar = (C90578a) F;
        aVar.f253215e = hotwordPhraseId != 1 ? hotwordPhraseId != 2 ? "unknown phrase" : "x_google" : "ok_google";
        int i3 = 0;
        F.mo84736y(hotwordDetectedResult.getConfidenceLevel() >= 3);
        F.mo84735x(z);
        aVar.f253211a = str;
        if (true != z) {
            i2 = 0;
        }
        F.mo84733v(i2);
        if (audioFormat != null) {
            F.mo84717f(audioFormat.getChannelCount());
            F.mo84728q(audioFormat.getSampleRate());
            F.mo84721j(audioFormat.getEncoding());
        } else {
            ((C59052c) ((C59052c) f331188a.mo56225c()).mo56372aa(34159)).mo56386p("AudioFormat not provided.");
        }
        if (z2 && audioFormat != null) {
            int hotwordOffsetMillis = hotwordDetectedResult.getHotwordOffsetMillis();
            if (hotwordOffsetMillis != -1) {
                i = (hotwordOffsetMillis + hotwordDetectedResult.getHotwordDurationMillis()) * k.a(audioFormat);
            } else {
                ((C59052c) ((C59052c) f331188a.mo56226d()).mo56372aa(34160)).mo56386p("No offset information provided, setting offset to 0.");
                i = 0;
            }
            byte[] bArr = new byte[i];
            if (axVar.mo56113h()) {
                kVar = (k) axVar.mo56107c();
            } else {
                kVar = new k();
            }
            ParcelFileDescriptor e = kVar.e(eventPayload, context, audioFormat, axVar2);
            if (e != null) {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(e);
                while (true) {
                    if (i <= 0) {
                        break;
                    }
                    try {
                        int read = autoCloseInputStream.read(bArr, i3, i);
                        i3 += read;
                        i -= read;
                        if (read < 0) {
                            ((C59052c) ((C59052c) f331188a.mo56225c()).mo56372aa(34164)).mo56386p("Read -1 bytes from hotword audio stream.");
                            break;
                        }
                    } catch (IOException e2) {
                        ((C59052c) ((C59052c) ((C59052c) f331188a.mo56225c()).mo56382g(e2)).mo56372aa(34163)).mo56386p("Cannot read from stream.");
                    }
                }
                if (i3 < 0) {
                    ((C59052c) ((C59052c) f331188a.mo56225c()).mo56372aa(34162)).mo56386p("There was an issue reading from the audio stream.");
                }
                aVar.f253216f = m197097e(e);
                aVar.f253212b = C58833ax.m90834k(bArr);
            } else {
                ((C59052c) ((C59052c) f331188a.mo56225c()).mo56372aa(34161)).mo56386p("Cannot open audio.");
            }
        }
        return F.mo84712a();
    }

    /* renamed from: e */
    private static Uri m197097e(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            long detachFd = (long) parcelFileDescriptor.detachFd();
            if (detachFd != -1) {
                return ContentUris.withAppendedId(C90721ae.f253802k, detachFd);
            }
            return null;
        } catch (IllegalStateException | NoSuchMethodError e) {
            ((C59052c) ((C59052c) ((C59052c) f331188a.mo56225c()).mo56382g(e)).mo56372aa(34155)).mo56386p("IllegalStateException thrown in getContentUri method");
            return null;
        }
    }
}
