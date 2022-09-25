package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.content.ComponentName;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.ai */
/* compiled from: PG */
public final /* synthetic */ class C18809ai implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C18820at f52953a;

    /* renamed from: b */
    public final /* synthetic */ List f52954b;

    public /* synthetic */ C18809ai(C18820at atVar, List list) {
        this.f52953a = atVar;
        this.f52954b = list;
    }

    public final Object apply(Object obj) {
        C18820at atVar = this.f52953a;
        List list = this.f52954b;
        Throwable th = (Throwable) obj;
        ((C59052c) ((C59052c) ((C59052c) C18820at.f52972a.mo56225c()).mo56382g(th)).mo56372aa(47408)).mo56386p("#getMediaItemListByComponentName() has error (e.g. timeout) ...");
        boolean booleanValue = ((Boolean) atVar.f52982k.map(C18806af.f52948a).orElse(false)).booleanValue();
        if (((Boolean) atVar.f52985n.mo17428b()).booleanValue()) {
            atVar.f52976e.post(new C18807ag(atVar));
        }
        if (!(th instanceof TimeoutException)) {
            int f = atVar.mo24170f();
            ComponentName componentName = atVar.f52973b;
            if (f == 1) {
                f = 9;
            }
            return atVar.mo24171g(componentName, list, f, (String) atVar.f52979h.mo24193a().orElse(String.format("Exception %s", new Object[]{th.getMessage()})));
        } else if (booleanValue) {
            return atVar.mo24171g(atVar.f52973b, list, 19, "Root node subscription not returned and timed out");
        } else {
            return atVar.mo24171g(atVar.f52973b, list, 3, "Get media items by component name timeout");
        }
    }
}
