package com.google.android.apps.gsa.shared.p6976ag.p6979c;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import androidx.core.p097i.C1970e;
import androidx.slice.C4110i;
import com.google.android.apps.gsa.search.shared.p6930h.C87570m;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.assistant.p3897e.p3921j.C52112fr;
import com.google.assistant.p3897e.p3921j.C52114ft;
import com.google.assistant.p3897e.p3921j.C52115fu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4535g.C59203do;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;

/* renamed from: com.google.android.apps.gsa.shared.ag.c.h */
/* compiled from: PG */
public final class C89114h {

    /* renamed from: a */
    public static final C59071e f241576a = C59071e.m91332i("com.google.android.apps.gsa.shared.ag.c.h");

    /* renamed from: b */
    private final Context f241577b;

    public C89114h(Context context) {
        this.f241577b = context;
    }

    /* renamed from: a */
    public static Boolean m144960a(AudioManager audioManager, C63490p pVar, int i) {
        int a = C89111e.m144950a(pVar.name());
        if (!C89108b.f241542b.contains(pVar)) {
            return false;
        }
        audioManager.adjustStreamVolume(a, i, 0);
        return true;
    }

    /* renamed from: c */
    public final boolean mo83093c(C87570m mVar, C63490p pVar, int i) {
        AudioManager audioManager = (AudioManager) this.f241577b.getSystemService("audio");
        if (m144960a(audioManager, pVar, i).booleanValue()) {
            return true;
        }
        if (i == -100) {
            return mo83094d(mVar, 7, 3, C59203do.f157270a);
        }
        if (i != 100) {
            ((C59052c) ((C59052c) f241576a.mo56225c()).mo56372aa(10983)).mo56352E("Error mute/unmute stream volume, setting = %s, direction = %d.", pVar.name(), i);
            return false;
        } else if (audioManager.getStreamVolume(C89111e.m144950a(pVar.name())) == 0) {
            return mo83094d(mVar, 5, 1, C59203do.f157270a);
        } else {
            return true;
        }
    }

    /* renamed from: d */
    public final boolean mo83094d(C87570m mVar, int i, int i2, double d) {
        int i3;
        C1970e d2;
        C87570m mVar2 = mVar;
        int b = new C4110i(mVar2.f236584b, mVar2.f236585c).mo8613b();
        if (mVar.mo81692d() && b != -1) {
            C1970e d3 = new C4110i(mVar2.f236584b, mVar2.f236585c).mo8615d();
            int intValue = d3 != null ? ((Integer) d3.f5888a).intValue() : -1;
            C4110i iVar = new C4110i(mVar2.f236584b, mVar2.f236585c);
            if (iVar.mo8615d() == null || (d2 = iVar.mo8615d()) == null) {
                i3 = -1;
            } else {
                i3 = ((Integer) d2.f5889b).intValue();
            }
            if (!(intValue == -1 || i3 == -1 || i3 - intValue <= 0)) {
                int i4 = i;
                int i5 = i2;
                int i6 = b;
                int i7 = intValue;
                int i8 = i3;
                int g = C89111e.m144956g(i4, i5, C89111e.m144955f(i4, i5, d, i6, i7, i8), i6, i7, i8);
                if (g == -1) {
                    return false;
                }
                return mVar.mo81691c(new C4110i(mVar2.f236584b, mVar2.f236585c).mo8614c(), new Intent().putExtra("android.app.slice.extra.RANGE_VALUE", g));
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo83092b(C89109c cVar, C52115fu fuVar) {
        if (fuVar == null) {
            return false;
        }
        int i = fuVar.f136755a;
        if ((i & 2) != 0) {
            int i2 = fuVar.f136757c;
            int b = C52112fr.m86508b(i2);
            int i3 = 1;
            if (b == 0) {
                b = 1;
            }
            String str = "0";
            switch (b - 1) {
                case 1:
                    return cVar.mo83087h("1");
                case 2:
                    return cVar.mo83087h(str);
                case 3:
                    String f = cVar.mo83085f(false);
                    if (!cVar.f241558f) {
                        return false;
                    }
                    if (true != "1".equals(f)) {
                        str = "1";
                    }
                    return cVar.mo83087h(str);
                case 4:
                case 5:
                    break;
                case 6:
                    if ((i & 32) != 0) {
                        return cVar.mo83087h(Integer.toString(fuVar.f136761g));
                    }
                    break;
                default:
                    C59052c cVar2 = (C59052c) ((C59052c) f241576a.mo56226d()).mo56372aa(10980);
                    int b2 = C52112fr.m86508b(fuVar.f136757c);
                    if (b2 != 0) {
                        i3 = b2;
                    }
                    cVar2.mo56389s("Unsupported change type %s", C52112fr.m86507a(i3));
                    return false;
            }
            int b3 = C52112fr.m86508b(i2);
            if (b3 == 0) {
                b3 = 1;
            }
            int a = C52114ft.m86509a(fuVar.f136759e);
            if (a == 0) {
                a = 1;
            }
            double d = fuVar.f136758d;
            int a2 = cVar.mo83080a();
            if (cVar.f241558f && a2 != -1) {
                int c = cVar.mo83082c();
                int b4 = cVar.mo83081b();
                if (b4 - c > 0) {
                    int i4 = b3;
                    int i5 = a;
                    int i6 = a2;
                    int i7 = c;
                    int i8 = b4;
                    int g = C89111e.m144956g(i4, i5, C89111e.m144955f(i4, i5, d, i6, i7, i8), i6, i7, i8);
                    if (g != -1) {
                        return cVar.mo83087h(Integer.toString(g));
                    }
                }
            }
            return false;
        }
        throw new C22534k();
    }
}
