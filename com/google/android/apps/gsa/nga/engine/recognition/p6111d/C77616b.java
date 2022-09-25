package com.google.android.apps.gsa.nga.engine.recognition.p6111d;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.gsa.nga.engine.p5900ag.C74820be;
import com.google.android.apps.gsa.nga.engine.recognition.C77566as;
import com.google.android.apps.gsa.nga.shared.p6334b.C81016b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.d.b */
/* compiled from: PG */
public final class C77616b {

    /* renamed from: c */
    private static final C58974d f213836c = C58974d.m91136j();

    /* renamed from: a */
    public final C81016b f213837a;

    /* renamed from: b */
    public final C74820be f213838b;

    /* renamed from: d */
    private final Context f213839d;

    public C77616b(Context context, C81016b bVar, C74820be beVar) {
        this.f213839d = context;
        this.f213837a = bVar;
        this.f213838b = beVar;
    }

    /* renamed from: a */
    public final void mo72745a(Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = this.f213839d.getContentResolver().openFileDescriptor(uri, C33259r.f88929b);
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
            }
        } catch (IOException e) {
            ((C58970a) ((C58970a) ((C58970a) f213836c.mo56226d()).mo56382g(e)).mo56372aa(4332)).mo56386p("Failed to open/close file descriptor");
        }
    }

    /* renamed from: b */
    public final void mo72746b(C77566as asVar) {
        if (asVar.mo72686i().isPresent()) {
            mo72745a((Uri) asVar.mo72686i().get());
        }
    }
}
