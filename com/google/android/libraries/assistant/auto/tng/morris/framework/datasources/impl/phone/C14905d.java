package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14594p;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone.d */
/* compiled from: PG */
public final class C14905d {

    /* renamed from: a */
    public static final /* synthetic */ int f44826a = 0;

    /* renamed from: b */
    private static final C59071e f44827b = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone.d");

    /* renamed from: c */
    private static final C58485gu f44828c = C58485gu.m89849q(C14594p.WIRED_HEADSET, C14594p.BLUETOOTH, C14594p.SPEAKER, C14594p.EARPIECE);

    /* renamed from: d */
    private final AudioManager f44829d;

    public C14905d(AudioManager audioManager, C14986h hVar) {
        this.f44829d = audioManager;
        audioManager.registerAudioDeviceCallback(new C14904c(this, hVar), (Handler) null);
    }

    /* renamed from: g */
    private final boolean m31341g(int[] iArr) {
        for (AudioDeviceInfo audioDeviceInfo : this.f44829d.getDevices(2)) {
            for (int i : iArr) {
                if (audioDeviceInfo.getType() == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final List mo21813a() {
        return (List) Collection.EL.stream(f44828c).filter(new C14887a(this)).collect(Collectors.toCollection(C14903b.f44823a));
    }

    /* renamed from: b */
    public final boolean mo21814b() {
        return m31341g(new int[]{7});
    }

    /* renamed from: c */
    public final boolean mo21815c() {
        return m31341g(new int[]{1});
    }

    /* renamed from: d */
    public final boolean mo21816d() {
        return m31341g(new int[]{2});
    }

    /* renamed from: e */
    public final boolean mo21817e() {
        return m31341g(new int[]{3, 22});
    }

    /* renamed from: f */
    public final boolean mo21818f(C14594p pVar) {
        C14594p pVar2 = C14594p.UNKNOWN;
        int ordinal = pVar.ordinal();
        if (ordinal == 1) {
            return mo21815c();
        }
        if (ordinal == 2) {
            return mo21816d();
        }
        if (ordinal == 3) {
            return mo21814b();
        }
        if (ordinal == 4) {
            return mo21817e();
        }
        C59104x c = f44827b.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.AudioOPDevColl");
        ((C59052c) ((C59052c) c).mo56372aa(45670)).mo56389s("#isAudioRouteAvailable(): Invalid callAudioRouteType: %s", pVar.name());
        return false;
    }
}
