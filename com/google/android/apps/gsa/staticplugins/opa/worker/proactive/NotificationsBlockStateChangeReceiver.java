package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60612wi;
import com.google.common.p4552o.C60613wj;
import com.google.protos.p4816ai.p4818b.C63196b;

/* compiled from: PG */
public class NotificationsBlockStateChangeReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        C74507e.m120467c(35);
        String action = intent.getAction();
        if (action != null) {
            boolean booleanExtra = intent.getBooleanExtra("android.app.extra.BLOCKED_STATE", false);
            if (action.equals("android.app.action.APP_BLOCK_STATE_CHANGED")) {
                C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                tzVar.copyOnWrite();
                C60555uf ufVar = (C60555uf) tzVar.instance;
                ufVar.f164093a |= 2;
                ufVar.f164258m = 945;
                C60612wi wiVar = (C60612wi) C60613wj.f164441e.createBuilder();
                wiVar.copyOnWrite();
                C60613wj wjVar = (C60613wj) wiVar.instance;
                wjVar.f164444b = 1;
                wjVar.f164443a |= 1;
                wiVar.copyOnWrite();
                C60613wj wjVar2 = (C60613wj) wiVar.instance;
                wjVar2.f164443a |= 2;
                wjVar2.f164445c = booleanExtra;
                C60613wj wjVar3 = (C60613wj) wiVar.build();
                tzVar.copyOnWrite();
                C60555uf ufVar2 = (C60555uf) tzVar.instance;
                wjVar3.getClass();
                ufVar2.f164196bx = wjVar3;
                ufVar2.f164253h |= 2;
                C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
                return;
            }
            String str = "UNKNOWN";
            if (action.equals("android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED")) {
                String stringExtra = intent.getStringExtra("android.app.extra.NOTIFICATION_CHANNEL_ID");
                C60548tz tzVar2 = (C60548tz) C60555uf.f164065cO.createBuilder();
                tzVar2.copyOnWrite();
                C60555uf ufVar3 = (C60555uf) tzVar2.instance;
                ufVar3.f164093a |= 2;
                ufVar3.f164258m = 945;
                C60612wi wiVar2 = (C60612wi) C60613wj.f164441e.createBuilder();
                wiVar2.copyOnWrite();
                C60613wj wjVar4 = (C60613wj) wiVar2.instance;
                wjVar4.f164444b = 2;
                wjVar4.f164443a = 1 | wjVar4.f164443a;
                if (stringExtra != null) {
                    str = stringExtra;
                }
                wiVar2.copyOnWrite();
                C60613wj wjVar5 = (C60613wj) wiVar2.instance;
                wjVar5.f164443a |= 4;
                wjVar5.f164446d = str;
                wiVar2.copyOnWrite();
                C60613wj wjVar6 = (C60613wj) wiVar2.instance;
                wjVar6.f164443a |= 2;
                wjVar6.f164445c = booleanExtra;
                C60613wj wjVar7 = (C60613wj) wiVar2.build();
                tzVar2.copyOnWrite();
                C60555uf ufVar4 = (C60555uf) tzVar2.instance;
                wjVar7.getClass();
                ufVar4.f164196bx = wjVar7;
                ufVar4.f164253h |= 2;
                C89949q.m146525j((C60555uf) tzVar2.build(), (C60321oe) null, (C63196b) null, (String) null);
            } else if (action.equals("android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED")) {
                String stringExtra2 = intent.getStringExtra("android.app.extra.NOTIFICATION_CHANNEL_GROUP_ID");
                C60548tz tzVar3 = (C60548tz) C60555uf.f164065cO.createBuilder();
                tzVar3.copyOnWrite();
                C60555uf ufVar5 = (C60555uf) tzVar3.instance;
                ufVar5.f164093a |= 2;
                ufVar5.f164258m = 945;
                C60612wi wiVar3 = (C60612wi) C60613wj.f164441e.createBuilder();
                wiVar3.copyOnWrite();
                C60613wj wjVar8 = (C60613wj) wiVar3.instance;
                wjVar8.f164444b = 3;
                wjVar8.f164443a = 1 | wjVar8.f164443a;
                if (stringExtra2 != null) {
                    str = stringExtra2;
                }
                wiVar3.copyOnWrite();
                C60613wj wjVar9 = (C60613wj) wiVar3.instance;
                wjVar9.f164443a |= 4;
                wjVar9.f164446d = str;
                wiVar3.copyOnWrite();
                C60613wj wjVar10 = (C60613wj) wiVar3.instance;
                wjVar10.f164443a |= 2;
                wjVar10.f164445c = booleanExtra;
                C60613wj wjVar11 = (C60613wj) wiVar3.build();
                tzVar3.copyOnWrite();
                C60555uf ufVar6 = (C60555uf) tzVar3.instance;
                wjVar11.getClass();
                ufVar6.f164196bx = wjVar11;
                ufVar6.f164253h |= 2;
                C89949q.m146525j((C60555uf) tzVar3.build(), (C60321oe) null, (C63196b) null, (String) null);
            }
        }
    }
}
