package androidx.media3.p174ui;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import androidx.media3.common.C2646bh;

/* renamed from: androidx.media3.ui.j */
/* compiled from: PG */
public final /* synthetic */ class C3646j implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ C3652p f11709a;

    public /* synthetic */ C3646j(C3652p pVar) {
        this.f11709a = pVar;
    }

    public final boolean handleMessage(Message message) {
        C3652p pVar = this.f11709a;
        int i = message.what;
        if (i == 0) {
            C2646bh bhVar = pVar.f11726c;
            if (bhVar == null) {
                return true;
            }
            pVar.mo7703g(bhVar, (Bitmap) null);
            return true;
        } else if (i != 1) {
            return false;
        } else {
            if (pVar.f11726c == null || !pVar.f11727d || pVar.f11728e != message.arg1) {
                return true;
            }
            pVar.mo7703g(pVar.f11726c, (Bitmap) message.obj);
            return true;
        }
    }
}
