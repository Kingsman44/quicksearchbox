package com.google.android.libraries.search.assistant.notification.p2711b;

import com.google.android.libraries.search.assistant.notification.data.MessageNotification;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.notification.b.f */
/* compiled from: PG */
public final /* synthetic */ class C34858f implements Callable {

    /* renamed from: a */
    public final /* synthetic */ List f92448a;

    public /* synthetic */ C34858f(List list) {
        this.f92448a = list;
    }

    public final Object call() {
        List<C60870cx> list = this.f92448a;
        Pattern pattern = C34860h.f92449a;
        C58480gp e = C58485gu.m89837e();
        for (C60870cx r : list) {
            Optional optional = (Optional) C60856cj.m92909r(r);
            if (optional.isPresent()) {
                MessageNotification messageNotification = (MessageNotification) optional.get();
                if (!messageNotification.mo39566v().equals("com.whatsapp") || (messageNotification.mo39544c().isPresent() && ((MessageNotification.Actions) messageNotification.mo39544c().get()).mo39568a().isPresent())) {
                    e.mo55395g((MessageNotification) optional.get());
                }
            }
        }
        return e.mo55394f();
    }
}
