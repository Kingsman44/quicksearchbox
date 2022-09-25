package com.google.android.libraries.lens.view.p2113h.p2120c;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.google.common.base.C58890d;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.h.c.g */
/* compiled from: PG */
public final class C26730g {

    /* renamed from: c */
    private static final C58974d f72857c = C58974d.m91135i("HeifImagePreprocessor");

    /* renamed from: d */
    private static final Object f72858d = new Object();

    /* renamed from: a */
    public boolean f72859a;

    /* renamed from: b */
    public boolean f72860b;

    /* renamed from: e */
    private boolean f72861e;

    /* renamed from: a */
    public final void mo32038a() {
        boolean z;
        synchronized (f72858d) {
            if (!this.f72861e) {
                System.nanoTime();
                List asList = Arrays.asList(new String[]{C58890d.m90988c("image/vnd.android.heic")});
                MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
                int length = codecInfos.length;
                int i = 0;
                loop0:
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    MediaCodecInfo mediaCodecInfo = codecInfos[i];
                    if (mediaCodecInfo.isEncoder()) {
                        for (String c : mediaCodecInfo.getSupportedTypes()) {
                            if (asList.contains(C58890d.m90988c(c))) {
                                mediaCodecInfo.getName();
                                z = true;
                                break loop0;
                            }
                        }
                        continue;
                    }
                    i++;
                }
                this.f72859a = z;
                this.f72860b = false;
                if (z) {
                    try {
                        this.f72860b = MediaCodec.createEncoderByType("image/vnd.android.heic").getCodecInfo().getCapabilitiesForType("image/vnd.android.heic").getEncoderCapabilities().isBitrateModeSupported(0);
                    } catch (Exception e) {
                        ((C58970a) ((C58970a) ((C58970a) f72857c.mo56226d()).mo56382g(e)).mo56372aa(49146)).mo56386p("***** evaluateHeifEncodingSupportHelper Can't create IMAGE_ANDROID_HEIC encoder.");
                    }
                }
                this.f72861e = true;
            }
        }
    }
}
