package com.google.android.libraries.onegoogle.accountmenu.cards.p2355db;

import androidx.p182p.C3925ah;
import androidx.p182p.C3966s;
import androidx.p186q.p187a.C4057l;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.db.g */
/* compiled from: PG */
final class C30428g extends C3966s {
    public C30428g(C3925ah ahVar) {
        super(ahVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8306a(C4057l lVar, Object obj) {
        String str;
        C30426e eVar = (C30426e) obj;
        if (eVar.mo35997c() == null) {
            lVar.mo8205f(1);
        } else {
            lVar.mo8206g(1, eVar.mo35997c());
        }
        if (eVar.mo35998d() == 0) {
            lVar.mo8205f(2);
        } else {
            int d = eVar.mo35998d();
            if (d != 0) {
                switch (d - 1) {
                    case 0:
                        str = "INITIAL";
                        break;
                    case 1:
                        str = "OFF";
                        break;
                    case 2:
                        str = "COMPLETE";
                        break;
                    case 3:
                        str = "IN_PROGRESS";
                        break;
                    case 4:
                        str = "PREPARE";
                        break;
                    case 5:
                        str = "FAILURE";
                        break;
                    case 6:
                        str = "NO_CONNECTION";
                        break;
                    case 7:
                        str = "CUSTOM";
                        break;
                    case 8:
                        str = "CUSTOM_FAILURE";
                        break;
                    case 9:
                        str = "CUSTOM_PAUSED";
                        break;
                    default:
                        str = "STORAGE_FAILURE";
                        break;
                }
            } else {
                str = null;
            }
            lVar.mo8206g(2, str);
        }
        lVar.mo8204e(3, eVar.mo35996b());
        lVar.mo8204e(4, (long) eVar.mo35995a());
    }

    /* renamed from: f */
    public final String mo8214f() {
        return "INSERT OR REPLACE INTO `BackupSyncCardDecorationState` (`accountIdentifier`,`backupSyncState`,`lastDecorationConsumedTime`,`totalTimesConsumed`) VALUES (?,?,?,?)";
    }
}
