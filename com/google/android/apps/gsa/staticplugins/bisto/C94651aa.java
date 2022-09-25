package com.google.android.apps.gsa.staticplugins.bisto;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.preferences.C86342v;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import dagger.p5294a.C68220f;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa */
/* compiled from: PG */
public final class C94651aa implements C68220f {
    /* renamed from: a */
    public static SharedPreferences m156162a(Context context, C86342v vVar) {
        C90476a aVar = C91018d.f254254a;
        return vVar.mo80095a(new File(context.getDir("shared_prefs", 0), "bistoproduct.bin"));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
