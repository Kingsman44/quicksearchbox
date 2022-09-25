package androidx.media;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.session.MediaSessionCompat;
import android.support.p031v4.p032os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.C1826m;

/* renamed from: androidx.media.am */
/* compiled from: PG */
final class C2415am extends Handler {

    /* renamed from: a */
    final /* synthetic */ C2416an f6683a;

    /* renamed from: b */
    private final C2413ak f6684b;

    public C2415am(C2416an anVar) {
        this.f6683a = anVar;
        this.f6684b = new C2413ak(anVar);
    }

    /* renamed from: a */
    public final void mo5827a(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    public final void handleMessage(Message message) {
        Message message2 = message;
        Bundle data = message.getData();
        switch (message2.what) {
            case 1:
                MediaSessionCompat.m652b(data.getBundle("data_root_hints"));
                C2413ak akVar = this.f6684b;
                String string = data.getString("data_package_name");
                int i = data.getInt("data_calling_pid");
                int i2 = data.getInt("data_calling_uid");
                C2414al alVar = new C2414al(message2.replyTo);
                C2416an anVar = akVar.f6681a;
                if (string != null) {
                    for (String equals : anVar.getPackageManager().getPackagesForUid(i2)) {
                        if (equals.equals(string)) {
                            akVar.f6681a.f6688d.mo5827a(new C2404ab(akVar, alVar, string, i, i2));
                            return;
                        }
                    }
                }
                throw new IllegalArgumentException("Package/uid mismatch: uid=" + i2 + " package=" + string);
            case 2:
                C2413ak akVar2 = this.f6684b;
                akVar2.f6681a.f6688d.mo5827a(new C2405ac(akVar2, new C2414al(message2.replyTo)));
                return;
            case 3:
                Bundle bundle = data.getBundle("data_options");
                MediaSessionCompat.m652b(bundle);
                C2413ak akVar3 = this.f6684b;
                akVar3.f6681a.f6688d.mo5827a(new C2406ad(akVar3, new C2414al(message2.replyTo), data.getString("data_media_item_id"), C1826m.m5004a(data, "data_callback_token"), bundle));
                return;
            case 4:
                C2413ak akVar4 = this.f6684b;
                akVar4.f6681a.f6688d.mo5827a(new C2407ae(akVar4, new C2414al(message2.replyTo), data.getString("data_media_item_id"), C1826m.m5004a(data, "data_callback_token")));
                return;
            case 5:
                C2413ak akVar5 = this.f6684b;
                String string2 = data.getString("data_media_item_id");
                ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                C2414al alVar2 = new C2414al(message2.replyTo);
                if (!TextUtils.isEmpty(string2) && resultReceiver != null) {
                    akVar5.f6681a.f6688d.mo5827a(new C2408af(akVar5, alVar2, string2, resultReceiver));
                    return;
                }
                return;
            case 6:
                MediaSessionCompat.m652b(data.getBundle("data_root_hints"));
                C2413ak akVar6 = this.f6684b;
                akVar6.f6681a.f6688d.mo5827a(new C2409ag(akVar6, new C2414al(message2.replyTo), data.getInt("data_calling_uid"), data.getString("data_package_name"), data.getInt("data_calling_pid")));
                return;
            case 7:
                C2413ak akVar7 = this.f6684b;
                akVar7.f6681a.f6688d.mo5827a(new C2410ah(akVar7, new C2414al(message2.replyTo)));
                return;
            case 8:
                MediaSessionCompat.m652b(data.getBundle("data_search_extras"));
                C2413ak akVar8 = this.f6684b;
                String string3 = data.getString("data_search_query");
                ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable("data_result_receiver");
                C2414al alVar3 = new C2414al(message2.replyTo);
                if (!TextUtils.isEmpty(string3) && resultReceiver2 != null) {
                    akVar8.f6681a.f6688d.mo5827a(new C2411ai(akVar8, alVar3, string3, resultReceiver2));
                    return;
                }
                return;
            case 9:
                Bundle bundle2 = data.getBundle("data_custom_action_extras");
                MediaSessionCompat.m652b(bundle2);
                C2413ak akVar9 = this.f6684b;
                String string4 = data.getString("data_custom_action");
                ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable("data_result_receiver");
                C2414al alVar4 = new C2414al(message2.replyTo);
                if (!TextUtils.isEmpty(string4) && resultReceiver3 != null) {
                    akVar9.f6681a.f6688d.mo5827a(new C2412aj(akVar9, alVar4, string4, bundle2, resultReceiver3));
                    return;
                }
                return;
            default:
                Log.w("MBServiceCompat", "Unhandled message: " + message2 + "\n  Service version: 2\n  Client version: " + message2.arg1);
                return;
        }
    }

    public final boolean sendMessageAtTime(Message message, long j) {
        Bundle data = message.getData();
        data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
        data.putInt("data_calling_uid", Binder.getCallingUid());
        int callingPid = Binder.getCallingPid();
        if (callingPid > 0) {
            data.putInt("data_calling_pid", callingPid);
        } else if (!data.containsKey("data_calling_pid")) {
            data.putInt("data_calling_pid", -1);
        }
        return super.sendMessageAtTime(message, j);
    }
}
