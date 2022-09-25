package com.google.android.apps.gsa.staticplugins.opa;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.gsa.shared.util.p7159c.C90904ba;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ma */
/* compiled from: PG */
final class C109462ma extends C90904ba {

    /* renamed from: a */
    final /* synthetic */ C109465md f304882a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109462ma(C109465md mdVar) {
        super("Close audio provider");
        this.f304882a = mdVar;
    }

    public final void run() {
        C109465md mdVar = this.f304882a;
        if (!mdVar.f304889e) {
            Uri uri = mdVar.f304888d;
            if (uri != null) {
                C58976aa aaVar = C58975e.f156826a;
                try {
                    ParcelFileDescriptor openFileDescriptor = mdVar.f54539k.getContentResolver().openFileDescriptor(uri, C33259r.f88929b);
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                } catch (SecurityException e) {
                    C59104x c = C109465md.f304885a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "OpaDismissKeyguardAct");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(22959)).mo56386p("#closeAudioProvider");
                } catch (FileNotFoundException e2) {
                    C59104x c2 = C109465md.f304885a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "OpaDismissKeyguardAct");
                    ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(22960)).mo56386p("#closeAudioProvider");
                } catch (IOException e3) {
                    C59104x c3 = C109465md.f304885a.mo56225c();
                    c3.mo56378ag(C58975e.f156826a, "OpaDismissKeyguardAct");
                    ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e3)).mo56372aa(22961)).mo56386p("#closeAudioProvider");
                }
            }
            C109465md mdVar2 = this.f304882a;
            mdVar2.f304888d = null;
            mdVar2.f304886b.mo83755a((Throwable) null, 63993905, 29).mo83721a();
        }
    }
}
