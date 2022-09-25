package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.view.View;
import com.google.android.libraries.assistant.p1363c.p1364a.p1365a.C16941d;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16993q;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.p4750c.C62948a;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.e */
/* compiled from: PG */
public final /* synthetic */ class C33371e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C33375i f89414a;

    public /* synthetic */ C33371e(C33375i iVar) {
        this.f89414a = iVar;
    }

    public final void onClick(View view) {
        C33375i iVar = this.f89414a;
        int i = iVar.f89429m;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 != 2) {
            if (i2 == 3 && iVar.mo38819i()) {
                int a = C16993q.m34086a(((C16941d) iVar.f89422f.mo27525b()).mo23093c().f49621a);
                if (a != 0 && a == 2) {
                    int a2 = C16993q.m34086a(((C16941d) iVar.f89422f.mo27525b()).mo23096f(C62948a.f169987b).f49621a);
                    if (a2 == 0 || a2 != 2) {
                        ((C59052c) ((C59052c) C33375i.f89417a.mo56226d()).mo56372aa(51002)).mo56386p("Failed to stop playing the recorded audio media");
                        return;
                    }
                    return;
                }
                ((C59052c) ((C59052c) C33375i.f89417a.mo56226d()).mo56372aa(51003)).mo56386p("Failed to stop");
            }
        } else if (iVar.mo38819i()) {
            int a3 = C16993q.m34086a(((C16941d) iVar.f89422f.mo27525b()).mo23096f(C62948a.f169987b).f49621a);
            if (a3 != 0 && a3 == 2) {
                int a4 = C16993q.m34086a(((C16941d) iVar.f89422f.mo27525b()).mo23094d().f49621a);
                if (a4 == 0 || a4 != 2) {
                    ((C59052c) ((C59052c) C33375i.f89417a.mo56226d()).mo56372aa(50999)).mo56386p("Failed to play the recorded audio media");
                    return;
                }
                return;
            }
            ((C59052c) ((C59052c) C33375i.f89417a.mo56226d()).mo56372aa(51000)).mo56386p("Failed to seek to start");
        }
    }
}
