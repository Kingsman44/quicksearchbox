package com.google.android.libraries.elements.p1714d.p1719e;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.facebook.litho.C6405o;
import com.facebook.litho.C6411u;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.interfaces.C21248ar;
import com.google.android.libraries.elements.interfaces.C21271bn;
import com.google.android.libraries.elements.interfaces.C21310q;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.p370af.C7490c;
import com.google.p370af.C7492e;
import com.youtube.p5283a.p5284a.C68037a;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.libraries.elements.d.e.a */
/* compiled from: PG */
public final class C20932a implements C21271bn {
    /* renamed from: e */
    public static void m39370e(C68037a aVar, C21248ar arVar) {
        if ((arVar.mo25933g() || arVar.mo25931e() || arVar.mo25932f()) && C7490c.m22726p(aVar, 14)) {
            arVar.mo25928E().mo13447u(aVar.mo60082h());
        }
    }

    /* renamed from: a */
    public final int mo26066a() {
        return 168774763;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo25838b(C6411u uVar, C21319z zVar, String str, Object obj, C21248ar arVar, C21310q qVar) {
        C68037a aVar = (C68037a) obj;
        C6405o E = arVar.mo25928E();
        int a = aVar.mo16913a(6);
        String str2 = null;
        String d = a != 0 ? aVar.mo16916d(a + aVar.f24703a) : null;
        int a2 = aVar.mo16913a(4);
        String d2 = a2 != 0 ? aVar.mo16916d(a2 + aVar.f24703a) : null;
        boolean z = !TextUtils.isEmpty(d);
        boolean z2 = !TextUtils.isEmpty(d2);
        if (z && z2) {
            str2 = d2 + " " + d;
        } else if (z) {
            str2 = d;
        } else if (z2) {
            str2 = d2;
        }
        if (!TextUtils.isEmpty(aVar.mo60081g())) {
            E.mo13420D(aVar.mo60081g());
        }
        if (str2 != null) {
            E.mo13446t(str2);
        }
        if (C7490c.m22726p(aVar, 14)) {
            E.mo13447u(aVar.mo60082h());
        }
        String g = aVar.mo60081g();
        if (!TextUtils.isEmpty(g) && aVar.mo60082h()) {
            arVar.mo25949w(R.id.elements_accessibility_view_tag_id, g);
        }
        int i = 0;
        int i2 = 1;
        boolean z3 = false;
        while (true) {
            int a3 = aVar.mo16913a(12);
            if (i < (a3 != 0 ? aVar.mo16915c(a3) : 0)) {
                int a4 = aVar.mo16913a(12);
                int i3 = a4 != 0 ? aVar.f24704b.getInt(aVar.mo16914b(a4) + (i * 4)) : 0;
                if (!(i3 == 2 || i3 == 4)) {
                    if (i3 != 7) {
                        switch (i3) {
                            case 10:
                                z3 = true;
                                continue;
                            case 11:
                            case 12:
                            case 14:
                                break;
                            case 13:
                                E.f18980c.mo13456J().mo13411E().mo13040J(true);
                                E.mo13268k();
                                continue;
                        }
                    } else {
                        E.f18980c.mo13456J().mo13411E().mo13049S(false);
                        E.mo13268k();
                    }
                    i++;
                }
                if (i3 > i2) {
                    i2 = i3;
                }
                i++;
            } else {
                E.f18980c.mo13456J().mo13411E().mo13041K(i2 != 2 ? i2 != 4 ? i2 != 14 ? i2 != 11 ? i2 != 12 ? BuildConfig.FLAVOR : "android.widget.RadioButton" : "android.widget.Spinner" : "android.widget.CompoundButton" : "android.widget.ImageView" : "android.widget.Button");
                E.mo13268k();
                if (i2 == 12 || i2 == 14) {
                    arVar.mo25950x();
                    arVar.mo25951y(z3);
                }
                int a5 = aVar.mo16913a(16);
                if (a5 != 0) {
                    int i4 = aVar.f24704b.getInt(a5 + aVar.f24703a);
                    if (i4 == 1) {
                        E.mo13448v(1);
                        return;
                    } else if (i4 == 2) {
                        E.mo13448v(8);
                        return;
                    } else if (i4 == 3) {
                        E.mo13448v(2);
                        return;
                    } else if (i4 == 4) {
                        E.mo13448v(4);
                        return;
                    }
                }
                E.mo13448v(0);
                return;
            }
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo25839c(C21248ar arVar) {
    }

    /* renamed from: d */
    public final /* synthetic */ C7492e mo26067d(ByteBuffer byteBuffer) {
        C68037a aVar = new C68037a();
        C68037a.m98237i(byteBuffer, aVar);
        return aVar;
    }
}
