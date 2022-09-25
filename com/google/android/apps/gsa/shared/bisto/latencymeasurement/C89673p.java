package com.google.android.apps.gsa.shared.bisto.latencymeasurement;

import android.media.AudioRecord;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.shared.bisto.latencymeasurement.p */
/* compiled from: PG */
public final class C89673p implements C89671n {

    /* renamed from: b */
    private static final C59071e f242791b = C59071e.m91332i("com.google.android.apps.gsa.shared.bisto.latencymeasurement.p");

    /* renamed from: a */
    AudioRecord f242792a;

    /* renamed from: c */
    private int f242793c;

    /* renamed from: a */
    public final void mo83574a() {
        AudioRecord audioRecord = this.f242792a;
        if (audioRecord != null) {
            audioRecord.release();
        }
    }

    /* renamed from: c */
    public final float[] mo83576c() {
        int i = this.f242793c;
        float[] fArr = new float[i];
        AudioRecord audioRecord = this.f242792a;
        if (audioRecord == null) {
            return new float[0];
        }
        return Arrays.copyOf(fArr, audioRecord.read(fArr, 0, i, 0));
    }

    /* renamed from: d */
    public final void mo83577d(int i) {
        int i2 = i * 10;
        this.f242793c = i2;
        AudioRecord audioRecord = new AudioRecord(6, i, 16, 4, i2 * 4);
        this.f242792a = audioRecord;
        if (audioRecord.getState() != 1) {
            C59104x c = f242791b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "PhoneRecorder");
            ((C59052c) ((C59052c) c).mo56372aa(10499)).mo56387q("recorder not initialized, sample rate=%d", i);
            return;
        }
        this.f242792a.startRecording();
    }

    /* renamed from: b */
    public final void mo83575b() {
        AudioRecord audioRecord = this.f242792a;
        audioRecord.getClass();
        audioRecord.stop();
    }
}
