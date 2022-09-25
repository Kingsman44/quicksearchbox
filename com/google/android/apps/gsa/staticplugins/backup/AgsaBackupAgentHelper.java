package com.google.android.apps.gsa.staticplugins.backup;

import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.FileBackupHelper;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import androidx.annotation.C0826b;
import com.android.launcher3.LauncherBackupAgentHelper;
import com.google.android.apps.gsa.googlequicksearchbox.GelStubAppWatcher;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88216tl;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88217tm;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88218tn;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.p7040g.C89768b;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7130s.p7131a.p7132a.C90478b;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90812bd;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90853m;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.p1878b.C22863a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4541l.C59315ac;
import com.google.common.p4552o.amo;
import com.google.common.util.concurrent.C60895di;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

/* compiled from: PG */
public class AgsaBackupAgentHelper extends LauncherBackupAgentHelper {
    static final String BACKUP_FILENAME = "backup_data.proto";
    static final String BACKUP_HELPER_KEY = "agsa_backup_proto";
    private static final ClientConfig CLIENT_CONFIG;
    private static final int RESPONSE_TIMEOUT_MS = 30000;

    /* renamed from: a */
    public static final /* synthetic */ int f264062a = 0;
    private static final C90853m gsaThreadFactory = new C90853m("BackupRestoreThreadFactory", 0);
    private static final C59071e logger = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.backup.AgsaBackupAgentHelper");
    private C90476a buildType;
    C88483e searchServiceStarter;

    static {
        C88486g gVar = new C88486g();
        gVar.f239199a = 524289;
        gVar.f239201c = amo.BACKUP_AND_RESTORE;
        gVar.f239204f = "backup_and_restore";
        CLIENT_CONFIG = new ClientConfig(gVar);
        C90476a aVar = C91018d.f254254a;
    }

    public static File getBackupFile(Context context) {
        return new File(context.getFilesDir(), BACKUP_FILENAME);
    }

    static /* synthetic */ C22871g lambda$onCreate$1() {
        return new C22863a(C0826b.class, new Handler(Looper.getMainLooper()));
    }

    static /* synthetic */ Boolean lambda$onCreate$3() {
        return false;
    }

    static /* synthetic */ C68214a lambda$onCreate$5() {
        return null;
    }

    /* renamed from: lambda$onCreate$0$com-google-android-apps-gsa-staticplugins-backup-AgsaBackupAgentHelper */
    public /* synthetic */ Context mo88478xd315e27a() {
        return this;
    }

    /* renamed from: lambda$onCreate$2$com-google-android-apps-gsa-staticplugins-backup-AgsaBackupAgentHelper */
    public /* synthetic */ C90476a mo88479xd7ab4c38() {
        return this.buildType;
    }

