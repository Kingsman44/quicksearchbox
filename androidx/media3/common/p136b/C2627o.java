package androidx.media3.common.p136b;

import android.os.Handler;
import android.os.Message;
import androidx.media3.common.C2676t;
import androidx.media3.common.C2677u;
import java.util.Iterator;

/* renamed from: androidx.media3.common.b.o */
/* compiled from: PG */
public final /* synthetic */ class C2627o implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ C2632t f7288a;

    public /* synthetic */ C2627o(C2632t tVar) {
        this.f7288a = tVar;
    }

    public final boolean handleMessage(Message message) {
        C2632t tVar = this.f7288a;
        Iterator it = tVar.f7299d.iterator();
        while (it.hasNext()) {
            C2631s sVar = (C2631s) it.next();
            C2630r rVar = tVar.f7298c;
            if (!sVar.f7295d && sVar.f7294c) {
                C2677u a = sVar.f7293b.mo6348a();
                sVar.f7293b = new C2676t();
                sVar.f7294c = false;
                rVar.mo6029a(sVar.f7292a, a);
            }
            if (tVar.f7297b.mo6165d()) {
                return true;
            }
        }
        return true;
    }
}
