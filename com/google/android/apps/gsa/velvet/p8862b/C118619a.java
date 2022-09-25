package com.google.android.apps.gsa.velvet.p8862b;

import android.content.Context;
import android.os.Process;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7180q.C91084c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.velvet.b.a */
/* compiled from: PG */
public final class C118619a implements C68214a {

    /* renamed from: a */
    final /* synthetic */ Context f330922a;

    public C118619a(Context context) {
        this.f330922a = context;
    }

    /* renamed from: a */
    public final C58833ax mo27525b() {
        C90748e.m148224b();
        C91084c a = C118620b.m196923a();
        if (a == null) {
            C58976aa aaVar = C58975e.f156826a;
            return C58836b.f156633a;
        }
        File file = new File(new File(this.f330922a.getFilesDir(), "native_crash_dir"), a.f254376p);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, String.valueOf(Process.myPid()));
        C58976aa aaVar2 = C58975e.f156826a;
        return C58833ax.m90834k(file2);
    }
}
