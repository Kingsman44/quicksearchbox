package com.google.android.apps.gsa.staticplugins.backup.p7438b.p7439a;

import android.content.Context;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.core.preferences.C86346z;
import com.google.android.apps.gsa.shared.p7040g.C89767a;
import com.google.android.apps.gsa.shared.p7040g.C89768b;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.staticplugins.backup.AgsaBackupAgentHelper;
import com.google.android.apps.gsa.staticplugins.backup.C94481i;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;
import java.io.FileOutputStream;

/* renamed from: com.google.android.apps.gsa.staticplugins.backup.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C94464a implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ int f264071a;

    /* renamed from: b */
    public final /* synthetic */ C86338r f264072b;

    /* renamed from: c */
    public final /* synthetic */ C86338r f264073c;

    /* renamed from: d */
    public final /* synthetic */ Context f264074d;

    public /* synthetic */ C94464a(int i, C86338r rVar, C86338r rVar2, Context context) {
        this.f264071a = i;
        this.f264072b = rVar;
        this.f264073c = rVar2;
        this.f264074d = context;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        int i = this.f264071a;
        C86338r rVar = this.f264072b;
        C86338r rVar2 = this.f264073c;
        Context context = this.f264074d;
        C58976aa aaVar = C58975e.f156826a;
        C89767a aVar = (C89767a) C89768b.f242960f.createBuilder();
        aVar.copyOnWrite();
        C89768b bVar = (C89768b) aVar.instance;
        bVar.f242962a |= 1;
        bVar.f242963b = i;
        C63088z byteString = ((C86346z) rVar).mo80101g(C94481i.f264170a).toByteString();
        aVar.copyOnWrite();
        C89768b bVar2 = (C89768b) aVar.instance;
        byteString.getClass();
        bVar2.f242962a |= 2;
        bVar2.f242964c = byteString;
        C63088z byteString2 = ((C86346z) rVar2).mo80101g(C94481i.f264171b).toByteString();
        aVar.copyOnWrite();
        C89768b bVar3 = (C89768b) aVar.instance;
        byteString2.getClass();
        bVar3.f242962a |= 4;
        bVar3.f242965d = byteString2;
        String string = rVar2.getString(C90507o.f253011a, (String) null);
        if (string != null) {
            aVar.copyOnWrite();
            C89768b bVar4 = (C89768b) aVar.instance;
            bVar4.f242962a |= 8;
            bVar4.f242966e = string;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(AgsaBackupAgentHelper.getBackupFile(context));
        ((C89768b) aVar.build()).writeTo(fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        return C118826c.f331422a;
    }
}
