package com.google.android.libraries.gsa.conversation.clientop.p1845e;

import android.media.AudioManager;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52134gm;
import com.google.assistant.p3897e.p3921j.C52136go;
import com.google.assistant.p3897e.p3921j.C52137gp;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.e.u */
/* compiled from: PG */
public final class C22455u extends C22538o {

    /* renamed from: a */
    private final C22454t f62017a;

    public C22455u(C22454t tVar) {
        this.f62017a = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        if (dyVar.f135936b.equals("device.UPDATE_VOLUME")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C52137gp gpVar = (C52137gp) m41992m(dwVar, "device_setting_params", C52137gp.f136808f.getParserForType());
            C22454t tVar = this.f62017a;
            int i = gpVar.f136811b;
            if ((gpVar.f136810a & 1) != 0 && (i < 0 || i > 100)) {
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.OUT_OF_RANGE, (String) null));
            }
            C52136go goVar = C52136go.UNSPECIFIED;
            C52136go a = C52136go.m86517a(gpVar.f136813d);
            if (a == null) {
                a = C52136go.UNSPECIFIED;
            }
            int ordinal = a.ordinal();
            int i2 = 2;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    i2 = 4;
                    if (ordinal != 4) {
                        i2 = ordinal != 5 ? 3 : 1;
                    }
                } else {
                    i2 = 5;
                }
            }
            AudioManager audioManager = (AudioManager) tVar.f62016a.mo27525b();
            int streamVolume = audioManager.getStreamVolume(i2);
            int streamMaxVolume = audioManager.getStreamMaxVolume(i2);
            boolean z = !gpVar.f136814e;
            int a2 = C52134gm.m86516a(gpVar.f136812c);
            if (a2 == 0) {
                a2 = 1;
            }
            int i3 = a2 - 1;
            if (i3 == 0) {
                audioManager.setStreamVolume(i2, Math.round(((float) (streamMaxVolume * i)) / 100.0f), z ? 1 : 0);
            } else if (i3 != 1) {
                if ((gpVar.f136810a & 1) != 0) {
                    audioManager.setStreamVolume(i2, Math.min(streamMaxVolume, streamVolume + ((i * streamMaxVolume) / 100)), z);
                } else {
                    audioManager.adjustStreamVolume(i2, 1, z);
                }
            } else if ((gpVar.f136810a & 1) != 0) {
                audioManager.setStreamVolume(i2, Math.max(0, streamVolume - ((streamMaxVolume * i) / 100)), z);
            } else {
                audioManager.adjustStreamVolume(i2, -1, z);
            }
            return C60856cj.m92900i(C22402a.f61893a);
        }
        throw new C22428d(dyVar);
    }
}
