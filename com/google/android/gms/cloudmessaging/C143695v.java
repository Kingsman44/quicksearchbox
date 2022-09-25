package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import androidx.p060c.C0984n;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import java.util.regex.Matcher;

/* renamed from: com.google.android.gms.cloudmessaging.v */
/* compiled from: PG */
final class C143695v extends C144861c {

    /* renamed from: a */
    final /* synthetic */ C143696w f389560a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C143695v(C143696w wVar, Looper looper) {
        super(looper);
        this.f389560a = wVar;
    }

    public final void handleMessage(Message message) {
        C143696w wVar = this.f389560a;
        if (message == null || !(message.obj instanceof Intent)) {
            Log.w("Rpc", "Dropping invalid message");
            return;
        }
        Intent intent = (Intent) message.obj;
        intent.setExtrasClassLoader(new C143675b());
        if (intent.hasExtra("google.messenger")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
            if (parcelableExtra instanceof CloudMessagingMessengerCompat) {
                wVar.f389569g = (CloudMessagingMessengerCompat) parcelableExtra;
            }
            if (parcelableExtra instanceof Messenger) {
                wVar.f389568f = (Messenger) parcelableExtra;
            }
        }
        Intent intent2 = (Intent) message.obj;
        String action = intent2.getAction();
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
            String stringExtra = intent2.getStringExtra("registration_id");
            if (stringExtra == null) {
                stringExtra = intent2.getStringExtra("unregistered");
            }
            if (stringExtra == null) {
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(String.valueOf(intent2.getExtras()))));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                }
                if (stringExtra2.startsWith("|")) {
                    String[] split = stringExtra2.split("\\|");
                    if (split.length <= 2 || !"ID".equals(split[1])) {
                        Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                        return;
                    }
                    String str = split[2];
                    String str2 = split[3];
                    if (str2.startsWith(":")) {
                        str2 = str2.substring(1);
                    }
                    wVar.mo119066b(str, intent2.putExtra("error", str2).getExtras());
                    return;
                }
                synchronized (wVar.f389565c) {
                    int i = 0;
                    while (true) {
                        C0984n nVar = wVar.f389565c;
                        if (i < nVar.f3122d) {
                            wVar.mo119066b((String) nVar.mo3702e(i), intent2.getExtras());
                            i++;
                        }
                    }
                }
                return;
            }
            Matcher matcher = C143696w.f389562b.matcher(stringExtra);
            if (matcher.matches()) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                if (group != null) {
                    Bundle extras = intent2.getExtras();
                    extras.putString("registration_id", group2);
                    wVar.mo119066b(group, extras);
                }
            } else if (Log.isLoggable("Rpc", 3)) {
                Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
            }
        } else if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
        }
    }
}
