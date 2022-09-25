package com.google.android.gms.learning.internal.training;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.PowerManager;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.learning.internal.p10828b.C144766b;
import com.google.android.gms.learning.internal.p10828b.C144768d;
import com.google.android.gms.p10793f.C144166k;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
public class InAppJobService extends JobService {
    static final String TAG = "brella.InAppJobSvc";
    C144805i dynamiteImpl;

    private boolean isIdleConstraintMet(JobParameters jobParameters) {
        if (!((PowerManager) getSystemService("power")).isInteractive()) {
            return true;
        }
        if (jobParameters.getExtras().getInt("waive_idle_requirement", 0) == 1) {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Device is not idle, but running anyway since requirements waived");
            }
            return true;
        }
        if (Log.isLoggable(TAG, 3)) {
            int jobId = jobParameters.getJobId();
            Log.d(TAG, "Not running the job " + jobId + " b/c device is not idle!");
        }
        return false;
    }

    private boolean tryLoadDynamiteImpl() {
        if (this.dynamiteImpl != null) {
            return true;
        }
        try {
            C144805i iVar = (C144805i) C144768d.m235289a(this, "com.google.android.gms.learning.dynamite.training.InAppJobServiceImpl", C144818v.f391646a);
            try {
                if (!iVar.init(new C144166k(this), new C144166k(getBgExecutor()))) {
                    if (Log.isLoggable(TAG, 5)) {
                        Log.w(TAG, "IInAppJobService.init failed");
                    }
                    return false;
                }
                this.dynamiteImpl = iVar;
                return true;
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.init", e);
                }
                return false;
            }
        } catch (C144766b e2) {
            if (Log.isLoggable(TAG, 5)) {
                Log.w(TAG, "LoadingException during tryLoadDynamiteImpl", e2);
            }
            return false;
        }
    }

    public ExecutorService getBgExecutor() {
        return C144819w.f391647a;
    }

    public void onDestroy() {
        C144805i iVar = this.dynamiteImpl;
        if (iVar != null) {
            try {
                iVar.onDestroy();
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onDestroy", e);
                }
            }
        }
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        C144805i iVar = this.dynamiteImpl;
        if (iVar != null) {
            try {
                iVar.onRebind(intent);
                return;
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onRebind", e);
                }
            }
        }
        super.onRebind(intent);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        C144805i iVar = this.dynamiteImpl;
        if (iVar != null) {
            try {
                return iVar.onStartCommand(intent, i, i2);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onStartCommand", e);
                }
            }
        }
        return super.onStartCommand(intent, i, i2);
    }

    public synchronized boolean onStartJob(JobParameters jobParameters) {
        if (!isIdleConstraintMet(jobParameters)) {
            C144799c.m235338b(this, jobParameters);
            return false;
        } else if (!tryLoadDynamiteImpl()) {
            C144799c.m235338b(this, jobParameters);
            return false;
        } else {
            try {
                return this.dynamiteImpl.onStartJob(jobParameters);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onStartJob", e);
                }
                C144799c.m235338b(this, jobParameters);
                return false;
            }
        }
    }

    public boolean onStopJob(JobParameters jobParameters) {
        C144805i iVar = this.dynamiteImpl;
        if (iVar == null) {
            return false;
        }
        try {
            return iVar.onStopJob(jobParameters);
        } catch (RemoteException e) {
            if (!Log.isLoggable(TAG, 5)) {
                return false;
            }
            Log.w(TAG, "RemoteException in IInAppJobService.onStopJob", e);
            return false;
        }
    }

    public void onTrimMemory(int i) {
        C144805i iVar = this.dynamiteImpl;
        if (iVar != null) {
            try {
                iVar.onTrimMemory(i);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onTrimMemory", e);
                }
            }
        }
    }

    public boolean onUnbind(Intent intent) {
        C144805i iVar = this.dynamiteImpl;
        if (iVar != null) {
            try {
                return iVar.onUnbind(intent);
            } catch (RemoteException e) {
                if (Log.isLoggable(TAG, 5)) {
                    Log.w(TAG, "RemoteException in IInAppJobService.onUnbind", e);
                }
            }
        }
        return super.onUnbind(intent);
    }
}
