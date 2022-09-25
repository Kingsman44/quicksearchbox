package com.google.p5261vr.p5262a.p5263a.p5264a;

import android.util.Log;
import com.google.p5261vr.p5262a.p5263a.p5265b.C67931a;
import com.google.p5261vr.p5262a.p5263a.p5265b.C67932b;
import com.google.p5261vr.p5262a.p5263a.p5265b.C67933c;
import org.p5633c.p5634a.C72210d;
import org.p5633c.p5634a.C72288l;

/* renamed from: com.google.vr.a.a.a.r */
/* compiled from: PG */
public final class C67929r {

    /* renamed from: a */
    public static final C72210d f184108a = new C72210d(0, C72288l.f192416b);

    /* renamed from: b */
    public final C67923l f184109b;

    /* renamed from: c */
    public final String f184110c = "ArViewer.Analytics.ActiveUserDiffs.";

    /* renamed from: d */
    public final C67933c f184111d;

    public C67929r(C67923l lVar, C67933c cVar) {
        this.f184109b = lVar;
        this.f184111d = cVar;
    }

    /* renamed from: a */
    public static int m98211a(String str, int i, C67933c cVar, C67932b bVar) {
        int i2 = -1;
        try {
            i2 = cVar.f184124a.getInt(str, -1);
        } catch (ClassCastException e) {
            throw new C67931a(str, Integer.class, e);
        } catch (C67931a e2) {
            Log.d("PlatformActiveUserDiffLogger", "Bad shared preference value found for key ".concat(str), e2);
        }
        bVar.f184123a.putInt(str, i);
        return i2;
    }
}