    public void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        C59104x c;
        char c2;
        if (!GelStubAppWatcher.m120504a(this)) {
            addHelper(LauncherBackupAgentHelper.LAUNCHER_DATA_PREFIX, new C94480h());
        }
        try {
            C90877ak.m148472f(this.searchServiceStarter.mo82004b(CLIENT_CONFIG, new C88489j(C87739bu.BACKUP_DATA).mo82013a(), 30000));
            super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
            C59071e eVar = logger;
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(14456)).mo56386p("Backup data processed successfully.");
            if (!getBackupFile(this).delete()) {
                c = eVar.mo56225c();
                c2 = 14457;
                ((C59052c) ((C59052c) c).mo56372aa(c2)).mo56386p("Backup file could not be deleted.");
            }
        } catch (InterruptedException e) {
            C59071e eVar2 = logger;
            ((C59052c) ((C59052c) ((C59052c) eVar2.mo56226d()).mo56382g(e)).mo56372aa(14458)).mo56386p("Timed-out or interrupted while waiting for backup data.");
            if (!getBackupFile(this).delete()) {
                c = eVar2.mo56225c();
                c2 = 14460;
            }
        } catch (ExecutionException e2) {
            C59071e eVar3 = logger;
            ((C59052c) ((C59052c) ((C59052c) eVar3.mo56226d()).mo56382g(e2)).mo56372aa(14461)).mo56386p("Requesting backup data failed.");
            if (!getBackupFile(this).delete()) {
                c = eVar3.mo56225c();
                c2 = 14462;
            }
        } catch (IOException e3) {
            C59071e eVar4 = logger;
            ((C59052c) ((C59052c) ((C59052c) eVar4.mo56226d()).mo56382g(e3)).mo56372aa(14463)).mo56386p("IO exception while processing AGSA backup data.");
            if (!getBackupFile(this).delete()) {
                c = eVar4.mo56225c();
                c2 = 14464;
            }
        } catch (Throwable th) {
            if (!getBackupFile(this).delete()) {
                ((C59052c) ((C59052c) logger.mo56225c()).mo56372aa(14459)).mo56386p("Backup file could not be deleted.");
            }
            throw th;
        }
    }

    public void onCreate() {
        super.onCreate();
        this.buildType = new C90478b();
        C90812bd bdVar = new C90812bd(Looper.myQueue(), C60895di.m92996b(Executors.newSingleThreadScheduledExecutor(gsaThreadFactory)));
        if (this.searchServiceStarter == null) {
            this.searchServiceStarter = new C88483e(bdVar, new C87677ae(new C94460a(this), C94462b.f264064a, new C94475c(this), C94476d.f264166a, C94477e.f264167a, C94478f.f264168a));
        }
        C90476a aVar = C91018d.f254254a;
        addHelper(BACKUP_HELPER_KEY, new FileBackupHelper(this, new String[]{BACKUP_FILENAME}));
    }

    public void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        C59104x c;
        char c2;
        super.onRestore(backupDataInput, i, parcelFileDescriptor);
        File backupFile = getBackupFile(this);
        if (backupFile.exists()) {
            C88217tm tmVar = (C88217tm) C88218tn.f238450c.createBuilder();
            C89768b bVar = (C89768b) C62942bv.parseFrom((C62942bv) C89768b.f242960f, new C59315ac(backupFile).mo56803a());
            tmVar.copyOnWrite();
            C88218tn tnVar = (C88218tn) tmVar.instance;
            bVar.getClass();
            tnVar.f238453b = bVar;
            tnVar.f238452a |= 1;
            C88489j jVar = new C88489j(C87739bu.RESTORE_DATA);
            jVar.mo82014b(C88216tl.f238449a, (C88218tn) tmVar.build());
            try {
                C90877ak.m148472f(this.searchServiceStarter.mo82004b(CLIENT_CONFIG, jVar.mo82013a(), 30000));
                C59071e eVar = logger;
                ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(14468)).mo56386p("Backup data restored successfully.");
                if (!getBackupFile(this).delete()) {
                    c = eVar.mo56225c();
                    c2 = 14469;
                    ((C59052c) ((C59052c) c).mo56372aa(c2)).mo56386p("Backup file could not be deleted.");
                }
            } catch (InterruptedException e) {
                C59071e eVar2 = logger;
                ((C59052c) ((C59052c) ((C59052c) eVar2.mo56226d()).mo56382g(e)).mo56372aa(14470)).mo56386p("Timed-out or interrupted while waiting for data to be restored.");
                if (!getBackupFile(this).delete()) {
                    c = eVar2.mo56225c();
                    c2 = 14472;
                }
            } catch (ExecutionException e2) {
                C59071e eVar3 = logger;
                ((C59052c) ((C59052c) ((C59052c) eVar3.mo56226d()).mo56382g(e2)).mo56372aa(14473)).mo56386p("Restoring backup data failed or timed-out.");
                if (!getBackupFile(this).delete()) {
                    c = eVar3.mo56225c();
                    c2 = 14474;
                }
            } catch (Throwable th) {
                if (!getBackupFile(this).delete()) {
                    ((C59052c) ((C59052c) logger.mo56225c()).mo56372aa(14471)).mo56386p("Backup file could not be deleted.");
                }
                throw th;
            }
        }
    }
}
