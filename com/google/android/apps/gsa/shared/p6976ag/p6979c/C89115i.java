package com.google.android.apps.gsa.shared.p6976ag.p6979c;

import android.content.Context;
import android.media.AudioManager;
import android.provider.Settings;
import com.google.android.apps.gsa.staticplugins.actions.p7353a.p7354a.C93250a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C52112fr;
import com.google.assistant.p3897e.p3921j.C52114ft;
import com.google.assistant.p3897e.p3921j.C52115fu;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4535g.C59203do;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;
import java.util.concurrent.TimeoutException;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.gsa.shared.ag.c.i */
/* compiled from: PG */
final class C89115i extends C89107a {

    /* renamed from: c */
    private static final C59071e f241578c = C59071e.m91332i("com.google.android.apps.gsa.shared.ag.c.i");

    /* renamed from: d */
    private final C93250a f241579d;

    public C89115i(int i, Context context, C22871g gVar, C93250a aVar) {
        super(i, context);
        this.f241579d = aVar;
    }

    /* renamed from: e */
    private final boolean m144964e(C63490p pVar, int i, int i2, double d) {
        int a = C89111e.m144950a(pVar.name());
        try {
            int streamVolume = this.f241579d.f260022a.getStreamVolume(a);
            int streamMaxVolume = this.f241579d.f260022a.getStreamMaxVolume(a);
            int g = C89111e.m144956g(i, i2, C89111e.m144955f(i, i2, d, streamVolume, 0, streamMaxVolume), streamVolume, 0, streamMaxVolume);
            if (g == -1) {
                return false;
            }
            return mo83098d(a, (float) g);
        } catch (InterruptedException e) {
            ((C59052c) ((C59052c) ((C59052c) f241578c.mo56225c()).mo56382g(e)).mo56372aa(10984)).mo56386p("Interrupted while waiting for StreamVolumeManager");
            Thread.currentThread().interrupt();
            return false;
        } catch (TimeoutException e2) {
            ((C59052c) ((C59052c) ((C59052c) f241578c.mo56225c()).mo56382g(e2)).mo56372aa(10985)).mo56386p("Timed out while waiting for StreamVolumeManager");
            return false;
        }
    }

    /* renamed from: a */
    public final Integer mo83095a(String str) {
        int i;
        int i2;
        if (C58837ba.m90859h(str)) {
            return null;
        }
        int a = C89111e.m144950a(str);
        if (a != -1) {
            AudioManager audioManager = (AudioManager) this.f241539a.getSystemService("audio");
            i2 = audioManager.getStreamVolume(a);
            i = audioManager.getStreamMaxVolume(a);
        } else {
            if (C63490p.BRIGHTNESS_LEVEL.name().equals(str)) {
                try {
                    i2 = Settings.System.getInt(this.f241539a.getContentResolver(), "screen_brightness");
                    i = PrivateKeyType.INVALID;
                } catch (Settings.SettingNotFoundException unused) {
                }
            }
            return null;
        }
        return C89111e.m144953d(0, i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo83096b(C63490p pVar, int i) {
        AudioManager audioManager = (AudioManager) this.f241539a.getSystemService("audio");
        int a = C89111e.m144950a(pVar.name());
        if (C89114h.m144960a(audioManager, pVar, i).booleanValue()) {
            return true;
        }
        if (i == -100) {
            return m144964e(pVar, 7, 3, C59203do.f157270a);
        }
        if (i != 100) {
            ((C59052c) ((C59052c) f241578c.mo56225c()).mo56372aa(10986)).mo56352E("Error mute/unmute stream volume, setting = %s, direction = %d.", pVar.name(), i);
            return false;
        } else if (audioManager.getStreamVolume(a) == 0) {
            return m144964e(pVar, 5, 1, C59203do.f157270a);
        } else {
            ((C59052c) ((C59052c) f241578c.mo56224b()).mo56372aa(10987)).mo56389s("Current volume stream (setting = %s) is not muted, so skip unmute volume.", pVar.name());
            return true;
        }
    }

    /* renamed from: c */
    public final boolean mo83097c(C52115fu fuVar) {
        C63490p pVar;
        if ((fuVar.f136755a & 16) == 0) {
            return false;
        }
        try {
            pVar = C63490p.m96249a(fuVar.f136760f);
        } catch (IllegalArgumentException unused) {
            pVar = C63490p.UNSPECIFIED;
        }
        C63490p pVar2 = pVar;
        int ordinal = pVar2.ordinal();
        if (!(ordinal == 10 || ordinal == 68 || ordinal == 85 || ordinal == 99 || ordinal == 123)) {
            if (ordinal == 32) {
                try {
                    int i = Settings.System.getInt(this.f241539a.getContentResolver(), "screen_brightness");
                    int b = C52112fr.m86508b(fuVar.f136757c);
                    if (b == 0) {
                        b = 1;
                    }
                    int a = C52114ft.m86509a(fuVar.f136759e);
                    if (a == 0) {
                        a = 1;
                    }
                    int i2 = b;
                    int i3 = a;
                    int i4 = i;
                    int g = C89111e.m144956g(i2, i3, C89111e.m144955f(i2, i3, fuVar.f136758d, i4, 0, PrivateKeyType.INVALID), i4, 0, PrivateKeyType.INVALID);
                    if (g == -1) {
                        return false;
                    }
                    int min = Math.min(PrivateKeyType.INVALID, Math.max(0, g));
                    Settings.System.putInt(this.f241539a.getContentResolver(), "screen_brightness_mode", 0);
                    Settings.System.putInt(this.f241539a.getContentResolver(), "screen_brightness", (int) ((float) min));
                    return true;
                } catch (Settings.SettingNotFoundException unused2) {
                    return false;
                }
            } else if (ordinal != 33) {
                return false;
            }
        }
        int i5 = this.f241540b;
        if (i5 == 2) {
            return mo83096b(pVar2, 100);
        }
        if (i5 == 3) {
            return mo83096b(pVar2, -100);
        }
        int a2 = C52114ft.m86509a(fuVar.f136759e);
        return m144964e(pVar2, i5, a2 == 0 ? 1 : a2, fuVar.f136758d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo83098d(int i, float f) {
        try {
            this.f241579d.mo87582a(i, (int) f);
            return true;
        } catch (SecurityException e) {
            ((C59052c) ((C59052c) ((C59052c) f241578c.mo56225c()).mo56382g(e)).mo56372aa(10990)).mo56392v("Error setting stream volume, stream=%d, newValue=%f", i, f);
            return false;
        } catch (InterruptedException e2) {
            ((C59052c) ((C59052c) ((C59052c) f241578c.mo56225c()).mo56382g(e2)).mo56372aa(10991)).mo56386p("Interrupted while waiting for StreamVolumeManager");
            Thread.currentThread().interrupt();
            return false;
        } catch (TimeoutException e3) {
            ((C59052c) ((C59052c) ((C59052c) f241578c.mo56225c()).mo56382g(e3)).mo56372aa(10992)).mo56386p("Timed out while waiting for StreamVolumeManager");
            return false;
        }
    }
}
