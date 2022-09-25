package com.android.launcher3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.SearchManager;
import android.app.WallpaperManager;
import android.appwidget.AppWidgetHostView;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.TextKeyListener;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.Advanceable;
import android.widget.ImageView;
import android.widget.RemoteViews;
import android.widget.Toast;
import com.android.launcher3.CellLayout;
import com.android.launcher3.DragLayer;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.LauncherModel;
import com.android.launcher3.LauncherStateTransitionAnimation;
import com.android.launcher3.PagedView;
import com.android.launcher3.ShortcutInfo;
import com.android.launcher3.Stats;
import com.android.launcher3.Workspace;
import com.android.launcher3.allapps.AllAppsContainerView;
import com.android.launcher3.allapps.AllAppsSearchBarController;
import com.android.launcher3.allapps.AlphabeticalAppsList;
import com.android.launcher3.compat.AppWidgetManagerCompat;
import com.android.launcher3.compat.LauncherAppsCompat;
import com.android.launcher3.compat.ShortcutConfigActivityInfo;
import com.android.launcher3.compat.UserHandleCompat;
import com.android.launcher3.model.PackageItemInfo;
import com.android.launcher3.model.WidgetsModel;
import com.android.launcher3.shortcuts.DeepShortcutKey;
import com.android.launcher3.shortcuts.DeepShortcutsContainer;
import com.android.launcher3.util.ItemInfoMatcher;
import com.android.launcher3.util.LongArrayMap;
import com.android.launcher3.util.MultiHashMap;
import com.android.launcher3.widget.PendingAddShortcutInfo;
import com.android.launcher3.widget.PendingAddWidgetInfo;
import com.android.launcher3.widget.WidgetHostViewLoader;
import com.android.launcher3.widget.WidgetsContainerView;
import com.android.launcher3.widget.WidgetsListAdapter;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.launcher.a.b;
import com.google.android.apps.gsa.launcher.a.c;
import com.google.android.apps.gsa.launcher.a.k;
import com.google.android.apps.gsa.launcher.p5872a.C74629d;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.sidekick.shared.util.C91973ax;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1859d.C22783e;
import com.google.android.libraries.gsa.p1859d.C22790l;
import com.google.android.libraries.gsa.p1859d.C22791m;
import com.google.android.libraries.gsa.p1859d.C22794p;
import com.google.android.libraries.p10922ab.C146707c;
import com.google.common.p4522b.C58485gu;
import com.google.p375ai.p378b.C7891nu;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
public class Launcher extends BaseActivity implements View.OnClickListener, View.OnLongClickListener, LauncherModel.Callbacks, View.OnTouchListener, PagedView.PageSwitchListener, LauncherProviderChangeListener {
    static final ArrayList sDumpLogs = new ArrayList();
    public static LongArrayMap sFolders = new LongArrayMap();
    private static PendingAddArguments sPendingAddItem;
    public View mAllAppsButton;
    public LauncherAppWidgetHost mAppWidgetHost;
    private AppWidgetManagerCompat mAppWidgetManager;
    AllAppsContainerView mAppsView;
    private boolean mAutoAdvanceRunning = false;
    private long mAutoAdvanceSentTime;
    private long mAutoAdvanceTimeLeft = -1;
    private final Runnable mBindAllApplicationsRunnable = new Runnable() {
        public final void run() {
            Launcher launcher = Launcher.this;
            launcher.bindAllApplications(launcher.mTmpAppsList);
            Launcher.this.mTmpAppsList = null;
        }
    };
    private final ArrayList mBindOnResumeCallbacks = new ArrayList();
    private final Runnable mBindWidgetModelRunnable = new Runnable() {
        public final void run() {
            Launcher launcher = Launcher.this;
            launcher.bindWidgetsModel(launcher.mWidgetsModel);
        }
    };
    final Runnable mBuildLayersRunnable = new Runnable() {
        public final void run() {
            Workspace workspace = Launcher.this.mWorkspace;
            if (workspace != null) {
                workspace.updateChildrenLayersEnabled(true);
                if (workspace.getWindowToken() != null) {
                    int childCount = workspace.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        ((CellLayout) workspace.getChildAt(i)).mShortcutsAndWidgets.buildLayer();
                    }
                }
                workspace.updateChildrenLayersEnabled(false);
            }
        }
    };
    private LauncherClings mClings;
    private final BroadcastReceiver mCloseSystemDialogsReceiver = new CloseSystemDialogsIntentReceiver();
    private MultiHashMap mDeepShortcutMap = new MultiHashMap();
    public SpannableStringBuilder mDefaultKeySsb = null;
    public DragController mDragController;
    public DragLayer mDragLayer;
    FocusIndicatorView mFocusHandler;
    private Bitmap mFolderIconBitmap;
    private Canvas mFolderIconCanvas;
    ImageView mFolderIconImageView;
    final Handler mHandler = new Handler(new Handler.Callback() {
        public final boolean handleMessage(Message message) {
            if (message.what == 1) {
                int i = 0;
                for (View view : Launcher.this.mWidgetsToAdvance.keySet()) {
                    final View findViewById = view.findViewById(((AppWidgetProviderInfo) Launcher.this.mWidgetsToAdvance.get(view)).autoAdvanceViewId);
                    int i2 = i * 250;
                    if (findViewById instanceof Advanceable) {
                        Launcher.this.mHandler.postDelayed(new Runnable() {
                            public final void run() {
                                ((Advanceable) findViewById).advance();
                            }
                        }, (long) i2);
                    }
                    i++;
                }
                Launcher.this.sendAdvanceMessage(20000);
            }
            return true;
        }
    });
    private View.OnTouchListener mHapticFeedbackTouchListener;
    private boolean mHasFocus = false;
    Hotseat mHotseat;
    public IconCache mIconCache;
    private LayoutInflater mInflater;
    public boolean mIsSafeModeEnabled;
    public C74629d mLauncherCallbacks$ar$class_merging;
    public View mLauncherView;
    public LauncherModel mModel;
    public final ArrayList mOnResumeCallbacks = new ArrayList();
    private boolean mOnResumeNeedsLoad;
    private int mOnResumeState$ar$edu = 1;
    public ViewGroup mOverviewPanel;
    public View mPageIndicators;
    private boolean mPaused = true;
    final PendingAddItemInfo mPendingAddInfo = new PendingAddItemInfo();
    private int mPendingAddWidgetId = -1;
    private LauncherAppWidgetProviderInfo mPendingAddWidgetInfo;
    private AppWidgetHostView mQsb;
    private final BroadcastReceiver mReceiver = new BroadcastReceiver() {
        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.SCREEN_OFF".equals(action)) {
                Launcher launcher = Launcher.this;
                launcher.mUserPresent = false;
                launcher.mDragLayer.clearAllResizeFrames();
                Launcher.this.updateAutoAdvanceState();
                Launcher launcher2 = Launcher.this;
                if (launcher2.mAppsView != null && launcher2.mWidgetsView != null && launcher2.mPendingAddInfo.container == -1 && !launcher2.showWorkspace(-1, false, (Runnable) null)) {
                    Launcher.this.mAppsView.reset();
                }
            } else if ("android.intent.action.USER_PRESENT".equals(action)) {
                Launcher launcher3 = Launcher.this;
                launcher3.mUserPresent = true;
                launcher3.updateAutoAdvanceState();
            }
        }
    };
    private final Rect mRectForFolderAnimation = new Rect();
    private boolean mRestoring;
    private boolean mRotationEnabled = false;
    private Bundle mSavedState;
    public SearchDropTargetBar mSearchDropTargetBar;
    public SharedPreferences mSharedPrefs;
    int mState$ar$edu$fb933cd0_0 = 2;
    LauncherStateTransitionAnimation mStateTransitionAnimation;
    private Stats mStats;
    private final ArrayList mSynchronouslyBoundPages = new ArrayList();
    private final int[] mTmpAddItemCellCoordinates = new int[2];
    ArrayList mTmpAppsList;
    private final Runnable mUpdateOrientationRunnable = new Runnable() {
        public final void run() {
            Launcher.this.setOrientation();
        }
    };
    boolean mUserPresent = true;
    public boolean mVisible = false;
    private boolean mWaitingForResult;
    private BubbleTextView mWaitingForResume;
    public View mWidgetsButton;
    WidgetsModel mWidgetsModel;
    final HashMap mWidgetsToAdvance = new HashMap();
    WidgetsContainerView mWidgetsView;
    public Workspace mWorkspace;
    Drawable mWorkspaceBackgroundDrawable;
    boolean mWorkspaceLoading = true;

    /* compiled from: PG */
    final class CloseSystemDialogsIntentReceiver extends BroadcastReceiver {
        public CloseSystemDialogsIntentReceiver() {
        }

        public final void onReceive(Context context, Intent intent) {
            Launcher.this.closeSystemDialogs();
        }
    }

    /* compiled from: PG */
    public interface LauncherOverlay {
        void onScrollChange$ar$ds$fe0f0749_0(float f);

        void onScrollInteractionBegin();

        void onScrollInteractionEnd();

        void setOverlayCallbacks$ar$class_merging(LauncherOverlayCallbacksImpl launcherOverlayCallbacksImpl);
    }

    /* compiled from: PG */
    public final class LauncherOverlayCallbacksImpl {
        public LauncherOverlayCallbacksImpl() {
        }
    }

    /* compiled from: PG */
    final class PendingAddArguments {
        int appWidgetId;
        int cellX;
        int cellY;
        long container;
        Intent intent;
        int requestCode;
        long screenId;
    }

    static {
        new Date();
        DateFormat.getDateTimeInstance(3, 3);
        System.currentTimeMillis();
        new HashMap();
    }

    private final void addAppWidgetToWorkspace(LauncherAppWidgetInfo launcherAppWidgetInfo, LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo, boolean z) {
        LauncherAppWidgetInfo launcherAppWidgetInfo2 = launcherAppWidgetInfo;
        LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo2 = launcherAppWidgetProviderInfo;
        prepareAppWidget(launcherAppWidgetInfo2.hostView, launcherAppWidgetInfo2);
        this.mWorkspace.addInScreen(launcherAppWidgetInfo2.hostView, launcherAppWidgetInfo2.container, launcherAppWidgetInfo2.screenId, launcherAppWidgetInfo2.cellX, launcherAppWidgetInfo2.cellY, launcherAppWidgetInfo2.spanX, launcherAppWidgetInfo2.spanY, z, false);
        if (!launcherAppWidgetInfo.isCustomWidget()) {
            AppWidgetHostView appWidgetHostView = launcherAppWidgetInfo2.hostView;
            if (launcherAppWidgetProviderInfo2 != null && launcherAppWidgetProviderInfo2.autoAdvanceViewId != -1) {
                View findViewById = appWidgetHostView.findViewById(launcherAppWidgetProviderInfo2.autoAdvanceViewId);
                if (findViewById instanceof Advanceable) {
                    this.mWidgetsToAdvance.put(appWidgetHostView, launcherAppWidgetProviderInfo2);
                    ((Advanceable) findViewById).fyiWillBeAdvancedByHostKThx();
                    updateAutoAdvanceState();
                }
            }
        }
    }

    public static void addDumpLog$ar$ds(String str, String str2, Exception exc) {
        if (exc != null) {
            Log.d(str, str2, exc);
        } else {
            Log.d(str, str2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [com.android.launcher3.ItemInfo] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007d, code lost:
        r5 = com.android.launcher3.compat.PinItemRequestCompat.getPinItemRequest(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0131, code lost:
        if (r8.mWorkspace.addToExistingFolderIfNecessary$ar$ds(r4, r7, 0.0f, r0, true) == false) goto L_0x0143;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long completeAdd(com.android.launcher3.Launcher.PendingAddArguments r27) {
        /*
            r26 = this;
            r8 = r26
            r0 = r27
            long r1 = r0.screenId
            long r3 = r0.container
            r5 = -100
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0012
            long r1 = r8.ensurePendingDropLayoutExists(r1)
        L_0x0012:
            r13 = r1
            int r1 = r0.requestCode
            java.lang.String r2 = "Launcher"
            r9 = 0
            r10 = 1
            if (r1 == r10) goto L_0x005f
            r3 = 5
            if (r1 == r3) goto L_0x0052
            r3 = 12
            if (r1 == r3) goto L_0x0025
        L_0x0022:
            r1 = r13
            goto L_0x016c
        L_0x0025:
            int r0 = r0.appWidgetId
            com.android.launcher3.Workspace r1 = r8.mWorkspace
            com.android.launcher3.Workspace$17 r3 = new com.android.launcher3.Workspace$17
            r3.<init>(r0)
            android.view.View r0 = r1.getFirstMatch(r3)
            com.android.launcher3.LauncherAppWidgetHostView r0 = (com.android.launcher3.LauncherAppWidgetHostView) r0
            if (r0 == 0) goto L_0x004c
            boolean r1 = r0 instanceof com.android.launcher3.PendingAppWidgetHostView
            if (r1 != 0) goto L_0x003b
            goto L_0x004c
        L_0x003b:
            java.lang.Object r0 = r0.getTag()
            com.android.launcher3.LauncherAppWidgetInfo r0 = (com.android.launcher3.LauncherAppWidgetInfo) r0
            r0.restoreStatus = r9
            com.android.launcher3.Workspace r1 = r8.mWorkspace
            r1.reinflateWidgetsIfNecessary()
            com.android.launcher3.LauncherModel.updateItemInDatabase(r8, r0)
            goto L_0x0022
        L_0x004c:
            java.lang.String r0 = "Widget update called, when the widget no longer exists."
            android.util.Log.e(r2, r0)
            goto L_0x0022
        L_0x0052:
            int r1 = r0.appWidgetId
            long r2 = r0.container
            r6 = 0
            r7 = 0
            r0 = r26
            r4 = r13
            r0.completeAddAppWidget(r1, r2, r4, r6, r7)
            goto L_0x0022
        L_0x005f:
            android.content.Intent r1 = r0.intent
            long r11 = r0.container
            int r3 = r0.cellX
            int r0 = r0.cellY
            int[] r7 = r8.mTmpAddItemCellCoordinates
            com.android.launcher3.PendingAddItemInfo r4 = r8.mPendingAddInfo
            int[] r4 = r4.dropPos
            com.android.launcher3.CellLayout r4 = r8.getCellLayout(r11, r13)
            com.android.launcher3.PendingAddItemInfo r5 = r8.mPendingAddInfo
            android.content.ComponentName r5 = r5.componentName
            if (r5 != 0) goto L_0x0078
            goto L_0x0022
        L_0x0078:
            boolean r5 = com.android.launcher3.Utilities.ATLEAST_O
            r6 = 0
            if (r5 == 0) goto L_0x00a4
            com.android.launcher3.compat.PinItemRequestCompat r5 = com.android.launcher3.compat.PinItemRequestCompat.getPinItemRequest(r1)
            if (r5 == 0) goto L_0x00a4
            int r15 = r5.getRequestType()
            if (r15 != r10) goto L_0x00a4
            boolean r15 = r5.isValid()
            if (r15 == 0) goto L_0x00a4
            boolean r15 = r5.accept()
            if (r15 == 0) goto L_0x00a4
            com.android.launcher3.shortcuts.ShortcutInfoCompat r15 = new com.android.launcher3.shortcuts.ShortcutInfoCompat
            android.content.pm.ShortcutInfo r5 = r5.getShortcutInfo()
            r15.<init>(r5)
            com.android.launcher3.ShortcutInfo r5 = new com.android.launcher3.ShortcutInfo
            r5.<init>((com.android.launcher3.shortcuts.ShortcutInfoCompat) r15, (android.content.Context) r8)
            goto L_0x00a5
        L_0x00a4:
            r5 = r6
        L_0x00a5:
            if (r5 != 0) goto L_0x00f5
            com.android.launcher3.PendingAddItemInfo r5 = r8.mPendingAddInfo
            com.android.launcher3.compat.UserHandleCompat r5 = r5.user
            if (r5 == 0) goto L_0x00b7
            com.android.launcher3.compat.UserHandleCompat r15 = com.android.launcher3.compat.UserHandleCompat.myUserHandle()
            boolean r5 = r15.equals(r5)
            if (r5 == 0) goto L_0x00c5
        L_0x00b7:
            com.android.launcher3.InstallShortcutReceiver$PendingInstallShortcutInfo r1 = com.android.launcher3.InstallShortcutReceiver.createPendingInfo(r8, r1)
            if (r1 != 0) goto L_0x00be
            goto L_0x00c5
        L_0x00be:
            com.android.launcher3.ItemInfo r1 = r1.getItemInfo()
            r6 = r1
            com.android.launcher3.ShortcutInfo r6 = (com.android.launcher3.ShortcutInfo) r6
        L_0x00c5:
            if (r6 != 0) goto L_0x00ce
            java.lang.String r0 = "Unable to parse a valid custom shortcut result"
            android.util.Log.e(r2, r0)
            goto L_0x0022
        L_0x00ce:
            android.content.Intent r1 = r6.intent
            com.android.launcher3.PendingAddItemInfo r5 = r8.mPendingAddInfo
            android.content.ComponentName r5 = r5.componentName
            java.lang.String r5 = r5.getPackageName()
            boolean r1 = com.android.launcher3.util.PackageManagerHelper.hasPermissionForActivity(r8, r1, r5)
            if (r1 != 0) goto L_0x00f3
            android.content.Intent r0 = r6.intent
            java.lang.String r0 = r0.toUri(r9)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malicious intent "
            java.lang.String r0 = r1.concat(r0)
            android.util.Log.e(r2, r0)
            goto L_0x0022
        L_0x00f3:
            r1 = r6
            goto L_0x00f6
        L_0x00f5:
            r1 = r5
        L_0x00f6:
            android.view.View r25 = r8.createShortcut(r1)
            if (r3 < 0) goto L_0x0134
            if (r0 < 0) goto L_0x0134
            r7[r9] = r3
            r7[r10] = r0
            com.android.launcher3.Workspace r15 = r8.mWorkspace
            r21 = 0
            r22 = 1
            r23 = 0
            r24 = 0
            r16 = r25
            r17 = r11
            r19 = r4
            r20 = r7
            boolean r0 = r15.createUserFolderIfNecessary(r16, r17, r19, r20, r21, r22, r23, r24)
            if (r0 != 0) goto L_0x0022
            com.android.launcher3.DropTarget$DragObject r0 = new com.android.launcher3.DropTarget$DragObject
            r0.<init>()
            r0.dragInfo = r1
            com.android.launcher3.Workspace r15 = r8.mWorkspace
            r18 = 0
            r20 = 1
            r16 = r4
            r17 = r7
            r19 = r0
            boolean r0 = r15.addToExistingFolderIfNecessary$ar$ds(r16, r17, r18, r19, r20)
            if (r0 != 0) goto L_0x0022
            goto L_0x0143
        L_0x0134:
            boolean r0 = r4.findCellForSpan(r7, r10, r10)
            if (r0 != 0) goto L_0x0143
            boolean r0 = r8.isHotseatLayout(r4)
            r8.showOutOfSpaceMessage(r0)
            goto L_0x0022
        L_0x0143:
            r6 = r7[r9]
            r15 = r7[r10]
            r0 = r26
            r2 = r11
            r4 = r13
            r16 = r7
            r7 = r15
            com.android.launcher3.LauncherModel.addItemToDatabase(r0, r1, r2, r4, r6, r7)
            boolean r0 = r8.mRestoring
            if (r0 != 0) goto L_0x0022
            com.android.launcher3.Workspace r0 = r8.mWorkspace
            r15 = r16[r9]
            r16 = r16[r10]
            r17 = 1
            r18 = 1
            boolean r19 = r26.isWorkspaceLocked()
            r20 = 0
            r9 = r0
            r10 = r25
            r1 = r13
            r9.addInScreen(r10, r11, r13, r15, r16, r17, r18, r19, r20)
        L_0x016c:
            r26.resetAddInfo()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.Launcher.completeAdd(com.android.launcher3.Launcher$PendingAddArguments):long");
    }

    private final void copyFolderIconToImage(FolderIcon folderIcon) {
        DragLayer.LayoutParams layoutParams;
        int measuredWidth = folderIcon.getMeasuredWidth();
        int measuredHeight = folderIcon.getMeasuredHeight();
        if (this.mFolderIconImageView == null) {
            this.mFolderIconImageView = new ImageView(this);
        }
        Bitmap bitmap = this.mFolderIconBitmap;
        if (!(bitmap != null && bitmap.getWidth() == measuredWidth && this.mFolderIconBitmap.getHeight() == measuredHeight)) {
            this.mFolderIconBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            this.mFolderIconCanvas = new Canvas(this.mFolderIconBitmap);
        }
        if (this.mFolderIconImageView.getLayoutParams() instanceof DragLayer.LayoutParams) {
            layoutParams = (DragLayer.LayoutParams) this.mFolderIconImageView.getLayoutParams();
        } else {
            layoutParams = new DragLayer.LayoutParams(measuredWidth, measuredHeight);
        }
        float descendantRectRelativeToSelf = this.mDragLayer.getDescendantRectRelativeToSelf(folderIcon, this.mRectForFolderAnimation);
        layoutParams.customPosition = true;
        layoutParams.f16550x = this.mRectForFolderAnimation.left;
        layoutParams.f16551y = this.mRectForFolderAnimation.top;
        layoutParams.width = (int) (((float) measuredWidth) * descendantRectRelativeToSelf);
        layoutParams.height = (int) (descendantRectRelativeToSelf * ((float) measuredHeight));
        this.mFolderIconCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        folderIcon.draw(this.mFolderIconCanvas);
        this.mFolderIconImageView.setImageBitmap(this.mFolderIconBitmap);
        Folder folder = folderIcon.mFolder;
        if (folder != null) {
            this.mFolderIconImageView.setPivotX(folder.mFolderIconPivotX);
            this.mFolderIconImageView.setPivotY(folderIcon.mFolder.mFolderIconPivotY);
        }
        if (this.mDragLayer.indexOfChild(this.mFolderIconImageView) != -1) {
            this.mDragLayer.removeView(this.mFolderIconImageView);
        }
        this.mDragLayer.addView(this.mFolderIconImageView, layoutParams);
        Folder folder2 = folderIcon.mFolder;
        if (folder2 != null) {
            folder2.bringToFront();
        }
    }

    private final void deleteWidgetInfo(final LauncherAppWidgetInfo launcherAppWidgetInfo) {
        final LauncherAppWidgetHost launcherAppWidgetHost = this.mAppWidgetHost;
        if (launcherAppWidgetHost != null && !launcherAppWidgetInfo.isCustomWidget() && (launcherAppWidgetInfo.restoreStatus & 1) == 0) {
            new AsyncTask() {
                public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
                    Void[] voidArr = (Void[]) objArr;
                    LauncherAppWidgetHost.this.deleteAppWidgetId(launcherAppWidgetInfo.appWidgetId);
                    return null;
                }
            }.executeOnExecutor(Utilities.THREAD_POOL_EXECUTOR, new Void[0]);
        }
        LauncherModel.deleteItemFromDatabase(this, launcherAppWidgetInfo);
    }

    private final long ensurePendingDropLayoutExists(long j) {
        if (this.mWorkspace.getScreenWithId(j) != null) {
            return j;
        }
        this.mWorkspace.addExtraEmptyScreen$ar$ds();
        return this.mWorkspace.commitExtraEmptyScreen();
    }

    public static Launcher getLauncher(Context context) {
        if (context instanceof Launcher) {
            return (Launcher) context;
        }
        return (Launcher) ((ContextWrapper) context).getBaseContext();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void handleActivityResult(int r15, int r16, android.content.Intent r17) {
        /*
            r14 = this;
            r6 = r14
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = 0
            r6.mWaitingForResult = r3
            int r4 = r6.mPendingAddWidgetId
            r5 = -1
            r6.mPendingAddWidgetId = r5
            com.android.launcher3.Launcher$4 r7 = new com.android.launcher3.Launcher$4
            r7.<init>(r1)
            r8 = 11
            java.lang.String r9 = "appWidgetId"
            r10 = 500(0x1f4, float:7.0E-43)
            r11 = 1
            if (r0 != r8) goto L_0x0046
            if (r2 == 0) goto L_0x0024
            int r0 = r2.getIntExtra(r9, r5)
            r2 = r0
            goto L_0x0025
        L_0x0024:
            r2 = -1
        L_0x0025:
            if (r1 != 0) goto L_0x0030
            r14.completeTwoStageWidgetDrop(r3, r2)
            com.android.launcher3.Workspace r0 = r6.mWorkspace
            r0.removeExtraEmptyScreenDelayed(r11, r7, r10, r3)
            return
        L_0x0030:
            if (r1 != r5) goto L_0x0045
            com.android.launcher3.PendingAddItemInfo r3 = r6.mPendingAddInfo
            r4 = 0
            com.android.launcher3.LauncherAppWidgetProviderInfo r5 = r6.mPendingAddWidgetInfo
            r7 = 500(0x1f4, float:7.0E-43)
            r0 = r14
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r7
            r0.addAppWidgetImpl(r1, r2, r3, r4, r5)
            r14.getOrCreateQsbBar()
        L_0x0045:
            return
        L_0x0046:
            r8 = 10
            if (r0 != r8) goto L_0x0062
            if (r1 != r5) goto L_0x0061
            com.android.launcher3.Workspace r0 = r6.mWorkspace
            boolean r0 = r0.isInOverviewMode()
            if (r0 == 0) goto L_0x0061
            com.android.launcher3.Workspace r0 = r6.mWorkspace
            int r1 = r0.getPageNearestToCenterOfScreen()
            r0.setCurrentPage(r1)
            r0 = 0
            r14.showWorkspace(r5, r3, r0)
        L_0x0061:
            return
        L_0x0062:
            r8 = 9
            if (r0 == r8) goto L_0x006d
            r8 = 5
            if (r0 != r8) goto L_0x006b
            r0 = 5
            goto L_0x006d
        L_0x006b:
            r8 = 0
            goto L_0x006e
        L_0x006d:
            r8 = 1
        L_0x006e:
            boolean r12 = r14.isWorkspaceLocked()
            if (r8 == 0) goto L_0x00d6
            if (r2 == 0) goto L_0x007a
            int r5 = r2.getIntExtra(r9, r5)
        L_0x007a:
            if (r5 >= 0) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r4 = r5
        L_0x007e:
            if (r4 < 0) goto L_0x00b7
            if (r1 != 0) goto L_0x0083
            goto L_0x00b7
        L_0x0083:
            if (r12 != 0) goto L_0x00ae
            com.android.launcher3.PendingAddItemInfo r0 = r6.mPendingAddInfo
            long r7 = r0.container
            r12 = -100
            int r2 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0097
            long r7 = r0.screenId
            long r7 = r14.ensurePendingDropLayoutExists(r7)
            r0.screenId = r7
        L_0x0097:
            com.android.launcher3.Workspace r0 = r6.mWorkspace
            com.android.launcher3.PendingAddItemInfo r2 = r6.mPendingAddInfo
            long r7 = r2.screenId
            com.android.launcher3.CellLayout r0 = r0.getScreenWithId(r7)
            r0.mDropPending = r11
            com.android.launcher3.Launcher$6 r2 = new com.android.launcher3.Launcher$6
            r2.<init>(r1, r4, r0)
            com.android.launcher3.Workspace r0 = r6.mWorkspace
            r0.removeExtraEmptyScreenDelayed(r11, r2, r10, r3)
            return
        L_0x00ae:
            com.android.launcher3.PendingAddItemInfo r1 = r6.mPendingAddInfo
            com.android.launcher3.Launcher$PendingAddArguments r0 = preparePendingAddArgs$ar$ds(r0, r2, r4, r1)
            sPendingAddItem = r0
            return
        L_0x00b7:
            java.lang.String r0 = "Launcher"
            java.lang.String r1 = "Error: appWidgetId (EXTRA_APPWIDGET_ID) was not returned from the widget configuration activity."
            android.util.Log.e(r0, r1)
            r14.completeTwoStageWidgetDrop(r3, r4)
            com.android.launcher3.Launcher$5 r0 = new com.android.launcher3.Launcher$5
            r0.<init>()
            if (r12 == 0) goto L_0x00d0
            com.android.launcher3.Workspace r1 = r6.mWorkspace
            r2 = 500(0x1f4, double:2.47E-321)
            r1.postDelayed(r0, r2)
            return
        L_0x00d0:
            com.android.launcher3.Workspace r1 = r6.mWorkspace
            r1.removeExtraEmptyScreenDelayed(r11, r0, r10, r3)
            return
        L_0x00d6:
            r8 = 12
            if (r0 != r8) goto L_0x00eb
            if (r1 != r5) goto L_0x00ea
            com.android.launcher3.PendingAddItemInfo r0 = r6.mPendingAddInfo
            com.android.launcher3.Launcher$PendingAddArguments r0 = preparePendingAddArgs$ar$ds(r8, r2, r4, r0)
            if (r12 == 0) goto L_0x00e7
            sPendingAddItem = r0
            return
        L_0x00e7:
            r14.completeAdd(r0)
        L_0x00ea:
            return
        L_0x00eb:
            if (r1 != r5) goto L_0x010d
            com.android.launcher3.PendingAddItemInfo r1 = r6.mPendingAddInfo
            long r8 = r1.container
            r12 = -1
            int r4 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x0114
            com.android.launcher3.Launcher$PendingAddArguments r0 = preparePendingAddArgs$ar$ds(r0, r2, r5, r1)
            boolean r1 = r14.isWorkspaceLocked()
            if (r1 == 0) goto L_0x0104
            sPendingAddItem = r0
            goto L_0x0114
        L_0x0104:
            r14.completeAdd(r0)
            com.android.launcher3.Workspace r0 = r6.mWorkspace
            r0.removeExtraEmptyScreenDelayed(r11, r7, r10, r3)
            goto L_0x0114
        L_0x010d:
            if (r1 != 0) goto L_0x0114
            com.android.launcher3.Workspace r0 = r6.mWorkspace
            r0.removeExtraEmptyScreenDelayed(r11, r7, r10, r3)
        L_0x0114:
            com.android.launcher3.DragLayer r0 = r6.mDragLayer
            r0.clearAnimatedView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.Launcher.handleActivityResult(int, int, android.content.Intent):void");
    }

    private final void onStartForResult(int i) {
        if (i >= 0) {
            this.mWaitingForResult = true;
        }
    }

    private final void prepareAppWidget(AppWidgetHostView appWidgetHostView, LauncherAppWidgetInfo launcherAppWidgetInfo) {
        appWidgetHostView.setTag(launcherAppWidgetInfo);
        if (!launcherAppWidgetInfo.mHasNotifiedInitialWidgetSizeChanged) {
            AppWidgetResizeFrame.updateWidgetSizeRanges(launcherAppWidgetInfo.hostView, this, launcherAppWidgetInfo.spanX, launcherAppWidgetInfo.spanY);
            launcherAppWidgetInfo.mHasNotifiedInitialWidgetSizeChanged = true;
        }
        appWidgetHostView.setFocusable(true);
        appWidgetHostView.setOnFocusChangeListener(this.mFocusHandler);
    }

    private static final PendingAddArguments preparePendingAddArgs$ar$ds(int i, Intent intent, int i2, ItemInfo itemInfo) {
        PendingAddArguments pendingAddArguments = new PendingAddArguments();
        pendingAddArguments.requestCode = i;
        pendingAddArguments.intent = intent;
        pendingAddArguments.container = itemInfo.container;
        pendingAddArguments.screenId = itemInfo.screenId;
        pendingAddArguments.cellX = itemInfo.cellX;
        pendingAddArguments.cellY = itemInfo.cellY;
        pendingAddArguments.appWidgetId = i2;
        return pendingAddArguments;
    }

    private final void resetAddInfo() {
        PendingAddItemInfo pendingAddItemInfo = this.mPendingAddInfo;
        pendingAddItemInfo.container = -1;
        pendingAddItemInfo.screenId = -1;
        pendingAddItemInfo.cellY = -1;
        pendingAddItemInfo.cellX = -1;
        pendingAddItemInfo.spanY = -1;
        pendingAddItemInfo.spanX = -1;
        pendingAddItemInfo.minSpanY = 1;
        pendingAddItemInfo.minSpanX = 1;
        pendingAddItemInfo.dropPos = null;
        pendingAddItemInfo.componentName = null;
        pendingAddItemInfo.user = UserHandleCompat.myUserHandle();
    }

    private final void showAppsOrWidgets$ar$edu$ar$ds(int i, boolean z, boolean z2) {
        int i2 = this.mState$ar$edu$fb933cd0_0;
        if (i2 != 2 && i2 != 4 && i2 != 6) {
            return;
        }
        if (i == 3 || i == 5) {
            if (i == 3) {
                LauncherStateTransitionAnimation launcherStateTransitionAnimation = this.mStateTransitionAnimation;
                Workspace.State state = this.mWorkspace.mState;
                Launcher launcher = launcherStateTransitionAnimation.mLauncher;
                AllAppsContainerView allAppsContainerView = launcher.mAppsView;
                LauncherStateTransitionAnimation launcherStateTransitionAnimation2 = launcherStateTransitionAnimation;
                launcherStateTransitionAnimation.mCurrentAnimation = launcherStateTransitionAnimation2.startAnimationToOverlay$ar$ds(Workspace.State.NORMAL_HIDDEN, launcher.mAllAppsButton, allAppsContainerView, z, new LauncherStateTransitionAnimation.PrivateTransitionCallbacks(z2, allAppsContainerView) {
                    final /* synthetic */ boolean val$startSearchAfterTransition;
                    final /* synthetic */ AllAppsContainerView val$toView;

                    {
                        this.val$startSearchAfterTransition = r2;
                        this.val$toView = r3;
                    }

                    public final AnimatorListenerAdapter getMaterialRevealViewAnimatorListener(View view, final View view2) {
                        return new AnimatorListenerAdapter() {
                            public final void onAnimationEnd(Animator animator) {
                                view2.setVisibility(0);
                            }

                            public final void onAnimationStart(Animator animator) {
                                view2.setVisibility(4);
                            }
                        };
                    }

                    public final float getMaterialRevealViewStartFinalRadius() {
                        return (float) (LauncherStateTransitionAnimation.this.mLauncher.mDeviceProfile.allAppsButtonVisualSize / 2);
                    }

                    public final void onTransitionComplete() {
                        AllAppsSearchBarController allAppsSearchBarController;
                        if (this.val$startSearchAfterTransition && (allAppsSearchBarController = this.val$toView.mSearchBarController) != null) {
                            allAppsSearchBarController.focusSearchField();
                        }
                    }
                });
            } else {
                LauncherStateTransitionAnimation launcherStateTransitionAnimation3 = this.mStateTransitionAnimation;
                Workspace.State state2 = this.mWorkspace.mState;
                Launcher launcher2 = launcherStateTransitionAnimation3.mLauncher;
                WidgetsContainerView widgetsContainerView = launcher2.mWidgetsView;
                LauncherStateTransitionAnimation launcherStateTransitionAnimation4 = launcherStateTransitionAnimation3;
                launcherStateTransitionAnimation3.mCurrentAnimation = launcherStateTransitionAnimation4.startAnimationToOverlay$ar$ds(Workspace.State.OVERVIEW_HIDDEN, launcher2.mWidgetsButton, widgetsContainerView, z, new LauncherStateTransitionAnimation.PrivateTransitionCallbacks(0.3f));
            }
            this.mState$ar$edu$fb933cd0_0 = i;
            this.mUserPresent = false;
            updateAutoAdvanceState();
            closeFolder(true);
            closeShortcutsContainer(true);
            getWindow().getDecorView().sendAccessibilityEvent(32);
        }
    }

    private final void showBrokenAppInstallDialog(final String str, DialogInterface.OnClickListener onClickListener) {
        new AlertDialog.Builder(this).setTitle(R.string.abandoned_promises_title).setMessage(R.string.abandoned_promise_explanation).setPositiveButton(R.string.abandoned_search, onClickListener).setNeutralButton(R.string.abandoned_clean_this, new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                UserHandleCompat myUserHandle = UserHandleCompat.myUserHandle();
                Workspace workspace = Launcher.this.mWorkspace;
                String str = str;
                HashSet hashSet = new HashSet(1);
                hashSet.add(str);
                LauncherModel.deleteItemsFromDatabase(workspace.mLauncher, LauncherModel.getItemsByPackageName(str, myUserHandle));
                workspace.removeItemsByMatcher(new ItemInfoMatcher(hashSet, myUserHandle) {
                    final /* synthetic */ HashSet val$packageNames;
                    final /* synthetic */ UserHandleCompat val$user;

                    {
                        this.val$packageNames = r1;
                        this.val$user = r2;
                    }

                    public final boolean matches(ItemInfo itemInfo, ComponentName componentName) {
                        return this.val$packageNames.contains(componentName.getPackageName()) && itemInfo.user.equals(this.val$user);
                    }
                });
            }
        }).create().show();
    }

    private final void startGlobalSearch(String str, boolean z, Bundle bundle, Rect rect) {
        ComponentName globalSearchActivity = ((SearchManager) getSystemService("search")).getGlobalSearchActivity();
        if (globalSearchActivity == null) {
            Log.w("Launcher", "No global search activity found.");
            return;
        }
        Intent intent = new Intent("android.search.action.GLOBAL_SEARCH");
        intent.addFlags(268435456);
        intent.setComponent(globalSearchActivity);
        Bundle bundle2 = new Bundle(bundle);
        if (!bundle2.containsKey("source")) {
            bundle2.putString("source", getPackageName());
        }
        intent.putExtra("app_data", bundle2);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("query", str);
        }
        if (z) {
            intent.putExtra("select_query", true);
        }
        intent.setSourceBounds(rect);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Log.e("Launcher", "Global search activity not found: ".concat(globalSearchActivity.toString()));
        }
    }

    /* access modifiers changed from: package-private */
    public final void addAppWidgetImpl(int i, ItemInfo itemInfo, AppWidgetHostView appWidgetHostView, LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo, int i2) {
        if (launcherAppWidgetProviderInfo.configure != null) {
            this.mPendingAddWidgetInfo = launcherAppWidgetProviderInfo;
            this.mPendingAddWidgetId = i;
            this.mAppWidgetManager.startConfigActivity(launcherAppWidgetProviderInfo, i, this, this.mAppWidgetHost, 5);
            return;
        }
        C528016 r0 = new Runnable() {
            public final void run() {
                Launcher.this.exitSpringLoadedDragModeDelayed$ar$ds(true, 300);
            }
        };
        completeAddAppWidget(i, itemInfo.container, itemInfo.screenId, appWidgetHostView, launcherAppWidgetProviderInfo);
        this.mWorkspace.removeExtraEmptyScreenDelayed(true, r0, i2, false);
    }

    public final void addPendingItem(PendingAddItemInfo pendingAddItemInfo, long j, long j2, int[] iArr, int i, int i2) {
        int i3 = pendingAddItemInfo.itemType;
        if (i3 == 1) {
            PendingAddShortcutInfo pendingAddShortcutInfo = (PendingAddShortcutInfo) pendingAddItemInfo;
            resetAddInfo();
            PendingAddItemInfo pendingAddItemInfo2 = this.mPendingAddInfo;
            pendingAddItemInfo2.container = j;
            pendingAddItemInfo2.screenId = j2;
            pendingAddItemInfo2.dropPos = null;
            pendingAddItemInfo2.componentName = pendingAddShortcutInfo.componentName;
            pendingAddItemInfo2.user = pendingAddShortcutInfo.user;
            if (iArr != null) {
                pendingAddItemInfo2.cellX = iArr[0];
                pendingAddItemInfo2.cellY = iArr[1];
            }
            if (!pendingAddShortcutInfo.activityInfo.startConfigActivity(this, 1)) {
                handleActivityResult(1, 0, (Intent) null);
            }
        } else if (i3 == 4 || i3 == 5) {
            int[] iArr2 = {i, i2};
            PendingAddWidgetInfo pendingAddWidgetInfo = (PendingAddWidgetInfo) pendingAddItemInfo;
            resetAddInfo();
            PendingAddItemInfo pendingAddItemInfo3 = this.mPendingAddInfo;
            pendingAddWidgetInfo.container = j;
            pendingAddItemInfo3.container = j;
            pendingAddWidgetInfo.screenId = j2;
            pendingAddItemInfo3.screenId = j2;
            pendingAddItemInfo3.dropPos = null;
            pendingAddItemInfo3.minSpanX = pendingAddWidgetInfo.minSpanX;
            pendingAddItemInfo3.minSpanY = pendingAddWidgetInfo.minSpanY;
            if (iArr != null) {
                pendingAddItemInfo3.cellX = iArr[0];
                pendingAddItemInfo3.cellY = iArr[1];
            }
            pendingAddItemInfo3.spanX = iArr2[0];
            pendingAddItemInfo3.spanY = iArr2[1];
            AppWidgetHostView appWidgetHostView = pendingAddWidgetInfo.boundWidget;
            if (appWidgetHostView == null) {
                int allocateAppWidgetId = this.mAppWidgetHost.allocateAppWidgetId();
                if (this.mAppWidgetManager.bindAppWidgetIdIfAllowed(allocateAppWidgetId, pendingAddWidgetInfo.info, pendingAddWidgetInfo.bindOptions)) {
                    addAppWidgetImpl(allocateAppWidgetId, pendingAddWidgetInfo, (AppWidgetHostView) null, pendingAddWidgetInfo.info, 0);
                    return;
                }
                this.mPendingAddWidgetInfo = pendingAddWidgetInfo.info;
                Intent intent = new Intent("android.appwidget.action.APPWIDGET_BIND");
                intent.putExtra("appWidgetId", allocateAppWidgetId);
                intent.putExtra("appWidgetProvider", pendingAddWidgetInfo.componentName);
                this.mAppWidgetManager.getUser(this.mPendingAddWidgetInfo).addToIntent(intent, "appWidgetProviderProfile");
                onStartForResult(11);
                super.startActivityForResult(intent, 11);
                return;
            }
            this.mDragLayer.removeView(appWidgetHostView);
            addAppWidgetImpl(appWidgetHostView.getAppWidgetId(), pendingAddWidgetInfo, appWidgetHostView, pendingAddWidgetInfo.info, 0);
            pendingAddWidgetInfo.boundWidget = null;
        } else {
            throw new IllegalStateException("Unknown item type: " + i3);
        }
    }

    public final void bindAddScreens(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Workspace workspace = this.mWorkspace;
            long longValue = ((Long) arrayList.get(i)).longValue();
            int indexOf = workspace.mScreenOrder.indexOf(-201L);
            if (indexOf < 0) {
                indexOf = workspace.mScreenOrder.size();
            }
            workspace.insertNewWorkspaceScreen$ar$ds$5d2eef57_0(longValue, indexOf);
        }
    }

    public final void bindAllApplications(ArrayList arrayList) {
        if (waitUntilResume(this.mBindAllApplicationsRunnable, true)) {
            this.mTmpAppsList = arrayList;
            return;
        }
        AllAppsContainerView allAppsContainerView = this.mAppsView;
        if (allAppsContainerView != null) {
            AlphabeticalAppsList alphabeticalAppsList = allAppsContainerView.mApps;
            alphabeticalAppsList.mComponentToAppMap.clear();
            alphabeticalAppsList.updateApps(arrayList);
        }
    }

    public final void bindAppInfosRemoved(final ArrayList arrayList) {
        AllAppsContainerView allAppsContainerView;
        if (!waitUntilResume(new Runnable() {
            public final void run() {
                Launcher.this.bindAppInfosRemoved(arrayList);
            }
        }, false) && (allAppsContainerView = this.mAppsView) != null) {
            AlphabeticalAppsList alphabeticalAppsList = allAppsContainerView.mApps;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                alphabeticalAppsList.mComponentToAppMap.remove(((AppInfo) it.next()).toComponentKey());
            }
            alphabeticalAppsList.onAppsUpdated();
        }
    }

    public final void bindAppWidget(final LauncherAppWidgetInfo launcherAppWidgetInfo) {
        LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo;
        if (!waitUntilResume(new Runnable() {
            public final void run() {
                Launcher.this.bindAppWidget(launcherAppWidgetInfo);
            }
        }, false)) {
            if (this.mIsSafeModeEnabled) {
                PendingAppWidgetHostView pendingAppWidgetHostView = new PendingAppWidgetHostView(this, launcherAppWidgetInfo, true);
                pendingAppWidgetHostView.updateIcon(this.mIconCache);
                launcherAppWidgetInfo.hostView = pendingAppWidgetHostView;
                launcherAppWidgetInfo.hostView.updateAppWidget((RemoteViews) null);
                launcherAppWidgetInfo.hostView.setOnClickListener(this);
                addAppWidgetToWorkspace(launcherAppWidgetInfo, (LauncherAppWidgetProviderInfo) null, false);
                this.mWorkspace.requestLayout();
                return;
            }
            if (launcherAppWidgetInfo.hasRestoreFlag(2)) {
                launcherAppWidgetProviderInfo = null;
            } else if (launcherAppWidgetInfo.hasRestoreFlag(1)) {
                launcherAppWidgetProviderInfo = this.mAppWidgetManager.findProvider(launcherAppWidgetInfo.providerName, launcherAppWidgetInfo.user);
            } else {
                launcherAppWidgetProviderInfo = this.mAppWidgetManager.getLauncherAppWidgetInfo(launcherAppWidgetInfo.appWidgetId);
            }
            if (!launcherAppWidgetInfo.hasRestoreFlag(2) && launcherAppWidgetInfo.restoreStatus != 0) {
                if (launcherAppWidgetProviderInfo == null) {
                    LauncherModel.deleteItemFromDatabase(this, launcherAppWidgetInfo);
                    return;
                }
                int i = 4;
                if (launcherAppWidgetInfo.hasRestoreFlag(1)) {
                    PendingAddWidgetInfo pendingAddWidgetInfo = new PendingAddWidgetInfo(this, launcherAppWidgetProviderInfo);
                    pendingAddWidgetInfo.spanX = launcherAppWidgetInfo.spanX;
                    pendingAddWidgetInfo.spanY = launcherAppWidgetInfo.spanY;
                    pendingAddWidgetInfo.minSpanX = launcherAppWidgetInfo.minSpanX;
                    pendingAddWidgetInfo.minSpanY = launcherAppWidgetInfo.minSpanY;
                    Bundle defaultOptionsForWidget = WidgetHostViewLoader.getDefaultOptionsForWidget(this, pendingAddWidgetInfo);
                    int allocateAppWidgetId = this.mAppWidgetHost.allocateAppWidgetId();
                    if (!this.mAppWidgetManager.bindAppWidgetIdIfAllowed(allocateAppWidgetId, launcherAppWidgetProviderInfo, defaultOptionsForWidget)) {
                        this.mAppWidgetHost.deleteAppWidgetId(allocateAppWidgetId);
                        LauncherModel.deleteItemFromDatabase(this, launcherAppWidgetInfo);
                        return;
                    }
                    launcherAppWidgetInfo.appWidgetId = allocateAppWidgetId;
                    if (launcherAppWidgetProviderInfo.configure == null) {
                        i = 0;
                    }
                    launcherAppWidgetInfo.restoreStatus = i;
                    LauncherModel.updateItemInDatabase(this, launcherAppWidgetInfo);
                } else if (launcherAppWidgetInfo.hasRestoreFlag(4) && launcherAppWidgetProviderInfo.configure == null) {
                    launcherAppWidgetInfo.restoreStatus = 0;
                    LauncherModel.updateItemInDatabase(this, launcherAppWidgetInfo);
                }
            }
            if (launcherAppWidgetInfo.restoreStatus != 0) {
                PendingAppWidgetHostView pendingAppWidgetHostView2 = new PendingAppWidgetHostView(this, launcherAppWidgetInfo, this.mIsSafeModeEnabled);
                pendingAppWidgetHostView2.updateIcon(this.mIconCache);
                launcherAppWidgetInfo.hostView = pendingAppWidgetHostView2;
                launcherAppWidgetInfo.hostView.updateAppWidget((RemoteViews) null);
                launcherAppWidgetInfo.hostView.setOnClickListener(this);
                addAppWidgetToWorkspace(launcherAppWidgetInfo, (LauncherAppWidgetProviderInfo) null, false);
            } else if (launcherAppWidgetProviderInfo == null) {
                Log.e("Launcher", "Removing invalid widget: id=" + launcherAppWidgetInfo.appWidgetId);
                deleteWidgetInfo(launcherAppWidgetInfo);
                return;
            } else {
                launcherAppWidgetInfo.hostView = this.mAppWidgetHost.createView(this, launcherAppWidgetInfo.appWidgetId, launcherAppWidgetProviderInfo);
                launcherAppWidgetInfo.minSpanX = launcherAppWidgetProviderInfo.minSpanX;
                launcherAppWidgetInfo.minSpanY = launcherAppWidgetProviderInfo.minSpanY;
                addAppWidgetToWorkspace(launcherAppWidgetInfo, launcherAppWidgetProviderInfo, false);
            }
            this.mWorkspace.requestLayout();
        }
    }

    public final void bindAppsAdded(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        AllAppsContainerView allAppsContainerView;
        final ArrayList arrayList5 = arrayList;
        final ArrayList arrayList6 = arrayList2;
        final ArrayList arrayList7 = arrayList3;
        final ArrayList arrayList8 = arrayList4;
        if (!waitUntilResume(new Runnable() {
            public final void run() {
                Launcher.this.bindAppsAdded(arrayList5, arrayList6, arrayList7, arrayList8);
            }
        }, false)) {
            if (arrayList != null) {
                bindAddScreens(arrayList);
            }
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                bindItems(arrayList2, 0, arrayList2.size(), false);
            }
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                bindItems(arrayList3, 0, arrayList3.size(), true);
            }
            this.mWorkspace.removeExtraEmptyScreenDelayed(false, (Runnable) null, 0, false);
            if (arrayList4 != null && (allAppsContainerView = this.mAppsView) != null) {
                allAppsContainerView.mApps.updateApps(arrayList4);
            }
        }
    }

    public final void bindAppsUpdated(final ArrayList arrayList) {
        AllAppsContainerView allAppsContainerView;
        if (!waitUntilResume(new Runnable() {
            public final void run() {
                Launcher.this.bindAppsUpdated(arrayList);
            }
        }, false) && (allAppsContainerView = this.mAppsView) != null) {
            allAppsContainerView.mApps.updateApps(arrayList);
        }
    }

    public final void bindDeepShortcutMap(MultiHashMap multiHashMap) {
        this.mDeepShortcutMap = multiHashMap;
    }

    public final void bindFolders(final LongArrayMap longArrayMap) {
        if (!waitUntilResume(new Runnable() {
            public final void run() {
                Launcher.this.bindFolders(longArrayMap);
            }
        }, false)) {
            sFolders = longArrayMap.clone();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindItems(java.util.ArrayList r28, int r29, int r30, boolean r31) {
        /*
            r27 = this;
            r6 = r27
            com.android.launcher3.Launcher$27 r7 = new com.android.launcher3.Launcher$27
            r0 = r7
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r31
            r0.<init>(r2, r3, r4, r5)
            r0 = 0
            boolean r1 = r6.waitUntilResume(r7, r0)
            if (r1 == 0) goto L_0x001a
            return
        L_0x001a:
            android.animation.AnimatorSet r1 = com.android.launcher3.LauncherAnimUtils.createAnimatorSet()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 1
            if (r31 == 0) goto L_0x0048
            long r4 = java.lang.System.currentTimeMillis()
            com.android.launcher3.DragController r7 = r6.mDragController
            boolean r8 = r7.mDragging
            if (r8 == 0) goto L_0x0035
            long r7 = java.lang.System.currentTimeMillis()
            goto L_0x0037
        L_0x0035:
            long r7 = r7.mLastTouchUpTime
        L_0x0037:
            long r4 = r4 - r7
            r7 = 5000(0x1388, double:2.4703E-320)
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0048
            com.android.launcher3.LauncherClings r4 = r6.mClings
            if (r4 == 0) goto L_0x0046
            boolean r4 = r4.mIsVisible
            if (r4 != 0) goto L_0x0048
        L_0x0046:
            r4 = 1
            goto L_0x0049
        L_0x0048:
            r4 = 0
        L_0x0049:
            com.android.launcher3.Workspace r5 = r6.mWorkspace
            r17 = -1
            r15 = r29
            r14 = r30
            r11 = r17
        L_0x0053:
            if (r15 >= r14) goto L_0x01b7
            r13 = r28
            java.lang.Object r7 = r13.get(r15)
            r9 = r7
            com.android.launcher3.ItemInfo r9 = (com.android.launcher3.ItemInfo) r9
            long r7 = r9.container
            r19 = -101(0xffffffffffffff9b, double:NaN)
            int r10 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r10 != 0) goto L_0x0077
            com.android.launcher3.Hotseat r7 = r6.mHotseat
            if (r7 != 0) goto L_0x0077
        L_0x006a:
            r21 = r1
            r31 = r4
            r24 = r5
            r3 = r11
            r22 = r15
        L_0x0073:
            r7 = 1
            r8 = 0
            goto L_0x01a8
        L_0x0077:
            int r7 = r9.itemType
            r10 = 2
            if (r7 == 0) goto L_0x00d3
            if (r7 == r3) goto L_0x00d3
            if (r7 == r10) goto L_0x00c1
            r8 = 4
            if (r7 == r8) goto L_0x008f
            r8 = 6
            if (r7 != r8) goto L_0x0087
            goto L_0x00d3
        L_0x0087:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Invalid Item Type"
            r0.<init>(r1)
            throw r0
        L_0x008f:
            r7 = r9
            com.android.launcher3.LauncherAppWidgetInfo r7 = (com.android.launcher3.LauncherAppWidgetInfo) r7
            boolean r8 = r6.mIsSafeModeEnabled
            if (r8 == 0) goto L_0x00a3
            com.android.launcher3.PendingAppWidgetHostView r8 = new com.android.launcher3.PendingAppWidgetHostView
            r8.<init>(r6, r7, r3)
            com.android.launcher3.IconCache r10 = r6.mIconCache
            r8.updateIcon(r10)
            r7.hostView = r8
            goto L_0x00bb
        L_0x00a3:
            com.android.launcher3.compat.AppWidgetManagerCompat r8 = r6.mAppWidgetManager
            int r10 = r7.appWidgetId
            com.android.launcher3.LauncherAppWidgetProviderInfo r8 = r8.getLauncherAppWidgetInfo(r10)
            if (r8 != 0) goto L_0x00b1
            r6.deleteWidgetInfo(r7)
            goto L_0x006a
        L_0x00b1:
            com.android.launcher3.LauncherAppWidgetHost r10 = r6.mAppWidgetHost
            int r0 = r7.appWidgetId
            android.appwidget.AppWidgetHostView r0 = r10.createView(r6, r0, r8)
            r7.hostView = r0
        L_0x00bb:
            android.appwidget.AppWidgetHostView r0 = r7.hostView
            r6.prepareAppWidget(r0, r7)
            goto L_0x00d0
        L_0x00c1:
            int r0 = r5.mCurrentPage
            android.view.View r0 = r5.getChildAt(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r7 = r9
            com.android.launcher3.FolderInfo r7 = (com.android.launcher3.FolderInfo) r7
            com.android.launcher3.FolderIcon r0 = com.android.launcher3.FolderIcon.fromXml$ar$ds(r6, r0, r7)
        L_0x00d0:
            r31 = r4
            goto L_0x0129
        L_0x00d3:
            r0 = r9
            com.android.launcher3.ShortcutInfo r0 = (com.android.launcher3.ShortcutInfo) r0
            android.view.View r0 = r6.createShortcut(r0)
            long r7 = r9.container
            r20 = -100
            int r10 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r10 != 0) goto L_0x00d0
            com.android.launcher3.Workspace r7 = r6.mWorkspace
            r31 = r4
            long r3 = r9.screenId
            com.android.launcher3.CellLayout r3 = r7.getScreenWithId(r3)
            if (r3 == 0) goto L_0x0129
            int r4 = r9.cellX
            int r7 = r9.cellY
            boolean r4 = r3.isOccupied(r4, r7)
            if (r4 == 0) goto L_0x0129
            int r4 = r9.cellX
            int r7 = r9.cellY
            com.android.launcher3.ShortcutAndWidgetContainer r3 = r3.mShortcutsAndWidgets
            android.view.View r3 = r3.getChildAt(r4, r7)
            java.lang.Object r3 = r3.getTag()
            java.lang.String r4 = java.lang.String.valueOf(r9)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Collision while binding workspace item: "
            r7.<init>(r8)
            r7.append(r4)
            java.lang.String r4 = ". Collides with "
            r7.append(r4)
            r7.append(r3)
            java.lang.String r3 = "Launcher"
            java.lang.String r4 = r7.toString()
            android.util.Log.d(r3, r4)
        L_0x0129:
            long r3 = r9.container
            long r7 = r9.screenId
            int r10 = r9.cellX
            int r14 = r9.cellY
            r16 = r15
            int r15 = r9.spanX
            r21 = r1
            int r1 = r9.spanY
            r22 = r7
            r7 = r5
            r8 = r0
            r24 = r5
            r5 = r9
            r25 = r10
            r26 = 2
            r9 = r3
            r3 = r11
            r11 = r22
            r13 = r25
            r22 = r16
            r16 = r1
            r7.addInScreenFromBind(r8, r9, r11, r13, r14, r15, r16)
            if (r31 == 0) goto L_0x0073
            r1 = 0
            r0.setAlpha(r1)
            r0.setScaleX(r1)
            r0.setScaleY(r1)
            r1 = 3
            android.animation.PropertyValuesHolder[] r1 = new android.animation.PropertyValuesHolder[r1]
            r7 = 1
            float[] r3 = new float[r7]
            r4 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r3[r8] = r4
            java.lang.String r9 = "alpha"
            android.animation.PropertyValuesHolder r3 = android.animation.PropertyValuesHolder.ofFloat(r9, r3)
            r1[r8] = r3
            float[] r3 = new float[r7]
            r3[r8] = r4
            java.lang.String r9 = "scaleX"
            android.animation.PropertyValuesHolder r3 = android.animation.PropertyValuesHolder.ofFloat(r9, r3)
            r1[r7] = r3
            float[] r3 = new float[r7]
            r3[r8] = r4
            java.lang.String r4 = "scaleY"
            android.animation.PropertyValuesHolder r3 = android.animation.PropertyValuesHolder.ofFloat(r4, r3)
            r1[r26] = r3
            android.animation.ObjectAnimator r0 = com.android.launcher3.LauncherAnimUtils.ofPropertyValuesHolder(r0, r1)
            r3 = 450(0x1c2, double:2.223E-321)
            r0.setDuration(r3)
            int r15 = r22 * 85
            long r3 = (long) r15
            r0.setStartDelay(r3)
            android.view.animation.OvershootInterpolator r1 = new android.view.animation.OvershootInterpolator
            r3 = 1067869798(0x3fa66666, float:1.3)
            r1.<init>(r3)
            r0.setInterpolator(r1)
            r2.add(r0)
            long r11 = r5.screenId
            goto L_0x01a9
        L_0x01a8:
            r11 = r3
        L_0x01a9:
            int r15 = r22 + 1
            r14 = r30
            r4 = r31
            r1 = r21
            r5 = r24
            r0 = 0
            r3 = 1
            goto L_0x0053
        L_0x01b7:
            r21 = r1
            r31 = r4
            r24 = r5
            r3 = r11
            if (r31 == 0) goto L_0x01f1
            int r0 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x01f1
            com.android.launcher3.Workspace r0 = r6.mWorkspace
            int r1 = r0.getNextPage()
            long r0 = r0.getScreenIdForPageIndex(r1)
            com.android.launcher3.Workspace r5 = r6.mWorkspace
            int r5 = r5.getPageIndexForScreenId(r3)
            com.android.launcher3.Launcher$28 r7 = new com.android.launcher3.Launcher$28
            r8 = r21
            r7.<init>(r8, r2)
            r8 = 500(0x1f4, double:2.47E-321)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x01ec
            com.android.launcher3.Workspace r0 = r6.mWorkspace
            com.android.launcher3.Launcher$29 r1 = new com.android.launcher3.Launcher$29
            r1.<init>(r5, r7)
            r0.postDelayed(r1, r8)
            goto L_0x01f1
        L_0x01ec:
            com.android.launcher3.Workspace r0 = r6.mWorkspace
            r0.postDelayed(r7, r8)
        L_0x01f1:
            r24.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.Launcher.bindItems(java.util.ArrayList, int, int, boolean):void");
    }

    public final void bindRestoreItemsChange(final HashSet hashSet) {
        if (!waitUntilResume(new Runnable() {
            public final void run() {
                Launcher.this.bindRestoreItemsChange(hashSet);
            }
        }, false)) {
            this.mWorkspace.mapOverItems(true, new Workspace.ItemOperator(hashSet) {
                final /* synthetic */ HashSet val$updates;

                {
                    this.val$updates = r1;
                }

                public final boolean evaluate(ItemInfo itemInfo, View view, View view2) {
                    if ((itemInfo instanceof ShortcutInfo) && (view instanceof BubbleTextView) && this.val$updates.contains(itemInfo)) {
                        ((BubbleTextView) view).applyState(false);
                    } else if ((view instanceof PendingAppWidgetHostView) && (itemInfo instanceof LauncherAppWidgetInfo) && this.val$updates.contains(itemInfo)) {
                        ((PendingAppWidgetHostView) view).applyState();
                    }
                    return false;
                }
            });
        }
    }

    public final void bindScreens(ArrayList arrayList) {
        bindAddScreens(arrayList);
        if (arrayList.size() == 0) {
            this.mWorkspace.addExtraEmptyScreen$ar$ds();
        }
    }

    public final void bindSearchProviderChanged() {
        SearchDropTargetBar searchDropTargetBar = this.mSearchDropTargetBar;
        if (searchDropTargetBar != null) {
            AppWidgetHostView appWidgetHostView = this.mQsb;
            if (appWidgetHostView != null) {
                searchDropTargetBar.removeView(appWidgetHostView);
                this.mQsb = null;
            }
            this.mSearchDropTargetBar.mQSB = getOrCreateQsbBar();
        }
    }

    public final void bindShortcutsChanged(final ArrayList arrayList, final ArrayList arrayList2, final UserHandleCompat userHandleCompat) {
        if (!waitUntilResume(new Runnable() {
            public final void run() {
                Launcher.this.bindShortcutsChanged(arrayList, arrayList2, userHandleCompat);
            }
        }, false)) {
            if (!arrayList.isEmpty()) {
                Workspace workspace = this.mWorkspace;
                workspace.mapOverItems(true, new Workspace.ItemOperator(new HashSet(arrayList)) {
                    final /* synthetic */ HashSet val$updates;

                    {
                        this.val$updates = r2;
                    }

                    public final boolean evaluate(ItemInfo itemInfo, View view, View view2) {
                        if ((itemInfo instanceof ShortcutInfo) && (view instanceof BubbleTextView) && this.val$updates.contains(itemInfo)) {
                            ShortcutInfo shortcutInfo = (ShortcutInfo) itemInfo;
                            BubbleTextView bubbleTextView = (BubbleTextView) view;
                            Drawable textViewIcon = Workspace.getTextViewIcon(bubbleTextView);
                            boolean z = true;
                            boolean z2 = (textViewIcon instanceof PreloadIconDrawable) && ((PreloadIconDrawable) textViewIcon).mAnimationProgress < 1.0f;
                            IconCache iconCache = Workspace.this.mIconCache;
                            if (shortcutInfo.hasStatusFlag(3) == z2) {
                                z = false;
                            }
                            bubbleTextView.applyFromShortcutInfo(shortcutInfo, iconCache, z);
                            if (view2 != null) {
                                view2.invalidate();
                            }
                        }
                        return false;
                    }
                });
            }
            if (!arrayList2.isEmpty()) {
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ShortcutInfo shortcutInfo = (ShortcutInfo) arrayList2.get(i);
                    if (shortcutInfo.itemType == 6) {
                        hashSet2.add(DeepShortcutKey.fromShortcutInfo(shortcutInfo));
                    } else {
                        hashSet.add(shortcutInfo.getTargetComponent());
                    }
                }
                if (!hashSet.isEmpty()) {
                    ItemInfoMatcher.C54651 r8 = new ItemInfoMatcher(hashSet, userHandleCompat) {
                        final /* synthetic */ HashSet val$components;
                        final /* synthetic */ UserHandleCompat val$user;

                        {
                            this.val$components = r1;
                            this.val$user = r2;
                        }

                        public final boolean matches(ItemInfo itemInfo, ComponentName componentName) {
                            return this.val$components.contains(componentName) && itemInfo.user.equals(this.val$user);
                        }
                    };
                    this.mWorkspace.removeItemsByMatcher(r8);
                    this.mDragController.onAppsRemoved(r8);
                }
                if (!hashSet2.isEmpty()) {
                    ItemInfoMatcher.C54673 r7 = new ItemInfoMatcher(hashSet2) {
                        final /* synthetic */ HashSet val$keys;

                        {
                            this.val$keys = r1;
                        }

                        public final boolean matches(ItemInfo itemInfo, ComponentName componentName) {
                            return itemInfo.itemType == 6 && this.val$keys.contains(DeepShortcutKey.fromShortcutInfo((ShortcutInfo) itemInfo));
                        }
                    };
                    this.mWorkspace.removeItemsByMatcher(r7);
                    this.mDragController.onAppsRemoved(r7);
                }
            }
        }
    }

    public final void bindWidgetsModel(WidgetsModel widgetsModel) {
        if (waitUntilResume(this.mBindWidgetModelRunnable, true)) {
            this.mWidgetsModel = widgetsModel;
            return;
        }
        WidgetsContainerView widgetsContainerView = this.mWidgetsView;
        if (widgetsContainerView != null && widgetsModel != null) {
            widgetsContainerView.mRecyclerView.mWidgets = widgetsModel;
            WidgetsListAdapter widgetsListAdapter = widgetsContainerView.mAdapter;
            widgetsListAdapter.mWidgetsModel = widgetsModel;
            widgetsListAdapter.mObservable.mo2879a();
            this.mWidgetsModel = null;
        }
    }

    public final void bindWidgetsRestored(final ArrayList arrayList) {
        Object obj;
        if (!waitUntilResume(new Runnable() {
            public final void run() {
                Launcher.this.bindWidgetsRestored(arrayList);
            }
        }, false)) {
            Workspace workspace = this.mWorkspace;
            if (!arrayList.isEmpty()) {
                Workspace.DeferredWidgetRefresh deferredWidgetRefresh = new Workspace.DeferredWidgetRefresh(arrayList, workspace.mLauncher.mAppWidgetHost);
                LauncherAppWidgetInfo launcherAppWidgetInfo = (LauncherAppWidgetInfo) arrayList.get(0);
                if (launcherAppWidgetInfo.hasRestoreFlag(1)) {
                    obj = AppWidgetManagerCompat.getInstance(workspace.mLauncher).findProvider(launcherAppWidgetInfo.providerName, launcherAppWidgetInfo.user);
                } else {
                    obj = AppWidgetManagerCompat.getInstance(workspace.mLauncher).getAppWidgetInfo(launcherAppWidgetInfo.appWidgetId);
                }
                if (obj != null) {
                    deferredWidgetRefresh.run();
                    return;
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    LauncherAppWidgetInfo launcherAppWidgetInfo2 = (LauncherAppWidgetInfo) arrayList.get(i);
                    AppWidgetHostView appWidgetHostView = launcherAppWidgetInfo2.hostView;
                    if (appWidgetHostView instanceof PendingAppWidgetHostView) {
                        launcherAppWidgetInfo2.installProgress = 100;
                        ((PendingAppWidgetHostView) appWidgetHostView).applyState();
                    }
                }
            }
        }
    }

    public final void bindWorkspaceComponentsRemoved(final HashSet hashSet, final HashSet hashSet2, final UserHandleCompat userHandleCompat) {
        if (!waitUntilResume(new Runnable() {
            public final void run() {
                Launcher.this.bindWorkspaceComponentsRemoved(hashSet, hashSet2, userHandleCompat);
            }
        }, false)) {
            if (!hashSet.isEmpty()) {
                ItemInfoMatcher.C54662 r0 = new ItemInfoMatcher(hashSet, userHandleCompat) {
                    final /* synthetic */ HashSet val$packageNames;
                    final /* synthetic */ UserHandleCompat val$user;

                    {
                        this.val$packageNames = r1;
                        this.val$user = r2;
                    }

                    public final boolean matches(ItemInfo itemInfo, ComponentName componentName) {
                        return this.val$packageNames.contains(componentName.getPackageName()) && itemInfo.user.equals(this.val$user);
                    }
                };
                this.mWorkspace.removeItemsByMatcher(r0);
                this.mDragController.onAppsRemoved(r0);
            }
            if (!hashSet2.isEmpty()) {
                ItemInfoMatcher.C54651 r3 = new ItemInfoMatcher(hashSet2, userHandleCompat) {
                    final /* synthetic */ HashSet val$components;
                    final /* synthetic */ UserHandleCompat val$user;

                    {
                        this.val$components = r1;
                        this.val$user = r2;
                    }

                    public final boolean matches(ItemInfo itemInfo, ComponentName componentName) {
                        return this.val$components.contains(componentName) && itemInfo.user.equals(this.val$user);
                    }
                };
                this.mWorkspace.removeItemsByMatcher(r3);
                this.mDragController.onAppsRemoved(r3);
            }
        }
    }

    public final void changeWallpaperVisiblity(boolean z) {
        int i = 0;
        int i2 = true != z ? 0 : 1048576;
        if (i2 != (getWindow().getAttributes().flags & 1048576)) {
            getWindow().setFlags(i2, 1048576);
        }
        if (true != z) {
            i = 2;
        }
        setWorkspaceBackground(i);
    }

    public final void closeFolder(Folder folder, boolean z) {
        Folder folder2 = folder;
        folder2.mInfo.opened = false;
        if (((ViewGroup) folder.getParent().getParent()) != null) {
            final FolderIcon folderIcon = (FolderIcon) this.mWorkspace.getFirstMatch(new Workspace.ItemOperator(folder2.mInfo) {
                final /* synthetic */ Object val$tag;

                {
                    this.val$tag = r1;
                }

                public final boolean evaluate(ItemInfo itemInfo, View view, View view2) {
                    return itemInfo == this.val$tag;
                }
            });
            if (folderIcon != null) {
                PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("alpha", new float[]{1.0f});
                PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("scaleX", new float[]{1.0f});
                PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat("scaleY", new float[]{1.0f});
                final CellLayout cellLayout = (CellLayout) folderIcon.getParent().getParent();
                this.mDragLayer.removeView(this.mFolderIconImageView);
                copyFolderIconToImage(folderIcon);
                ObjectAnimator ofPropertyValuesHolder = LauncherAnimUtils.ofPropertyValuesHolder(this.mFolderIconImageView, ofFloat, ofFloat2, ofFloat3);
                ofPropertyValuesHolder.setDuration((long) getResources().getInteger(R.integer.config_folderExpandDuration));
                ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        CellLayout cellLayout = cellLayout;
                        if (cellLayout != null) {
                            int[] iArr = cellLayout.mFolderLeaveBehindCell;
                            iArr[0] = -1;
                            iArr[1] = -1;
                            cellLayout.invalidate();
                            Launcher launcher = Launcher.this;
                            launcher.mDragLayer.removeView(launcher.mFolderIconImageView);
                            folderIcon.setVisibility(0);
                        }
                    }
                });
                ofPropertyValuesHolder.start();
                if (!z) {
                    ofPropertyValuesHolder.end();
                }
            }
            if (folderIcon != null) {
                ((CellLayout.LayoutParams) folderIcon.getLayoutParams()).canReorder = true;
            }
        }
        if (!z) {
            folder2.close(false);
        } else if (folder.getParent() instanceof DragLayer) {
            ObjectAnimator ofPropertyValuesHolder2 = LauncherAnimUtils.ofPropertyValuesHolder(folder2, PropertyValuesHolder.ofFloat("alpha", new float[]{0.0f}), PropertyValuesHolder.ofFloat("scaleX", new float[]{0.9f}), PropertyValuesHolder.ofFloat("scaleY", new float[]{0.9f}));
            ofPropertyValuesHolder2.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(
/*
Method generation error in method: com.android.launcher3.Folder.8.onAnimationEnd(android.animation.Animator):void, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.android.launcher3.Folder.8.onAnimationEnd(android.animation.Animator):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/

                public final void onAnimationStart(
/*
Method generation error in method: com.android.launcher3.Folder.8.onAnimationStart(android.animation.Animator):void, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.android.launcher3.Folder.8.onAnimationStart(android.animation.Animator):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
            ofPropertyValuesHolder2.setDuration((long) folder2.mExpandDuration);
            folder2.setLayerType(2, (Paint) null);
            ofPropertyValuesHolder2.start();
        }
        this.mDragLayer.sendAccessibilityEvent(32);
    }

    public final void closeShortcutsContainer(boolean z) {
        DeepShortcutsContainer openShortcutsContainer = getOpenShortcutsContainer();
        if (openShortcutsContainer == null) {
            return;
        }
        if (z) {
            openShortcutsContainer.animateClose();
        } else {
            openShortcutsContainer.close();
        }
    }

    public final void closeSystemDialogs() {
        getWindow().closeAllPanels();
        this.mWaitingForResult = false;
    }

    /* access modifiers changed from: package-private */
    public final void completeAddAppWidget(int i, long j, long j2, AppWidgetHostView appWidgetHostView, LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo) {
        int i2 = i;
        AppWidgetHostView appWidgetHostView2 = appWidgetHostView;
        PendingAddItemInfo pendingAddItemInfo = this.mPendingAddInfo;
        LauncherAppWidgetProviderInfo launcherAppWidgetInfo = launcherAppWidgetProviderInfo == null ? this.mAppWidgetManager.getLauncherAppWidgetInfo(i) : launcherAppWidgetProviderInfo;
        boolean z = launcherAppWidgetInfo.isCustomWidget;
        LauncherAppWidgetInfo launcherAppWidgetInfo2 = new LauncherAppWidgetInfo(i, launcherAppWidgetInfo.provider);
        launcherAppWidgetInfo2.spanX = pendingAddItemInfo.spanX;
        launcherAppWidgetInfo2.spanY = pendingAddItemInfo.spanY;
        launcherAppWidgetInfo2.minSpanX = pendingAddItemInfo.minSpanX;
        launcherAppWidgetInfo2.minSpanY = pendingAddItemInfo.minSpanY;
        launcherAppWidgetInfo2.user = this.mAppWidgetManager.getUser(launcherAppWidgetInfo);
        LauncherModel.addItemToDatabase(this, launcherAppWidgetInfo2, j, j2, pendingAddItemInfo.cellX, pendingAddItemInfo.cellY);
        if (!this.mRestoring) {
            if (appWidgetHostView2 == null) {
                launcherAppWidgetInfo2.hostView = this.mAppWidgetHost.createView(this, i, launcherAppWidgetInfo);
            } else {
                launcherAppWidgetInfo2.hostView = appWidgetHostView2;
            }
            launcherAppWidgetInfo2.hostView.setVisibility(0);
            addAppWidgetToWorkspace(launcherAppWidgetInfo2, launcherAppWidgetInfo, isWorkspaceLocked());
        }
        resetAddInfo();
    }

    /* access modifiers changed from: package-private */
    public final void completeTwoStageWidgetDrop(int i, final int i2) {
        AppWidgetHostView appWidgetHostView;
        int i3;
        C53127 r7;
        CellLayout screenWithId = this.mWorkspace.getScreenWithId(this.mPendingAddInfo.screenId);
        if (i == -1) {
            final AppWidgetHostView createView = this.mAppWidgetHost.createView(this, i2, this.mPendingAddWidgetInfo);
            appWidgetHostView = createView;
            r7 = new Runnable() {
                public final void run() {
                    Launcher launcher = Launcher.this;
                    int i = i2;
                    PendingAddItemInfo pendingAddItemInfo = launcher.mPendingAddInfo;
                    launcher.completeAddAppWidget(i, pendingAddItemInfo.container, pendingAddItemInfo.screenId, createView, (LauncherAppWidgetProviderInfo) null);
                    Launcher.this.exitSpringLoadedDragModeDelayed$ar$ds(true, 300);
                }
            };
            i3 = 3;
        } else if (i == 0) {
            this.mAppWidgetHost.deleteAppWidgetId(i2);
            r7 = null;
            appWidgetHostView = null;
            i3 = 4;
        } else {
            r7 = null;
            appWidgetHostView = null;
            i3 = 0;
        }
        DragView dragView = this.mDragLayer.mDropView;
        if (dragView != null) {
            this.mWorkspace.animateWidgetDrop(this.mPendingAddInfo, screenWithId, dragView, r7, i3, appWidgetHostView, true);
        } else if (r7 != null) {
            r7.run();
        }
    }

    public final FastBitmapDrawable createIconDrawable(Bitmap bitmap) {
        FastBitmapDrawable fastBitmapDrawable = new FastBitmapDrawable(bitmap);
        fastBitmapDrawable.setFilterBitmap(true);
        resizeIconDrawable$ar$ds(fastBitmapDrawable);
        return fastBitmapDrawable;
    }

    public final View createShortcut(ViewGroup viewGroup, ShortcutInfo shortcutInfo) {
        BubbleTextView bubbleTextView = (BubbleTextView) this.mInflater.inflate(R.layout.app_icon, viewGroup, false);
        bubbleTextView.applyFromShortcutInfo(shortcutInfo, this.mIconCache, false);
        bubbleTextView.setCompoundDrawablePadding(this.mDeviceProfile.iconDrawablePaddingPx);
        bubbleTextView.setOnClickListener(this);
        bubbleTextView.setOnFocusChangeListener(this.mFocusHandler);
        return bubbleTextView;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 3) {
                if (keyCode == 25 && Utilities.isPropertyEnabled$ar$ds()) {
                    Log.d("Launcher", "BEGIN launcher3 dump state for launcher ".concat(toString()));
                    Log.d("Launcher", "mSavedState=".concat(String.valueOf(String.valueOf(this.mSavedState))));
                    boolean z = this.mWorkspaceLoading;
                    Log.d("Launcher", "mWorkspaceLoading=" + z);
                    boolean z2 = this.mRestoring;
                    Log.d("Launcher", "mRestoring=" + z2);
                    boolean z3 = this.mWaitingForResult;
                    Log.d("Launcher", "mWaitingForResult=" + z3);
                    Log.d("Launcher", "mSavedInstanceState=null");
                    int size = sFolders.size();
                    Log.d("Launcher", "sFolders.size=" + size);
                    LauncherModel launcherModel = this.mModel;
                    Log.d("Launcher.Model", "mCallbacks=".concat(String.valueOf(String.valueOf(launcherModel.mCallbacks))));
                    AppInfo.dumpApplicationInfoList$ar$ds("mAllAppsList.data", launcherModel.mBgAllAppsList.data);
                    AppInfo.dumpApplicationInfoList$ar$ds("mAllAppsList.added", launcherModel.mBgAllAppsList.added);
                    AppInfo.dumpApplicationInfoList$ar$ds("mAllAppsList.removed", launcherModel.mBgAllAppsList.removed);
                    AppInfo.dumpApplicationInfoList$ar$ds("mAllAppsList.modified", launcherModel.mBgAllAppsList.modified);
                    LauncherModel.LoaderTask loaderTask = launcherModel.mLoaderTask;
                    if (loaderTask != null) {
                        synchronized (LauncherModel.sBgLock) {
                            String valueOf = String.valueOf(loaderTask.mContext);
                            Log.d("Launcher.Model", "mLoaderTask.mContext=" + valueOf);
                            boolean z4 = loaderTask.mStopped;
                            Log.d("Launcher.Model", "mLoaderTask.mStopped=" + z4);
                            boolean z5 = loaderTask.mLoadAndBindStepFinished;
                            Log.d("Launcher.Model", "mLoaderTask.mLoadAndBindStepFinished=" + z5);
                            int size2 = LauncherModel.sBgWorkspaceItems.size();
                            Log.d("Launcher.Model", "mItems size=" + size2);
                        }
                    } else {
                        Log.d("Launcher.Model", "mLoaderTask=null");
                    }
                    Log.d("Launcher", "END launcher3 dump state");
                }
            }
            return true;
        } else if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 3) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        boolean dispatchPopulateAccessibilityEvent = super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        List text = accessibilityEvent.getText();
        text.clear();
        int i = this.mState$ar$edu$fb933cd0_0;
        if (i == 3) {
            text.add(getString(R.string.all_apps_button_label));
        } else if (i == 5) {
            text.add(getString(R.string.widget_button_text));
        } else {
            Workspace workspace = this.mWorkspace;
            if (workspace != null) {
                text.add(workspace.getCurrentPageDescription());
            } else {
                text.add(getString(R.string.all_apps_home_button_label));
            }
        }
        return dispatchPopulateAccessibilityEvent;
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        synchronized (sDumpLogs) {
            printWriter.println(" ");
            printWriter.println("Debug logs: ");
            int i = 0;
            while (true) {
                ArrayList arrayList = sDumpLogs;
                if (i < arrayList.size()) {
                    printWriter.println("  " + ((String) arrayList.get(i)));
                    i++;
                }
            }
        }
    }

    public final void enterSpringLoadedDragMode() {
        int i = this.mState$ar$edu$fb933cd0_0;
        if (i != 2) {
            int i2 = 4;
            if (i != 4 && i != 6) {
                LauncherStateTransitionAnimation launcherStateTransitionAnimation = this.mStateTransitionAnimation;
                Workspace.State state = this.mWorkspace.mState;
                launcherStateTransitionAnimation.startAnimationToWorkspace$ar$edu$ar$ds(i, Workspace.State.SPRING_LOADED, -1, true, (Runnable) null);
                if (true != isAppsViewVisible()) {
                    i2 = 6;
                }
                this.mState$ar$edu$fb933cd0_0 = i2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void exitSpringLoadedDragMode() {
        int i = this.mState$ar$edu$fb933cd0_0;
        if (i == 4) {
            showAppsView$ar$ds(true, false, false);
        } else if (i == 6) {
            showWidgetsView(true, false);
        }
    }

    public final void exitSpringLoadedDragModeDelayed$ar$ds(final boolean z, int i) {
        int i2 = this.mState$ar$edu$fb933cd0_0;
        if (i2 == 4 || i2 == 6) {
            this.mHandler.postDelayed(new Runnable() {
                public final void run() {
                    if (z) {
                        Launcher.this.mWidgetsView.setVisibility(8);
                        Launcher.this.showWorkspace$ar$ds((Runnable) null);
                        return;
                    }
                    Launcher.this.exitSpringLoadedDragMode();
                }
            }, (long) i);
        }
    }

    public final View findViewById(int i) {
        return this.mLauncherView.findViewById(i);
    }

    public final void finishBindingItems() {
        if (!waitUntilResume(new Runnable() {
            public final void run() {
                Launcher.this.finishBindingItems();
            }
        }, false)) {
            if (this.mSavedState != null) {
                if (!this.mWorkspace.hasFocus()) {
                    Workspace workspace = this.mWorkspace;
                    workspace.getChildAt(workspace.mCurrentPage).requestFocus();
                }
                this.mSavedState = null;
            }
            Workspace workspace2 = this.mWorkspace;
            int childCount = workspace2.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (!workspace2.mRestoredPages.contains(Integer.valueOf(i))) {
                    workspace2.restoreInstanceStateForChild(i);
                }
            }
            workspace2.mRestoredPages.clear();
            workspace2.mSavedStates = null;
            this.mWorkspaceLoading = false;
            if (!this.mSharedPrefs.getBoolean("launcher.first_load_complete", false)) {
                sendBroadcast(new Intent("com.android.launcher3.action.FIRST_LOAD_COMPLETE"), getResources().getString(R.string.receive_first_load_broadcast_permission));
                SharedPreferences.Editor edit = this.mSharedPrefs.edit();
                edit.putBoolean("launcher.first_load_complete", true);
                edit.apply();
            }
            PendingAddArguments pendingAddArguments = sPendingAddItem;
            if (pendingAddArguments != null) {
                final long completeAdd = completeAdd(pendingAddArguments);
                this.mWorkspace.post(new Runnable() {
                    public final void run() {
                        Workspace workspace = Launcher.this.mWorkspace;
                        workspace.snapToPage(workspace.getPageIndexForScreenId(completeAdd), 950, false, (TimeInterpolator) null);
                    }
                });
                sPendingAddItem = null;
            }
            InstallShortcutReceiver.disableAndFlushInstallQueue(this);
        }
    }

    public final CellLayout getCellLayout(long j, long j2) {
        if (j != -101) {
            return this.mWorkspace.getScreenWithId(j2);
        }
        Hotseat hotseat = this.mHotseat;
        if (hotseat != null) {
            return hotseat.mContent;
        }
        return null;
    }

    public final int getCurrentWorkspaceScreen() {
        Workspace workspace = this.mWorkspace;
        if (workspace != null) {
            return workspace.mCurrentPage;
        }
        return 2;
    }

    public final View.OnTouchListener getHapticFeedbackTouchListener() {
        if (this.mHapticFeedbackTouchListener == null) {
            this.mHapticFeedbackTouchListener = new View.OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if ((motionEvent.getAction() & PrivateKeyType.INVALID) != 0) {
                        return false;
                    }
                    view.performHapticFeedback(1);
                    return false;
                }
            };
        }
        return this.mHapticFeedbackTouchListener;
    }

    public final DeepShortcutsContainer getOpenShortcutsContainer() {
        int childCount = this.mDragLayer.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            View childAt = this.mDragLayer.getChildAt(childCount);
            if (childAt instanceof DeepShortcutsContainer) {
                DeepShortcutsContainer deepShortcutsContainer = (DeepShortcutsContainer) childAt;
                if (deepShortcutsContainer.mIsOpen) {
                    return deepShortcutsContainer;
                }
            }
        }
    }

    public final View getOrCreateQsbBar() {
        AppWidgetProviderInfo appWidgetProviderInfo;
        int i;
        int i2;
        if (this.mQsb == null) {
            C74629d dVar = this.mLauncherCallbacks$ar$class_merging;
            if (dVar != null) {
                Iterator<AppWidgetProviderInfo> it = AppWidgetManager.getInstance(dVar.f208805b.getApplicationContext()).getInstalledProviders().iterator();
                appWidgetProviderInfo = null;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AppWidgetProviderInfo next = it.next();
                    if (next.provider.getPackageName().equals("com.google.android.googlequicksearchbox")) {
                        if (appWidgetProviderInfo == null) {
                            appWidgetProviderInfo = next;
                        }
                        if ((next.widgetCategory & 4) != 0) {
                            appWidgetProviderInfo = next;
                            break;
                        }
                    }
                }
            } else {
                appWidgetProviderInfo = null;
            }
            if (appWidgetProviderInfo == null) {
                appWidgetProviderInfo = Utilities.getSearchWidgetProvider(this);
            }
            if (appWidgetProviderInfo == null) {
                return null;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("appWidgetCategory", 4);
            InvariantDeviceProfile invariantDeviceProfile = LauncherAppState.getInstance().mInvariantDeviceProfile;
            DeviceProfile deviceProfile = invariantDeviceProfile.portraitProfile;
            DeviceProfile deviceProfile2 = invariantDeviceProfile.landscapeProfile;
            float f = getResources().getDisplayMetrics().density;
            Point searchBarDimensForWidgetOpts = deviceProfile.getSearchBarDimensForWidgetOpts(getResources());
            int i3 = (int) (((float) searchBarDimensForWidgetOpts.y) / f);
            int i4 = (int) (((float) searchBarDimensForWidgetOpts.x) / f);
            if (!deviceProfile2.isVerticalBarLayout()) {
                Point searchBarDimensForWidgetOpts2 = deviceProfile2.getSearchBarDimensForWidgetOpts(getResources());
                float f2 = (float) i3;
                float f3 = (float) i4;
                i2 = (int) Math.min(f3, ((float) searchBarDimensForWidgetOpts2.x) / f);
                i = (int) Math.min(f2, ((float) searchBarDimensForWidgetOpts2.y) / f);
                i3 = (int) Math.max(f2, ((float) searchBarDimensForWidgetOpts2.y) / f);
                i4 = (int) Math.max(f3, ((float) searchBarDimensForWidgetOpts2.x) / f);
            } else {
                i2 = i4;
                i = i3;
            }
            bundle.putInt("appWidgetMaxHeight", i3);
            bundle.putInt("appWidgetMinHeight", i);
            bundle.putInt("appWidgetMaxWidth", i4);
            bundle.putInt("appWidgetMinWidth", i2);
            C74629d dVar2 = this.mLauncherCallbacks$ar$class_merging;
            if (dVar2 != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("attached-launcher-identifier", "com.google.android.googlequicksearchbox");
                bundle2.putBoolean("vertical-layout", dVar2.f208805b.mDeviceProfile.isVerticalBarLayout());
                bundle.putAll(bundle2);
            }
            int i5 = this.mSharedPrefs.getInt("qsb_widget_id", -1);
            AppWidgetProviderInfo appWidgetInfo = this.mAppWidgetManager.getAppWidgetInfo(i5);
            if (!appWidgetProviderInfo.provider.flattenToString().equals(this.mSharedPrefs.getString("qsb_widget_provider", (String) null)) || appWidgetInfo == null || !appWidgetInfo.provider.equals(appWidgetProviderInfo.provider)) {
                if (i5 >= 0) {
                    this.mAppWidgetHost.deleteAppWidgetId(i5);
                }
                i5 = this.mAppWidgetHost.allocateAppWidgetId();
                if (!AppWidgetManagerCompat.getInstance(this).bindAppWidgetIdIfAllowed(i5, appWidgetProviderInfo, bundle)) {
                    this.mAppWidgetHost.deleteAppWidgetId(i5);
                    i5 = -1;
                }
                this.mSharedPrefs.edit().putInt("qsb_widget_id", i5).putString("qsb_widget_provider", appWidgetProviderInfo.provider.flattenToString()).apply();
            }
            LauncherAppWidgetHost launcherAppWidgetHost = this.mAppWidgetHost;
            launcherAppWidgetHost.mQsbWidgetId = i5;
            if (i5 != -1) {
                AppWidgetHostView createView = launcherAppWidgetHost.createView(this, i5, appWidgetProviderInfo);
                this.mQsb = createView;
                createView.setId(R.id.qsb_widget);
                this.mQsb.updateAppWidgetOptions(bundle);
                this.mQsb.setPadding(0, 0, 0, 0);
                this.mSearchDropTargetBar.addView(this.mQsb);
                this.mSearchDropTargetBar.mQSB = this.mQsb;
            }
        }
        return this.mQsb;
    }

    public final int getSearchBarHeight() {
        return this.mLauncherCallbacks$ar$class_merging != null ? 1 : 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List getShortcutIdsForItem(com.android.launcher3.ItemInfo r8) {
        /*
            r7 = this;
            boolean r0 = com.android.launcher3.compat.DeepShortcutManagerCompat.supportsShortcuts(r8)
            if (r0 != 0) goto L_0x0009
            java.util.List r8 = java.util.Collections.EMPTY_LIST
            return r8
        L_0x0009:
            android.content.ComponentName r0 = r8.getTargetComponent()
            if (r0 != 0) goto L_0x0012
            java.util.List r8 = java.util.Collections.EMPTY_LIST
            return r8
        L_0x0012:
            com.android.launcher3.util.MultiHashMap r1 = r7.mDeepShortcutMap
            com.android.launcher3.util.ComponentKey r2 = new com.android.launcher3.util.ComponentKey
            com.android.launcher3.compat.UserHandleCompat r3 = r8.user
            r2.<init>(r0, r3)
            java.lang.Object r1 = r1.get(r2)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L_0x006e
            java.lang.String r0 = r0.getPackageName()
            com.android.launcher3.compat.UserHandleCompat r2 = r8.user
            com.android.launcher3.util.MultiHashMap r3 = r7.mDeepShortcutMap
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L_0x0034:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x005c
            java.lang.Object r5 = r3.next()
            com.android.launcher3.util.ComponentKey r5 = (com.android.launcher3.util.ComponentKey) r5
            android.content.ComponentName r6 = r5.componentName
            java.lang.String r6 = r6.getPackageName()
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0034
            com.android.launcher3.compat.UserHandleCompat r6 = r5.user
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x0034
            if (r4 != 0) goto L_0x0059
            android.content.ComponentName r4 = r5.componentName
            goto L_0x0034
        L_0x0059:
            java.util.List r8 = java.util.Collections.EMPTY_LIST
            return r8
        L_0x005c:
            if (r4 == 0) goto L_0x006e
            com.android.launcher3.util.MultiHashMap r0 = r7.mDeepShortcutMap
            com.android.launcher3.util.ComponentKey r1 = new com.android.launcher3.util.ComponentKey
            com.android.launcher3.compat.UserHandleCompat r8 = r8.user
            r1.<init>(r4, r8)
            java.lang.Object r8 = r0.get(r1)
            r1 = r8
            java.util.List r1 = (java.util.List) r1
        L_0x006e:
            if (r1 != 0) goto L_0x0073
            java.util.List r8 = java.util.Collections.EMPTY_LIST
            return r8
        L_0x0073:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.Launcher.getShortcutIdsForItem(com.android.launcher3.ItemInfo):java.util.List");
    }

    public final View getTopFloatingView() {
        DeepShortcutsContainer openShortcutsContainer = getOpenShortcutsContainer();
        return openShortcutsContainer == null ? this.mWorkspace.getOpenFolder() : openShortcutsContainer;
    }

    public final boolean isAllAppsButtonRank(int i) {
        Hotseat hotseat = this.mHotseat;
        if (hotseat != null) {
            return hotseat.isAllAppsButtonRank(i);
        }
        return false;
    }

    public final boolean isAppsViewVisible() {
        return this.mState$ar$edu$fb933cd0_0 == 3 || this.mOnResumeState$ar$edu == 3;
    }

    public final boolean isDraggingEnabled() {
        return !this.mWorkspaceLoading;
    }

    /* access modifiers changed from: package-private */
    public final boolean isHotseatLayout(View view) {
        Hotseat hotseat = this.mHotseat;
        return hotseat != null && view != null && (view instanceof CellLayout) && view == hotseat.mContent;
    }

    public final boolean isWidgetsViewVisible() {
        return this.mState$ar$edu$fb933cd0_0 == 5 || this.mOnResumeState$ar$edu == 5;
    }

    public final boolean isWorkspaceLocked() {
        return this.mWorkspaceLoading || this.mWaitingForResult;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r2 != 3) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void lockScreenOrientation() {
        /*
            r6 = this;
            boolean r0 = r6.mRotationEnabled
            if (r0 == 0) goto L_0x0049
            boolean r0 = com.android.launcher3.Utilities.ATLEAST_JB_MR2
            if (r0 == 0) goto L_0x000e
            r0 = 14
            r6.setRequestedOrientation(r0)
            return
        L_0x000e:
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            android.view.WindowManager r1 = r6.getWindowManager()
            android.view.Display r1 = r1.getDefaultDisplay()
            int r2 = r1.getRotation()
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L_0x0034
            if (r2 == r3) goto L_0x0031
            if (r2 == r4) goto L_0x0034
            r5 = 3
            if (r2 == r5) goto L_0x0031
        L_0x002f:
            r0 = 2
            goto L_0x0034
        L_0x0031:
            if (r0 != r4) goto L_0x002f
            r0 = 1
        L_0x0034:
            r2 = 4
            int[] r5 = new int[r2]
            r5 = {1, 0, 9, 8} // fill-array
            if (r0 != r4) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r3 = 0
        L_0x003e:
            int r0 = r1.getRotation()
            int r0 = r0 + r3
            int r0 = r0 % r2
            r0 = r5[r0]
            r6.setRequestedOrientation(r0)
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.Launcher.lockScreenOrientation():void");
    }

    public final void notifyWidgetProvidersChanged() {
        Workspace workspace = this.mWorkspace;
        if (workspace != null && workspace.mState.shouldUpdateWidget) {
            LauncherModel.runOnWorkerThread(new Runnable(this.mWidgetsView.mAdapter.getItemCount() == 0, this) {
                final /* synthetic */ boolean val$bindFirst;
                final /* synthetic */ Callbacks val$callbacks;

                {
                    this.val$bindFirst = r2;
                    this.val$callbacks = r3;
                }

                public final void run() {
                    String str;
                    ComponentName componentName;
                    UserHandleCompat userHandleCompat;
                    if (this.val$bindFirst && !LauncherModel.this.mBgWidgetsModel.mRawList.isEmpty()) {
                        LauncherModel launcherModel = LauncherModel.this;
                        launcherModel.bindWidgetsModel(this.val$callbacks, new WidgetsModel(launcherModel.mBgWidgetsModel));
                    }
                    WidgetsModel widgetsModel = LauncherModel.this.mBgWidgetsModel;
                    Context context = LauncherAppState.sContext;
                    boolean z = Utilities.ATLEAST_O;
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (AppWidgetProviderInfo fromProviderInfo$ar$ds : AppWidgetManagerCompat.getInstance(context).getAllProviders()) {
                            arrayList.add(LauncherAppWidgetProviderInfo.fromProviderInfo$ar$ds(fromProviderInfo$ar$ds));
                        }
                        arrayList.addAll(LauncherAppsCompat.getInstance(context).getCustomShortcutActivityList());
                        widgetsModel.mRawList = arrayList;
                        HashMap hashMap = new HashMap();
                        widgetsModel.mWidgetsList.clear();
                        widgetsModel.mPackageItemInfos.clear();
                        widgetsModel.mWidgetAndShortcutNameComparator.mLabelCache.clear();
                        InvariantDeviceProfile invariantDeviceProfile = LauncherAppState.getInstance().mInvariantDeviceProfile;
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            Object obj = arrayList.get(i);
                            if (obj instanceof LauncherAppWidgetProviderInfo) {
                                LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo = (LauncherAppWidgetProviderInfo) obj;
                                int min = Math.min(launcherAppWidgetProviderInfo.spanX, launcherAppWidgetProviderInfo.minSpanX);
                                int min2 = Math.min(launcherAppWidgetProviderInfo.spanY, launcherAppWidgetProviderInfo.minSpanY);
                                if (min <= invariantDeviceProfile.numColumns && min2 <= invariantDeviceProfile.numRows) {
                                    componentName = launcherAppWidgetProviderInfo.provider;
                                    str = launcherAppWidgetProviderInfo.provider.getPackageName();
                                    userHandleCompat = widgetsModel.mAppWidgetMgr.getUser(launcherAppWidgetProviderInfo);
                                }
                            } else if (obj instanceof ShortcutConfigActivityInfo) {
                                ShortcutConfigActivityInfo shortcutConfigActivityInfo = (ShortcutConfigActivityInfo) obj;
                                componentName = shortcutConfigActivityInfo.getComponent();
                                str = componentName.getPackageName();
                                userHandleCompat = shortcutConfigActivityInfo.getUser();
                            } else {
                                componentName = null;
                                str = BuildConfig.FLAVOR;
                                userHandleCompat = null;
                            }
                            if (componentName != null) {
                                if (userHandleCompat != null) {
                                    AppFilter appFilter = widgetsModel.mAppFilter;
                                    if (appFilter == null || appFilter.shouldShowApp$ar$ds()) {
                                        ArrayList arrayList2 = (ArrayList) widgetsModel.mWidgetsList.get((PackageItemInfo) hashMap.get(str));
                                        if (arrayList2 != null) {
                                            arrayList2.add(obj);
                                        } else {
                                            ArrayList arrayList3 = new ArrayList();
                                            arrayList3.add(obj);
                                            PackageItemInfo packageItemInfo = new PackageItemInfo(str);
                                            widgetsModel.mIconCache.getTitleAndIconForApp(str, userHandleCompat, true, packageItemInfo);
                                            packageItemInfo.titleSectionName = widgetsModel.mIndexer.computeSectionName(packageItemInfo.title);
                                            widgetsModel.mWidgetsList.put(packageItemInfo, arrayList3);
                                            hashMap.put(str, packageItemInfo);
                                            widgetsModel.mPackageItemInfos.add(packageItemInfo);
                                        }
                                    }
                                }
                            }
                            Log.e("WidgetsModel", String.format("Widget cannot be set for %s.", new Object[]{obj.getClass().toString()}));
                        }
                        Collections.sort(widgetsModel.mPackageItemInfos, widgetsModel.mAppNameComparator);
                        ArrayList arrayList4 = widgetsModel.mPackageItemInfos;
                        int size2 = arrayList4.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            Collections.sort((List) widgetsModel.mWidgetsList.get((PackageItemInfo) arrayList4.get(i2)), widgetsModel.mWidgetAndShortcutNameComparator);
                        }
                    } catch (Exception e) {
                        if (!(e.getCause() instanceof TransactionTooLargeException) && !(e.getCause() instanceof DeadObjectException)) {
                            throw e;
                        }
                    }
                    WidgetsModel widgetsModel2 = new WidgetsModel(widgetsModel);
                    LauncherModel.this.bindWidgetsModel(this.val$callbacks, widgetsModel2);
                    LauncherAppState.getInstance().mWidgetCache.removeObsoletePreviews(widgetsModel2.mRawList);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        handleActivityResult(i, i2, intent);
    }

    public final void onAppWidgetHostReset() {
        LauncherAppWidgetHost launcherAppWidgetHost = this.mAppWidgetHost;
        if (launcherAppWidgetHost != null) {
            launcherAppWidgetHost.startListening();
        }
        bindSearchProviderChanged();
    }

    public final void onAttachedToWindow() {
        C22791m mVar;
        super.onAttachedToWindow();
        View decorView = getWindow().getDecorView();
        if (FirstFrameAnimatorHelper.sGlobalDrawListener != null) {
            decorView.getViewTreeObserver().removeOnDrawListener(FirstFrameAnimatorHelper.sGlobalDrawListener);
        }
        FirstFrameAnimatorHelper.sGlobalDrawListener = new ViewTreeObserver.OnDrawListener() {
            public final void onDraw(
/*
Method generation error in method: com.android.launcher3.FirstFrameAnimatorHelper.1.onDraw():void, dex: classes.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.android.launcher3.FirstFrameAnimatorHelper.1.onDraw():void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:440)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/
        };
        decorView.getViewTreeObserver().addOnDrawListener(FirstFrameAnimatorHelper.sGlobalDrawListener);
        FirstFrameAnimatorHelper.sVisible = true;
        this.mVisible = true;
        C74629d dVar = this.mLauncherCallbacks$ar$class_merging;
        if (dVar != null && (mVar = dVar.f208814k) != null) {
            mVar.mo28135d();
        }
    }

    public final void onBackPressed() {
        DragController dragController = this.mDragController;
        if (dragController.mDragging) {
            dragController.cancelDrag();
        } else if (getOpenShortcutsContainer() != null) {
            closeShortcutsContainer(true);
        } else if (isAppsViewVisible()) {
            showWorkspace(-1, true, (Runnable) null);
        } else if (isWidgetsViewVisible()) {
            showOverviewMode$ar$ds$49c8ce8_0(false);
        } else if (this.mWorkspace.isInOverviewMode()) {
            showWorkspace(-1, true, (Runnable) null);
        } else if (this.mWorkspace.getOpenFolder() != null) {
            Folder openFolder = this.mWorkspace.getOpenFolder();
            if (openFolder.mIsEditingName) {
                openFolder.dismissEditingName();
            } else {
                closeFolder(true);
            }
        } else {
            this.mWorkspace.exitWidgetResizeMode();
            Workspace workspace = this.mWorkspace;
            if (!workspace.mIsPageMoving && !workspace.isTouchActive()) {
                workspace.snapToPage(workspace.mCurrentPage, 750, false, (TimeInterpolator) null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010e, code lost:
        if (r5 == false) goto L_0x0110;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(final android.view.View r12) {
        /*
            r11 = this;
            android.os.IBinder r0 = r12.getWindowToken()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.android.launcher3.Workspace r0 = r11.mWorkspace
            boolean r0 = r0.isFinishedSwitchingState()
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            boolean r0 = r12 instanceof com.android.launcher3.Workspace
            r1 = 0
            r2 = -1
            r3 = 1
            if (r0 == 0) goto L_0x0023
            com.android.launcher3.Workspace r12 = r11.mWorkspace
            boolean r12 = r12.isInOverviewMode()
            if (r12 == 0) goto L_0x0022
            r11.showWorkspace(r2, r3, r1)
        L_0x0022:
            return
        L_0x0023:
            boolean r0 = r12 instanceof com.android.launcher3.CellLayout
            if (r0 == 0) goto L_0x0038
            com.android.launcher3.Workspace r0 = r11.mWorkspace
            boolean r0 = r0.isInOverviewMode()
            if (r0 == 0) goto L_0x0038
            com.android.launcher3.Workspace r0 = r11.mWorkspace
            int r0 = r0.indexOfChild(r12)
            r11.showWorkspace(r0, r3, r1)
        L_0x0038:
            java.lang.Object r0 = r12.getTag()
            boolean r1 = r0 instanceof com.android.launcher3.ShortcutInfo
            r4 = 0
            if (r1 == 0) goto L_0x00be
            java.lang.Object r0 = r12.getTag()
            boolean r1 = r0 instanceof com.android.launcher3.ShortcutInfo
            if (r1 == 0) goto L_0x00b6
            com.android.launcher3.ShortcutInfo r0 = (com.android.launcher3.ShortcutInfo) r0
            int r1 = r0.isDisabled
            if (r1 == 0) goto L_0x008f
            r2 = r1 & 4
            if (r2 != 0) goto L_0x008f
            r1 = r1 & 8
            if (r1 == 0) goto L_0x0058
            goto L_0x008f
        L_0x0058:
            java.lang.CharSequence r12 = r0.disabledMessage
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x006a
            java.lang.CharSequence r12 = r0.disabledMessage
            android.widget.Toast r12 = android.widget.Toast.makeText(r11, r12, r4)
            r12.show()
            return
        L_0x006a:
            int r12 = r0.isDisabled
            r0 = r12 & 1
            if (r0 == 0) goto L_0x0074
            r12 = 2132092030(0x7f15247e, float:1.9824445E38)
            goto L_0x0087
        L_0x0074:
            r0 = r12 & 16
            r1 = 2132092366(0x7f1525ce, float:1.9825126E38)
            if (r0 != 0) goto L_0x0084
            r12 = r12 & 32
            if (r12 == 0) goto L_0x0080
            goto L_0x0084
        L_0x0080:
            r12 = 2132082903(0x7f1500d7, float:1.9805933E38)
            goto L_0x0087
        L_0x0084:
            r12 = 2132092366(0x7f1525ce, float:1.9825126E38)
        L_0x0087:
            android.widget.Toast r12 = android.widget.Toast.makeText(r11, r12, r4)
            r12.show()
            return
        L_0x008f:
            boolean r1 = r12 instanceof com.android.launcher3.BubbleTextView
            if (r1 == 0) goto L_0x00b2
            r1 = 3
            boolean r1 = r0.hasStatusFlag(r1)
            if (r1 == 0) goto L_0x00b2
            r1 = 4
            boolean r1 = r0.hasStatusFlag(r1)
            if (r1 != 0) goto L_0x00b2
            android.content.ComponentName r0 = r0.getTargetComponent()
            java.lang.String r0 = r0.getPackageName()
            com.android.launcher3.Launcher$20 r1 = new com.android.launcher3.Launcher$20
            r1.<init>(r12)
            r11.showBrokenAppInstallDialog(r0, r1)
            return
        L_0x00b2:
            r11.startAppShortcutOrInfoActivity(r12)
            return
        L_0x00b6:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Input must be a Shortcut"
            r12.<init>(r0)
            throw r12
        L_0x00be:
            boolean r1 = r0 instanceof com.android.launcher3.FolderInfo
            if (r1 == 0) goto L_0x0147
            boolean r0 = r12 instanceof com.android.launcher3.FolderIcon
            if (r0 == 0) goto L_0x01c4
            com.android.launcher3.FolderIcon r12 = (com.android.launcher3.FolderIcon) r12
            com.android.launcher3.FolderInfo r0 = r12.mInfo
            com.android.launcher3.Workspace r1 = r11.mWorkspace
            com.android.launcher3.Workspace$14 r5 = new com.android.launcher3.Workspace$14
            r5.<init>(r0)
            android.view.View r1 = r1.getFirstMatch(r5)
            com.android.launcher3.Folder r1 = (com.android.launcher3.Folder) r1
            boolean r5 = r0.opened
            if (r5 == 0) goto L_0x010e
            if (r1 != 0) goto L_0x010e
            long r5 = r0.screenId
            int r7 = r0.cellX
            int r8 = r0.cellY
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Folder info marked as open, but associated folder is not open. Screen: "
            r9.<init>(r10)
            r9.append(r5)
            java.lang.String r5 = " ("
            r9.append(r5)
            r9.append(r7)
            java.lang.String r5 = ", "
            r9.append(r5)
            r9.append(r8)
            java.lang.String r5 = ")"
            r9.append(r5)
            java.lang.String r5 = "Launcher"
            java.lang.String r6 = r9.toString()
            android.util.Log.d(r5, r6)
            r0.opened = r4
            goto L_0x0110
        L_0x010e:
            if (r5 != 0) goto L_0x011e
        L_0x0110:
            com.android.launcher3.Folder r0 = r12.mFolder
            boolean r0 = r0.mDestroyed
            if (r0 == 0) goto L_0x0117
            goto L_0x011e
        L_0x0117:
            r11.closeFolder(r3)
            r11.openFolder(r12)
            return
        L_0x011e:
            if (r1 == 0) goto L_0x01c4
            com.android.launcher3.Workspace r0 = r11.mWorkspace
            android.view.ViewParent r5 = r1.getParent()
            int r6 = r0.getChildCount()
        L_0x012a:
            if (r4 >= r6) goto L_0x0137
            android.view.View r7 = r0.getPageAt(r4)
            if (r5 != r7) goto L_0x0134
            r2 = r4
            goto L_0x0137
        L_0x0134:
            int r4 = r4 + 1
            goto L_0x012a
        L_0x0137:
            r11.closeFolder(r1, r3)
            com.android.launcher3.Workspace r0 = r11.mWorkspace
            int r0 = r0.mCurrentPage
            if (r2 == r0) goto L_0x01c4
            r11.closeFolder(r3)
            r11.openFolder(r12)
            return
        L_0x0147:
            android.view.View r1 = r11.mAllAppsButton
            if (r12 != r1) goto L_0x0155
            boolean r12 = r11.isAppsViewVisible()
            if (r12 != 0) goto L_0x01c4
            r11.showAppsView$ar$ds(r3, r3, r4)
            return
        L_0x0155:
            boolean r1 = r0 instanceof com.android.launcher3.AppInfo
            if (r1 == 0) goto L_0x015d
            r11.startAppShortcutOrInfoActivity(r12)
            return
        L_0x015d:
            boolean r0 = r0 instanceof com.android.launcher3.LauncherAppWidgetInfo
            if (r0 == 0) goto L_0x01c4
            boolean r0 = r12 instanceof com.android.launcher3.PendingAppWidgetHostView
            if (r0 == 0) goto L_0x01c4
            com.android.launcher3.PendingAppWidgetHostView r12 = (com.android.launcher3.PendingAppWidgetHostView) r12
            boolean r0 = r11.mIsSafeModeEnabled
            if (r0 == 0) goto L_0x0176
            r12 = 2132092031(0x7f15247f, float:1.9824447E38)
            android.widget.Toast r12 = android.widget.Toast.makeText(r11, r12, r4)
            r12.show()
            return
        L_0x0176:
            java.lang.Object r0 = r12.getTag()
            com.android.launcher3.LauncherAppWidgetInfo r0 = (com.android.launcher3.LauncherAppWidgetInfo) r0
            boolean r1 = r12.isReadyForClickSetup()
            if (r1 == 0) goto L_0x01a4
            int r12 = r0.appWidgetId
            com.android.launcher3.compat.AppWidgetManagerCompat r1 = r11.mAppWidgetManager
            com.android.launcher3.LauncherAppWidgetProviderInfo r3 = r1.getLauncherAppWidgetInfo(r12)
            if (r3 == 0) goto L_0x01c4
            r11.mPendingAddWidgetInfo = r3
            com.android.launcher3.PendingAddItemInfo r1 = r11.mPendingAddInfo
            r1.copyFrom(r0)
            r11.mPendingAddWidgetId = r12
            com.android.launcher3.compat.AppWidgetManagerCompat r2 = com.android.launcher3.compat.AppWidgetManagerCompat.getInstance(r11)
            int r4 = r0.appWidgetId
            com.android.launcher3.LauncherAppWidgetHost r6 = r11.mAppWidgetHost
            r7 = 12
            r5 = r11
            r2.startConfigActivity(r3, r4, r5, r6, r7)
            return
        L_0x01a4:
            int r1 = r0.installProgress
            if (r1 >= 0) goto L_0x01b7
            android.content.ComponentName r1 = r0.providerName
            java.lang.String r1 = r1.getPackageName()
            com.android.launcher3.Launcher$18 r2 = new com.android.launcher3.Launcher$18
            r2.<init>(r12, r1, r0)
            r11.showBrokenAppInstallDialog(r1, r2)
            return
        L_0x01b7:
            android.content.ComponentName r1 = r0.providerName
            java.lang.String r1 = r1.getPackageName()
            android.content.Intent r1 = com.android.launcher3.LauncherModel.getMarketIntent(r1)
            r11.startActivitySafely(r12, r1, r0)
        L_0x01c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.Launcher.onClick(android.view.View):void");
    }

    /* access modifiers changed from: protected */
    public final void onClickWallpaperPicker$ar$ds() {
        if (Utilities.ATLEAST_NOUGAT) {
            WallpaperManager wallpaperManager = (WallpaperManager) getSystemService(WallpaperManager.class);
            try {
                if (!((Boolean) wallpaperManager.getClass().getMethod("isSetWallpaperAllowed", new Class[0]).invoke(wallpaperManager, new Object[0])).booleanValue()) {
                    Toast.makeText(this, R.string.msg_disabled_by_admin, 0).show();
                    return;
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        Workspace workspace = this.mWorkspace;
        Intent putExtra = new Intent("android.intent.action.SET_WALLPAPER").setPackage(getPackageName()).putExtra("com.android.launcher3.WALLPAPER_OFFSET", this.mWorkspace.mWallpaperOffset.wallpaperOffsetForScroll(workspace.getScrollForPage(workspace.getPageNearestToCenterOfScreen())));
        onStartForResult(10);
        super.startActivityForResult(putExtra, 10);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0589, code lost:
        if (r5 <= 0) goto L_0x0576;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x04e4  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x04e6  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x047e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r17) {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            super.onCreate(r17)
            com.android.launcher3.LauncherAppState r10 = com.android.launcher3.LauncherAppState.getInstance()
            com.android.launcher3.InvariantDeviceProfile r0 = r10.mInvariantDeviceProfile
            com.android.launcher3.DeviceProfile r0 = r0.getDeviceProfile(r8)
            r8.mDeviceProfile = r0
            boolean r0 = com.android.launcher3.Utilities.ATLEAST_O
            r11 = 0
            r12 = 0
            if (r0 == 0) goto L_0x0087
            boolean r0 = r16.isInMultiWindowMode()
            if (r0 == 0) goto L_0x0087
            android.view.WindowManager r0 = r16.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r4 = new android.graphics.Point
            r4.<init>()
            r0.getSize(r4)
            com.android.launcher3.DeviceProfile r13 = r8.mDeviceProfile
            int r14 = r16.getSearchBarHeight()
            com.android.launcher3.DeviceProfile r15 = new com.android.launcher3.DeviceProfile
            com.android.launcher3.InvariantDeviceProfile r2 = r13.inv
            int r5 = r4.x
            int r6 = r4.y
            boolean r7 = r13.isLandscape
            r0 = r15
            r1 = r16
            r3 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r15.setSearchBarHeight(r14)
            android.content.res.Resources r0 = r16.getResources()
            android.util.DisplayMetrics r1 = r0.getDisplayMetrics()
            r15.updateAvailableDimensions(r1, r0)
            r15.iconTextSizePx = r12
            int r0 = r15.iconSizePx
            int r1 = r15.iconDrawablePaddingPx
            int r0 = r0 + r1
            int r1 = com.android.launcher3.Utilities.calculateTextHeight(r11)
            int r0 = r0 + r1
            r15.cellHeightPx = r0
            android.graphics.Point r0 = r15.getCellSize()
            int r0 = r0.x
            android.graphics.Point r1 = r13.getCellSize()
            int r1 = r1.x
            android.graphics.Point r2 = r15.getCellSize()
            int r2 = r2.y
            android.graphics.Point r3 = r13.getCellSize()
            int r3 = r3.y
            android.graphics.PointF r4 = r15.appWidgetScale
            float r0 = (float) r0
            float r1 = (float) r1
            float r0 = r0 / r1
            float r1 = (float) r2
            float r2 = (float) r3
            float r1 = r1 / r2
            r4.set(r0, r1)
            r8.mDeviceProfile = r15
        L_0x0087:
            android.content.SharedPreferences r0 = com.android.launcher3.Utilities.getPrefs(r16)
            r8.mSharedPrefs = r0
            android.content.pm.PackageManager r0 = r16.getPackageManager()
            boolean r0 = r0.isSafeMode()
            r8.mIsSafeModeEnabled = r0
            com.android.launcher3.LauncherModel r0 = r10.setLauncher(r8)
            r8.mModel = r0
            com.android.launcher3.IconCache r0 = r10.mIconCache
            r8.mIconCache = r0
            com.android.launcher3.DragController r0 = new com.android.launcher3.DragController
            r0.<init>(r8)
            r8.mDragController = r0
            android.view.LayoutInflater r0 = r16.getLayoutInflater()
            r8.mInflater = r0
            com.android.launcher3.LauncherStateTransitionAnimation r0 = new com.android.launcher3.LauncherStateTransitionAnimation
            r0.<init>(r8)
            r8.mStateTransitionAnimation = r0
            com.android.launcher3.Stats r0 = new com.android.launcher3.Stats
            r0.<init>(r8)
            r8.mStats = r0
            com.android.launcher3.compat.AppWidgetManagerCompat r0 = com.android.launcher3.compat.AppWidgetManagerCompat.getInstance(r16)
            r8.mAppWidgetManager = r0
            com.android.launcher3.LauncherAppWidgetHost r0 = new com.android.launcher3.LauncherAppWidgetHost
            r0.<init>(r8)
            r8.mAppWidgetHost = r0
            r0.startListening()
            r8.mPaused = r12
            android.view.LayoutInflater r0 = r16.getLayoutInflater()
            r1 = 2131625749(0x7f0e0715, float:1.8878715E38)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            r8.mLauncherView = r0
            com.android.launcher3.InvariantDeviceProfile r0 = r10.mInvariantDeviceProfile
            com.android.launcher3.DeviceProfile r0 = r0.landscapeProfile
            int r1 = r16.getSearchBarHeight()
            r0.setSearchBarHeight(r1)
            com.android.launcher3.InvariantDeviceProfile r0 = r10.mInvariantDeviceProfile
            com.android.launcher3.DeviceProfile r0 = r0.portraitProfile
            int r1 = r16.getSearchBarHeight()
            r0.setSearchBarHeight(r1)
            com.android.launcher3.DragController r0 = r8.mDragController
            android.view.View r1 = r8.mLauncherView
            r3 = 2131432700(0x7f0b14fc, float:1.8487165E38)
            android.view.View r1 = r1.findViewById(r3)
            r8.mLauncherView = r1
            r3 = 2131431095(0x7f0b0eb7, float:1.848391E38)
            android.view.View r1 = r1.findViewById(r3)
            com.android.launcher3.FocusIndicatorView r1 = (com.android.launcher3.FocusIndicatorView) r1
            r8.mFocusHandler = r1
            android.view.View r1 = r8.mLauncherView
            r3 = 2131430324(0x7f0b0bb4, float:1.8482346E38)
            android.view.View r1 = r1.findViewById(r3)
            com.android.launcher3.DragLayer r1 = (com.android.launcher3.DragLayer) r1
            r8.mDragLayer = r1
            r3 = 2131437228(0x7f0b26ac, float:1.8496349E38)
            android.view.View r1 = r1.findViewById(r3)
            com.android.launcher3.Workspace r1 = (com.android.launcher3.Workspace) r1
            r8.mWorkspace = r1
            r1.mPageSwitchListener = r8
            com.android.launcher3.PagedView$PageSwitchListener r4 = r1.mPageSwitchListener
            if (r4 == 0) goto L_0x012f
            int r4 = r1.mCurrentPage
            r1.getPageAt(r4)
            int r1 = r1.mCurrentPage
        L_0x012f:
            com.android.launcher3.DragLayer r1 = r8.mDragLayer
            r4 = 2131434249(0x7f0b1b09, float:1.8490307E38)
            android.view.View r1 = r1.findViewById(r4)
            r8.mPageIndicators = r1
            android.view.View r1 = r8.mLauncherView
            r5 = 1792(0x700, float:2.511E-42)
            r1.setSystemUiVisibility(r5)
            android.content.res.Resources r1 = r16.getResources()
            r5 = 2131235807(0x7f0813df, float:1.8087818E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r5)
            r8.mWorkspaceBackgroundDrawable = r1
            com.android.launcher3.DragLayer r1 = r8.mDragLayer
            r1.mLauncher = r8
            r1.mDragController = r0
            android.view.View r1 = r8.mLauncherView
            r5 = 2131432284(0x7f0b135c, float:1.8486321E38)
            android.view.View r1 = r1.findViewById(r5)
            com.android.launcher3.Hotseat r1 = (com.android.launcher3.Hotseat) r1
            r8.mHotseat = r1
            if (r1 == 0) goto L_0x0168
            com.android.launcher3.CellLayout r1 = r1.mContent
            r1.setOnLongClickListener(r8)
        L_0x0168:
            android.view.View r1 = r8.mLauncherView
            r6 = 2131434243(0x7f0b1b03, float:1.8490294E38)
            android.view.View r1 = r1.findViewById(r6)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r8.mOverviewPanel = r1
            com.android.launcher3.Launcher$8 r1 = new com.android.launcher3.Launcher$8
            r1.<init>()
            android.view.View r6 = r8.mLauncherView
            r7 = 2131437042(0x7f0b25f2, float:1.8495971E38)
            android.view.View r6 = r6.findViewById(r7)
            com.android.launcher3.Launcher$9 r7 = new com.android.launcher3.Launcher$9
            r7.<init>()
            r6.setOnClickListener(r7)
            r6.setOnLongClickListener(r1)
            android.view.View$OnTouchListener r7 = r16.getHapticFeedbackTouchListener()
            r6.setOnTouchListener(r7)
            android.view.View r6 = r8.mLauncherView
            r7 = 2131437203(0x7f0b2693, float:1.8496298E38)
            android.view.View r6 = r6.findViewById(r7)
            r8.mWidgetsButton = r6
            com.android.launcher3.Launcher$10 r7 = new com.android.launcher3.Launcher$10
            r7.<init>()
            r6.setOnClickListener(r7)
            android.view.View r6 = r8.mWidgetsButton
            r6.setOnLongClickListener(r1)
            android.view.View r6 = r8.mWidgetsButton
            android.view.View$OnTouchListener r7 = r16.getHapticFeedbackTouchListener()
            r6.setOnTouchListener(r7)
            android.view.View r6 = r8.mLauncherView
            r7 = 2131435782(0x7f0b2106, float:1.8493416E38)
            android.view.View r6 = r6.findViewById(r7)
            com.google.android.apps.gsa.launcher.a.d r7 = r8.mLauncherCallbacks$ar$class_merging
            r10 = 2131034114(0x7f050002, float:1.7678736E38)
            r13 = 8
            if (r7 == 0) goto L_0x01c9
            goto L_0x01dc
        L_0x01c9:
            boolean r7 = com.android.launcher3.Utilities.ATLEAST_O
            if (r7 != 0) goto L_0x01dc
            android.content.res.Resources r7 = r16.getResources()
            boolean r7 = r7.getBoolean(r10)
            if (r7 != 0) goto L_0x01d8
            goto L_0x01dc
        L_0x01d8:
            r6.setVisibility(r13)
            goto L_0x01ee
        L_0x01dc:
            com.android.launcher3.Launcher$11 r7 = new com.android.launcher3.Launcher$11
            r7.<init>()
            r6.setOnClickListener(r7)
            r6.setOnLongClickListener(r1)
            android.view.View$OnTouchListener r1 = r16.getHapticFeedbackTouchListener()
            r6.setOnTouchListener(r1)
        L_0x01ee:
            android.view.ViewGroup r1 = r8.mOverviewPanel
            r1.setAlpha(r11)
            com.android.launcher3.Workspace r1 = r8.mWorkspace
            r1.setHapticFeedbackEnabled(r12)
            com.android.launcher3.Workspace r1 = r8.mWorkspace
            r1.setOnLongClickListener(r8)
            com.android.launcher3.Workspace r1 = r8.mWorkspace
            com.android.launcher3.SpringLoadedDragController r6 = new com.android.launcher3.SpringLoadedDragController
            com.android.launcher3.Launcher r7 = r1.mLauncher
            r6.<init>(r7)
            r1.mSpringLoadedDragController = r6
            r1.mDragController = r0
            r1.updateChildrenLayersEnabled(r12)
            com.android.launcher3.Workspace r1 = r8.mWorkspace
            java.util.ArrayList r6 = r0.mListeners
            r6.add(r1)
            com.android.launcher3.DragLayer r1 = r8.mDragLayer
            r6 = 2131435567(0x7f0b202f, float:1.849298E38)
            android.view.View r1 = r1.findViewById(r6)
            com.android.launcher3.SearchDropTargetBar r1 = (com.android.launcher3.SearchDropTargetBar) r1
            r8.mSearchDropTargetBar = r1
            android.view.View r1 = r8.mLauncherView
            r6 = 2131427897(0x7f0b0239, float:1.8477423E38)
            android.view.View r1 = r1.findViewById(r6)
            com.android.launcher3.allapps.AllAppsContainerView r1 = (com.android.launcher3.allapps.AllAppsContainerView) r1
            r8.mAppsView = r1
            android.view.View r1 = r8.mLauncherView
            r6 = 2131437220(0x7f0b26a4, float:1.8496333E38)
            android.view.View r1 = r1.findViewById(r6)
            com.android.launcher3.widget.WidgetsContainerView r1 = (com.android.launcher3.widget.WidgetsContainerView) r1
            r8.mWidgetsView = r1
            com.google.android.apps.gsa.launcher.a.d r1 = r8.mLauncherCallbacks$ar$class_merging
            if (r1 == 0) goto L_0x0247
            com.android.launcher3.allapps.DefaultAppSearchController r1 = r1.f208816m
            com.android.launcher3.allapps.AllAppsContainerView r6 = r8.mAppsView
            r6.setSearchBarController(r1)
            goto L_0x0251
        L_0x0247:
            com.android.launcher3.allapps.AllAppsContainerView r1 = r8.mAppsView
            com.android.launcher3.allapps.DefaultAppSearchController r6 = new com.android.launcher3.allapps.DefaultAppSearchController
            r6.<init>()
            r1.setSearchBarController(r6)
        L_0x0251:
            com.android.launcher3.Workspace r1 = r8.mWorkspace
            r0.mDragScroller = r1
            com.android.launcher3.DragLayer r6 = r8.mDragLayer
            r0.mScrollView = r6
            r0.mMoveTarget = r1
            java.util.ArrayList r6 = r0.mDropTargets
            r6.add(r1)
            com.android.launcher3.SearchDropTargetBar r1 = r8.mSearchDropTargetBar
            if (r1 == 0) goto L_0x02ab
            java.util.ArrayList r6 = r0.mListeners
            r6.add(r1)
            com.android.launcher3.ButtonDropTarget r6 = r1.mDeleteDropTarget
            r0.mFlingToDeleteDropTarget = r6
            com.android.launcher3.ButtonDropTarget r6 = r1.mInfoDropTarget
            java.util.ArrayList r7 = r0.mListeners
            r7.add(r6)
            com.android.launcher3.ButtonDropTarget r6 = r1.mDeleteDropTarget
            java.util.ArrayList r7 = r0.mListeners
            r7.add(r6)
            com.android.launcher3.ButtonDropTarget r6 = r1.mUninstallDropTarget
            java.util.ArrayList r7 = r0.mListeners
            r7.add(r6)
            com.android.launcher3.ButtonDropTarget r6 = r1.mInfoDropTarget
            java.util.ArrayList r7 = r0.mDropTargets
            r7.add(r6)
            com.android.launcher3.ButtonDropTarget r6 = r1.mDeleteDropTarget
            java.util.ArrayList r7 = r0.mDropTargets
            r7.add(r6)
            com.android.launcher3.ButtonDropTarget r6 = r1.mUninstallDropTarget
            java.util.ArrayList r0 = r0.mDropTargets
            r0.add(r6)
            com.android.launcher3.ButtonDropTarget r0 = r1.mInfoDropTarget
            r0.mLauncher = r8
            com.android.launcher3.ButtonDropTarget r0 = r1.mDeleteDropTarget
            r0.mLauncher = r8
            com.android.launcher3.ButtonDropTarget r0 = r1.mUninstallDropTarget
            r0.mLauncher = r8
            com.android.launcher3.SearchDropTargetBar r0 = r8.mSearchDropTargetBar
            android.view.View r1 = r16.getOrCreateQsbBar()
            r0.mQSB = r1
        L_0x02ab:
            com.android.launcher3.DeviceProfile r0 = r8.mDeviceProfile
            boolean r1 = r0.isVerticalBarLayout()
            android.content.res.Resources r6 = r16.getResources()
            boolean r6 = com.android.launcher3.Utilities.isRtl(r6)
            android.graphics.Rect r7 = r0.getSearchBarBounds(r6)
            com.android.launcher3.SearchDropTargetBar r11 = r8.mSearchDropTargetBar
            android.view.ViewGroup$LayoutParams r14 = r11.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r14 = (android.widget.FrameLayout.LayoutParams) r14
            int r15 = r7.width()
            r14.width = r15
            int r7 = r7.height()
            r14.height = r7
            int r7 = r0.searchBarTopExtraPaddingPx
            r14.topMargin = r7
            r7 = 3
            r15 = -2
            r10 = 1
            if (r1 == 0) goto L_0x02f5
            r14.gravity = r7
            r7 = 2131430325(0x7f0b0bb5, float:1.8482348E38)
            android.view.View r7 = r11.findViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r7.setOrientation(r10)
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r7 = (android.widget.FrameLayout.LayoutParams) r7
            r2 = 48
            r7.gravity = r2
            r7.height = r15
            goto L_0x02f9
        L_0x02f5:
            r2 = 49
            r14.gravity = r2
        L_0x02f9:
            r11.setLayoutParams(r14)
            android.view.View r2 = r8.mLauncherView
            android.view.View r2 = r2.findViewById(r3)
            com.android.launcher3.PagedView r2 = (com.android.launcher3.PagedView) r2
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            r7 = 17
            r3.gravity = r7
            android.graphics.Rect r7 = r0.getWorkspacePadding(r6)
            r2.setLayoutParams(r3)
            boolean r3 = r0.isVerticalBarLayout()
            if (r3 != 0) goto L_0x032e
            boolean r3 = r0.isLargeTablet
            if (r3 == 0) goto L_0x0320
            goto L_0x032e
        L_0x0320:
            int r3 = r0.defaultPageSpacingPx
            android.graphics.Rect r11 = r0.getWorkspacePadding(r6)
            int r11 = r11.left
            int r11 = r11 + r11
            int r3 = java.lang.Math.max(r3, r11)
            goto L_0x0330
        L_0x032e:
            int r3 = r0.defaultPageSpacingPx
        L_0x0330:
            r2.mPageSpacing = r3
            r2.requestLayout()
            android.view.View r2 = r8.mLauncherView
            android.view.View r2 = r2.findViewById(r5)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r5 = r0.getCurrentWidth()
            float r5 = (float) r5
            com.android.launcher3.InvariantDeviceProfile r11 = r0.inv
            int r11 = r11.numColumns
            float r11 = (float) r11
            float r5 = r5 / r11
            int r11 = r0.getCurrentWidth()
            float r11 = (float) r11
            com.android.launcher3.InvariantDeviceProfile r14 = r0.inv
            int r14 = r14.numHotseatIcons
            float r14 = (float) r14
            float r11 = r11 / r14
            float r5 = r5 - r11
            r11 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r11
            int r5 = java.lang.Math.round(r5)
            r11 = 2131432712(0x7f0b1508, float:1.848719E38)
            r14 = 5
            r10 = -1
            if (r1 == 0) goto L_0x0379
            r3.gravity = r14
            int r5 = r0.normalHotseatBarHeightPx
            r3.width = r5
            r3.height = r10
            android.view.View r5 = r2.findViewById(r11)
            int r7 = r0.edgeMarginPx
            int r7 = r7 + r7
            r5.setPadding(r12, r7, r12, r7)
            goto L_0x03ad
        L_0x0379:
            boolean r14 = r0.isTablet
            r15 = 80
            if (r14 == 0) goto L_0x0398
            r3.gravity = r15
            r3.width = r10
            int r14 = r0.hotseatBarHeightPx
            r3.height = r14
            android.view.View r11 = r2.findViewById(r11)
            int r14 = r7.left
            int r7 = r7.right
            int r15 = r0.edgeMarginPx
            int r14 = r14 + r5
            int r5 = r5 + r7
            int r15 = r15 + r15
            r11.setPadding(r14, r12, r5, r15)
            goto L_0x03ad
        L_0x0398:
            r3.gravity = r15
            r3.width = r10
            int r14 = r0.hotseatBarHeightPx
            r3.height = r14
            android.view.View r11 = r2.findViewById(r11)
            int r14 = r7.left
            int r14 = r14 + r5
            int r7 = r7.right
            int r5 = r5 + r7
            r11.setPadding(r14, r12, r5, r12)
        L_0x03ad:
            r2.setLayoutParams(r3)
            android.view.View r2 = r8.mLauncherView
            android.view.View r2 = r2.findViewById(r4)
            r3 = 81
            if (r2 == 0) goto L_0x03d4
            if (r1 == 0) goto L_0x03c0
            r2.setVisibility(r13)
            goto L_0x03d4
        L_0x03c0:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r1.gravity = r3
            r4 = -2
            r1.width = r4
            r1.height = r4
            int r4 = r0.hotseatBarHeightPx
            r1.bottomMargin = r4
            r2.setLayoutParams(r1)
        L_0x03d4:
            android.view.ViewGroup r1 = r8.mOverviewPanel
            if (r1 == 0) goto L_0x0442
            int r2 = r0.getOverviewModeButtonBarHeight()
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            r4.gravity = r3
            r3 = 0
            r5 = 0
        L_0x03e6:
            int r7 = r1.getChildCount()
            if (r3 >= r7) goto L_0x03fb
            android.view.View r7 = r1.getChildAt(r3)
            int r7 = r7.getVisibility()
            if (r7 == r13) goto L_0x03f8
            int r5 = r5 + 1
        L_0x03f8:
            int r3 = r3 + 1
            goto L_0x03e6
        L_0x03fb:
            int r3 = r0.overviewModeBarItemWidthPx
            int r3 = r3 * r5
            int r7 = r5 + -1
            int r11 = r0.overviewModeBarSpacerWidthPx
            int r0 = r0.availableWidthPx
            int r11 = r11 * r7
            int r11 = r11 + r3
            int r0 = java.lang.Math.min(r0, r11)
            r4.width = r0
            r4.height = r2
            r1.setLayoutParams(r4)
            int r0 = r4.width
            if (r0 <= r3) goto L_0x0442
            r0 = 1
            if (r5 <= r0) goto L_0x0442
            int r0 = r4.width
            int r0 = r0 - r3
            int r0 = r0 / r7
            r2 = 0
            r3 = 0
        L_0x0420:
            if (r3 >= r5) goto L_0x0442
            if (r2 == 0) goto L_0x0434
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            if (r6 == 0) goto L_0x042f
            r4.leftMargin = r0
            goto L_0x0431
        L_0x042f:
            r4.rightMargin = r0
        L_0x0431:
            r2.setLayoutParams(r4)
        L_0x0434:
            android.view.View r2 = r1.getChildAt(r3)
            int r4 = r2.getVisibility()
            if (r4 != r13) goto L_0x043f
            r2 = 0
        L_0x043f:
            int r3 = r3 + 1
            goto L_0x0420
        L_0x0442:
            r8.mSavedState = r9
            r0 = 2
            if (r9 != 0) goto L_0x0449
            goto L_0x04f9
        L_0x0449:
            java.lang.String r1 = "launcher.state"
            r2 = 1
            int r1 = r9.getInt(r1, r2)
            r2 = 6
            int[] r3 = new int[r2]
            r3 = {1, 2, 3, 4, 5, 6} // fill-array
            r4 = 0
        L_0x0457:
            if (r4 >= r2) goto L_0x0468
            r5 = r3[r4]
            int r6 = r5 + -1
            if (r5 == 0) goto L_0x0466
            if (r6 != r1) goto L_0x0463
            r1 = 3
            goto L_0x046a
        L_0x0463:
            int r4 = r4 + 1
            goto L_0x0457
        L_0x0466:
            r4 = 0
            throw r4
        L_0x0468:
            r1 = 3
            r5 = 2
        L_0x046a:
            if (r5 == r1) goto L_0x0471
            r1 = 5
            if (r5 != r1) goto L_0x0474
            r14 = 5
            goto L_0x0472
        L_0x0471:
            r14 = r5
        L_0x0472:
            r8.mOnResumeState$ar$edu = r14
        L_0x0474:
            java.lang.String r1 = "launcher.current_screen"
            r2 = -1001(0xfffffffffffffc17, float:NaN)
            int r1 = r9.getInt(r1, r2)
            if (r1 == r2) goto L_0x0482
            com.android.launcher3.Workspace r2 = r8.mWorkspace
            r2.mRestorePage = r1
        L_0x0482:
            java.lang.String r1 = "launcher.add_container"
            r2 = -1
            long r4 = r9.getLong(r1, r2)
            java.lang.String r1 = "launcher.add_screen"
            long r6 = r9.getLong(r1, r2)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x04f9
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x04f9
            com.android.launcher3.PendingAddItemInfo r1 = r8.mPendingAddInfo
            r1.container = r4
            r1.screenId = r6
            java.lang.String r2 = "launcher.add_cell_x"
            int r2 = r9.getInt(r2)
            r1.cellX = r2
            com.android.launcher3.PendingAddItemInfo r1 = r8.mPendingAddInfo
            java.lang.String r2 = "launcher.add_cell_y"
            int r2 = r9.getInt(r2)
            r1.cellY = r2
            com.android.launcher3.PendingAddItemInfo r1 = r8.mPendingAddInfo
            java.lang.String r2 = "launcher.add_span_x"
            int r2 = r9.getInt(r2)
            r1.spanX = r2
            com.android.launcher3.PendingAddItemInfo r1 = r8.mPendingAddInfo
            java.lang.String r2 = "launcher.add_span_y"
            int r2 = r9.getInt(r2)
            r1.spanY = r2
            com.android.launcher3.PendingAddItemInfo r1 = r8.mPendingAddInfo
            java.lang.String r2 = "launcher.add_component"
            android.os.Parcelable r2 = r9.getParcelable(r2)
            android.content.ComponentName r2 = (android.content.ComponentName) r2
            r1.componentName = r2
            com.android.launcher3.PendingAddItemInfo r1 = r8.mPendingAddInfo
            java.lang.String r2 = "launcher.add_user"
            com.android.launcher3.compat.UserHandleCompat r2 = com.android.launcher3.compat.UserHandleCompat.fromBundle(r9, r2)
            r1.user = r2
            java.lang.String r1 = "launcher.add_widget_info"
            android.os.Parcelable r1 = r9.getParcelable(r1)
            android.appwidget.AppWidgetProviderInfo r1 = (android.appwidget.AppWidgetProviderInfo) r1
            if (r1 != 0) goto L_0x04e6
            r1 = 0
            goto L_0x04ea
        L_0x04e6:
            com.android.launcher3.LauncherAppWidgetProviderInfo r1 = com.android.launcher3.LauncherAppWidgetProviderInfo.fromProviderInfo$ar$ds(r1)
        L_0x04ea:
            r8.mPendingAddWidgetInfo = r1
            java.lang.String r1 = "launcher.add_widget_id"
            int r1 = r9.getInt(r1)
            r8.mPendingAddWidgetId = r1
            r1 = 1
            r8.mWaitingForResult = r1
            r8.mRestoring = r1
        L_0x04f9:
            boolean r1 = r8.mRestoring
            if (r1 != 0) goto L_0x0506
            com.android.launcher3.LauncherModel r1 = r8.mModel
            com.android.launcher3.Workspace r2 = r8.mWorkspace
            int r2 = r2.mRestorePage
            r1.startLoader(r2, r12)
        L_0x0506:
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>()
            r8.mDefaultKeySsb = r1
            android.text.Selection.setSelection(r1, r12)
            android.content.res.Resources r1 = r16.getResources()
            r2 = 2131034114(0x7f050002, float:1.7678736E38)
            boolean r1 = r1.getBoolean(r2)
            r8.mRotationEnabled = r1
            if (r1 != 0) goto L_0x0529
            android.content.Context r1 = r16.getApplicationContext()
            boolean r1 = com.android.launcher3.Utilities.isAllowRotationPrefEnabled(r1)
            r8.mRotationEnabled = r1
        L_0x0529:
            r16.setOrientation()
            android.view.View r1 = r8.mLauncherView
            r8.setContentView(r1)
            com.google.android.apps.gsa.launcher.a.d r1 = r8.mLauncherCallbacks$ar$class_merging
            if (r1 == 0) goto L_0x05e9
            if (r9 != 0) goto L_0x0539
            r2 = 0
            goto L_0x053f
        L_0x0539:
            java.lang.String r2 = "now_enabled"
            boolean r2 = r9.getBoolean(r2, r12)
        L_0x053f:
            r1.f208812i = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            long r2 = (long) r2
            com.google.android.apps.gsa.shared.util.v.g r4 = r1.f208804a
            com.google.android.apps.gsa.shared.m.f r5 = com.google.android.apps.gsa.shared.p7066m.C90138q.f251837k
            long r4 = r4.mo85399d(r5)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0551
            goto L_0x05b7
        L_0x0551:
            com.android.launcher3.Launcher r2 = r1.f208805b
            android.content.Context r2 = r2.getApplicationContext()
            r3 = 0
            boolean r2 = com.google.android.apps.gsa.shared.p7148ui.p7155g.C90685b.m148054b(r2, r3)
            if (r2 != 0) goto L_0x05b7
            com.google.android.apps.gsa.shared.util.v.g r2 = r1.f208804a
            com.google.android.apps.gsa.shared.m.f r3 = com.google.android.apps.gsa.shared.p7066m.C90138q.f251836j
            long r2 = r2.mo85399d(r3)
            com.android.launcher3.Launcher r4 = r1.f208805b
            android.content.Context r4 = r4.getApplicationContext()
            java.lang.String r5 = "activity"
            java.lang.Object r4 = r4.getSystemService(r5)
            boolean r5 = r4 instanceof android.app.ActivityManager
            if (r5 != 0) goto L_0x0578
        L_0x0576:
            r5 = -1
            goto L_0x058c
        L_0x0578:
            android.app.ActivityManager$MemoryInfo r5 = new android.app.ActivityManager$MemoryInfo
            r5.<init>()
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4
            r4.getMemoryInfo(r5)
            long r4 = r5.totalMem
            r6 = 1048576(0x100000, double:5.180654E-318)
            long r4 = r4 / r6
            int r5 = (int) r4
            if (r5 > 0) goto L_0x058c
            goto L_0x0576
        L_0x058c:
            long r4 = (long) r5
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 < 0) goto L_0x05b7
            com.google.android.apps.gsa.launcher.a.l r2 = new com.google.android.apps.gsa.launcher.a.l
            com.android.launcher3.Launcher r3 = r1.f208805b
            r2.<init>(r3)
            r1.f208813j = r2
            com.google.android.apps.gsa.launcher.a.l r2 = r1.f208813j
            com.google.android.libraries.gsa.d.k r4 = new com.google.android.libraries.gsa.d.k
            boolean r5 = r1.mo70986b()
            r4.<init>(r5)
            com.google.android.libraries.gsa.d.m r5 = new com.google.android.libraries.gsa.d.m
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            r5.<init>(r3, r2, r4, r6)
            r1.f208814k = r5
            com.google.android.apps.gsa.launcher.a.l r2 = r1.f208813j
            com.google.android.libraries.gsa.d.m r1 = r1.f208814k
            r2.a = r1
            goto L_0x05e9
        L_0x05b7:
            com.google.android.apps.gsa.launcher.a.k r2 = new com.google.android.apps.gsa.launcher.a.k
            com.android.launcher3.Launcher r3 = r1.f208805b
            r2.<init>(r3)
            r1.f208815l = r2
            com.android.launcher3.Launcher r2 = r1.f208805b
            com.android.launcher3.DragLayer r2 = r2.mDragLayer
            com.google.android.apps.gsa.launcher.a.k r3 = r1.f208815l
            com.android.launcher3.DragLayer$LayoutParams r4 = new com.android.launcher3.DragLayer$LayoutParams
            r4.<init>((int) r10, (int) r10)
            r2.addView(r3, r4)
            com.android.launcher3.Launcher r2 = r1.f208805b
            com.google.android.libraries.gsa.d.o r3 = new com.google.android.libraries.gsa.d.o
            r3.<init>()
            com.google.android.libraries.gsa.d.k r4 = new com.google.android.libraries.gsa.d.k
            boolean r5 = r1.mo70986b()
            r4.<init>(r5)
            com.google.android.libraries.gsa.d.m r5 = new com.google.android.libraries.gsa.d.m
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            r5.<init>(r2, r3, r4, r6)
            r1.f208814k = r5
        L_0x05e9:
            com.google.android.apps.gsa.launcher.a.d r1 = r8.mLauncherCallbacks$ar$class_merging
            if (r1 == 0) goto L_0x06a9
            com.android.launcher3.Launcher r2 = r1.f208805b
            boolean r2 = com.google.android.apps.gsa.shared.util.C90772bp.m148279F(r2)
            if (r2 != 0) goto L_0x06a9
            com.android.launcher3.Launcher r1 = r1.f208805b
            android.content.SharedPreferences r1 = r1.mSharedPrefs
            java.lang.String r2 = "launcher.first_run_activity_displayed"
            boolean r1 = r1.getBoolean(r2, r12)
            if (r1 != 0) goto L_0x06a9
            android.content.SharedPreferences r1 = r8.mSharedPrefs
            java.lang.String r2 = "launcher.intro_screen_dismissed"
            boolean r1 = r1.getBoolean(r2, r12)
            if (r1 != 0) goto L_0x06a9
            com.google.android.apps.gsa.launcher.a.d r1 = r8.mLauncherCallbacks$ar$class_merging
            if (r1 == 0) goto L_0x0690
            com.android.launcher3.Launcher r1 = r1.f208805b
            android.view.LayoutInflater r2 = r1.getLayoutInflater()
            r3 = 2131625012(0x7f0e0434, float:1.887722E38)
            r4 = 0
            android.view.View r2 = r2.inflate(r3, r4, r12)
            r3 = 2131431064(0x7f0b0e98, float:1.8483847E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.Button r3 = (android.widget.Button) r3
            com.google.android.apps.gsa.launcher.a r4 = new com.google.android.apps.gsa.launcher.a
            r4.<init>(r1)
            r3.setOnClickListener(r4)
            android.content.res.Resources r3 = r1.getResources()
            r4 = 2132087025(0x7f1510f1, float:1.9814294E38)
            java.lang.String r3 = r3.getString(r4)
            r4 = 2131431065(0x7f0b0e99, float:1.8483849E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r5 = "com.google.android.googlequicksearchbox.VIEW_PRIVACY_POLICY"
            r0[r12] = r5
            java.lang.String r5 = "com.google.android.googlequicksearchbox.VIEW_TERMS_OF_SERVICE"
            r6 = 1
            r0[r6] = r5
            java.lang.String r0 = java.lang.String.format(r3, r0)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            r4.setText(r0)
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r4.setMovementMethod(r0)
            java.lang.CharSequence r0 = r4.getText()
            android.text.Spannable r0 = (android.text.Spannable) r0
            android.text.style.URLSpan[] r3 = r4.getUrls()
            int r4 = r3.length
            r5 = 0
        L_0x066b:
            if (r5 >= r4) goto L_0x0692
            r6 = r3[r5]
            int r7 = r0.getSpanStart(r6)
            int r9 = r0.getSpanEnd(r6)
            java.lang.String r11 = r6.getURL()
            r0.removeSpan(r6)
            com.google.android.apps.gsa.launcher.GELConsentScreenFactory$IntentSpan r6 = new com.google.android.apps.gsa.launcher.GELConsentScreenFactory$IntentSpan
            android.content.Intent r13 = new android.content.Intent
            r13.<init>(r11)
            r6.<init>(r1, r13)
            r11 = 34
            r0.setSpan(r6, r7, r9, r11)
            int r5 = r5 + 1
            goto L_0x066b
        L_0x0690:
            r4 = 0
            r2 = r4
        L_0x0692:
            r8.changeWallpaperVisiblity(r12)
            if (r2 == 0) goto L_0x06af
            com.android.launcher3.DragLayer r0 = r8.mDragLayer
            com.android.launcher3.DragLayer$LayoutParams r1 = new com.android.launcher3.DragLayer$LayoutParams
            r1.<init>((int) r10, (int) r10)
            r0.mOverlayView = r2
            r0.addView(r2, r1)
            android.view.View r0 = r0.mOverlayView
            r0.bringToFront()
            goto L_0x06af
        L_0x06a9:
            r16.showFirstRunActivity()
            r16.showFirstRunClings()
        L_0x06af:
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r1 = "android.intent.action.CLOSE_SYSTEM_DIALOGS"
            r0.<init>(r1)
            android.content.BroadcastReceiver r1 = r8.mCloseSystemDialogsReceiver
            r8.registerReceiver(r1, r0)
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "android.intent.action.SCREEN_OFF"
            r0.addAction(r1)
            java.lang.String r1 = "android.intent.action.USER_PRESENT"
            r0.addAction(r1)
            android.content.BroadcastReceiver r1 = r8.mReceiver
            r8.registerReceiver(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.Launcher.onCreate(android.os.Bundle):void");
    }

    public final void onDestroy() {
        super.onDestroy();
        this.mHandler.removeMessages(1);
        this.mHandler.removeMessages(0);
        this.mWorkspace.removeCallbacks(this.mBuildLayersRunnable);
        LauncherAppState instance = LauncherAppState.getInstance();
        if (this.mModel.isCurrentCallbacks(this)) {
            this.mModel.stopLoader();
            instance.setLauncher((Launcher) null);
        }
        try {
            this.mAppWidgetHost.stopListening();
        } catch (NullPointerException e) {
            Log.w("Launcher", "problem while stopping AppWidgetHost during Launcher destruction", e);
        }
        this.mAppWidgetHost = null;
        this.mWidgetsToAdvance.clear();
        TextKeyListener.getInstance().release();
        unregisterReceiver(this.mCloseSystemDialogsReceiver);
        unregisterReceiver(this.mReceiver);
        this.mDragLayer.clearAllResizeFrames();
        ((ViewGroup) this.mWorkspace.getParent()).removeAllViews();
        this.mWorkspace.removeAllWorkspaceScreens();
        this.mWorkspace = null;
        this.mDragController = null;
        LauncherAnimUtils.onDestroyActivity();
        C74629d dVar = this.mLauncherCallbacks$ar$class_merging;
        if (dVar != null) {
            C22791m mVar = dVar.f208814k;
            if (mVar != null) {
                boolean z = !mVar.f62741b.isChangingConfigurations();
                if (!mVar.f62750k) {
                    mVar.f62741b.unregisterReceiver(mVar.f62747h);
                }
                mVar.f62750k = true;
                mVar.f62745f.mo28148d();
                C22790l lVar = mVar.f62754o;
                if (lVar != null) {
                    lVar.f62735a = null;
                    lVar.f62736b = null;
                    lVar.f62738d = null;
                    mVar.f62754o = null;
                }
                C22783e eVar = mVar.f62746g;
                C22791m a = eVar.mo28115a();
                if (a != null && a.equals(mVar)) {
                    eVar.f62718c = null;
                    if (z) {
                        eVar.mo28148d();
                        if (C22783e.f62716a == eVar) {
                            C22783e.f62716a = null;
                        }
                    }
                }
            }
            dVar.f208808e = true;
        }
    }

    public final void onDetachedFromWindow() {
        C22791m mVar;
        super.onDetachedFromWindow();
        this.mVisible = false;
        updateAutoAdvanceState();
        C74629d dVar = this.mLauncherCallbacks$ar$class_merging;
        if (dVar != null && (mVar = dVar.f208814k) != null && !mVar.f62750k) {
            mVar.f62743d.mo28121a("detachedFromWindow");
            mVar.mo28137f((WindowManager.LayoutParams) null);
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        SpannableStringBuilder spannableStringBuilder;
        int unicodeChar = keyEvent.getUnicodeChar();
        boolean onKeyDown = super.onKeyDown(i, keyEvent);
        boolean z = false;
        if (unicodeChar > 0 && !Character.isWhitespace(unicodeChar)) {
            z = true;
        }
        if (!onKeyDown && !((InputMethodManager) getSystemService("input_method")).isFullscreenMode() && z && TextKeyListener.getInstance().onKeyDown(this.mWorkspace, this.mDefaultKeySsb, i, keyEvent) && (spannableStringBuilder = this.mDefaultKeySsb) != null && spannableStringBuilder.length() > 0) {
            onSearchRequested();
            return true;
        } else if (i != 82 || !keyEvent.isLongPress()) {
            return onKeyDown;
        } else {
            return true;
        }
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 82) {
            return super.onKeyUp(i, keyEvent);
        }
        if (!this.mWorkspace.isOnOrMovingToCustomContent() && !this.mDragController.mDragging) {
            closeFolder(true);
            closeShortcutsContainer(true);
            this.mWorkspace.exitWidgetResizeMode();
            if (this.mState$ar$edu$fb933cd0_0 == 2 && !this.mWorkspace.isInOverviewMode() && !this.mWorkspace.mIsSwitchingState) {
                this.mOverviewPanel.requestFocus();
                showOverviewMode$ar$ds$49c8ce8_0(true);
            }
        }
        return true;
    }

    public final void onLauncherProviderChange() {
        C74629d dVar = this.mLauncherCallbacks$ar$class_merging;
        if (dVar != null) {
            dVar.mo70985a(1000);
        }
    }

    public final boolean onLongClick(View view) {
        CellLayout.CellInfo cellInfo;
        View view2;
        if (!isDraggingEnabled() || isWorkspaceLocked() || this.mState$ar$edu$fb933cd0_0 != 2) {
            return false;
        }
        if (view == this.mAllAppsButton) {
            if (!isAppsViewVisible()) {
                showAppsView$ar$ds(true, true, true);
            }
            return true;
        } else if (!(view instanceof Workspace)) {
            if (view.getTag() instanceof ItemInfo) {
                cellInfo = new CellLayout.CellInfo(view, (ItemInfo) view.getTag());
                view2 = cellInfo.cell;
                resetAddInfo();
            } else {
                view2 = null;
                cellInfo = null;
            }
            boolean isHotseatLayout = isHotseatLayout(view);
            if (!this.mDragController.mDragging) {
                if (view2 == null) {
                    this.mWorkspace.performHapticFeedback(0, 1);
                    if (this.mWorkspace.isInOverviewMode()) {
                        Workspace workspace = this.mWorkspace;
                        int indexOfChild = workspace.indexOfChild(view);
                        if (workspace.mTouchState == 0 && indexOfChild != -1) {
                            int[] iArr = workspace.mTempVisiblePagesRange;
                            iArr[0] = 0;
                            iArr[1] = workspace.getChildCount() - 1;
                            workspace.getFreeScrollPageRange(workspace.mTempVisiblePagesRange);
                            workspace.mReorderingStarted = true;
                            int[] iArr2 = workspace.mTempVisiblePagesRange;
                            if (iArr2[0] <= indexOfChild && indexOfChild <= iArr2[1]) {
                                workspace.mDragView = workspace.getChildAt(indexOfChild);
                                workspace.mDragView.animate().scaleX(1.15f).scaleY(1.15f).setDuration(100).start();
                                workspace.mDragViewBaselineLeft = (float) workspace.mDragView.getLeft();
                                workspace.snapToPage(workspace.getPageNearestToCenterOfScreen(), 750, false, (TimeInterpolator) null);
                                workspace.setEnableFreeScroll(false);
                                workspace.onStartReordering();
                            }
                        }
                    } else {
                        showOverviewMode$ar$ds$49c8ce8_0(false);
                    }
                } else {
                    boolean z = isHotseatLayout && isAllAppsButtonRank(this.mHotseat.getOrderInHotseat(cellInfo.cellX, cellInfo.cellY));
                    if (!(view2 instanceof Folder) && !z) {
                        this.mWorkspace.startDrag(cellInfo, false);
                    }
                }
            }
            return true;
        } else if (this.mWorkspace.isInOverviewMode() || this.mWorkspace.isTouchActive()) {
            return false;
        } else {
            showOverviewMode$ar$ds$49c8ce8_0(false);
            this.mWorkspace.performHapticFeedback(0, 1);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        C22791m mVar;
        AllAppsContainerView allAppsContainerView;
        super.onNewIntent(intent);
        Folder openFolder = this.mWorkspace.getOpenFolder();
        boolean z = true;
        boolean z2 = this.mHasFocus && (intent.getFlags() & 4194304) != 4194304;
        boolean equals = "android.intent.action.MAIN".equals(intent.getAction());
        if (equals) {
            closeSystemDialogs();
            Workspace workspace = this.mWorkspace;
            if (workspace != null) {
                workspace.exitWidgetResizeMode();
                closeFolder(z2);
                closeShortcutsContainer(z2);
                exitSpringLoadedDragMode();
                if (z2) {
                    showWorkspace(-1, true, (Runnable) null);
                } else {
                    this.mOnResumeState$ar$edu = 2;
                }
                View peekDecorView = getWindow().peekDecorView();
                if (!(peekDecorView == null || peekDecorView.getWindowToken() == null)) {
                    ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(peekDecorView.getWindowToken(), 0);
                }
                if (!z2 && (allAppsContainerView = this.mAppsView) != null) {
                    allAppsContainerView.mAppsRecyclerView.scrollToTop();
                }
                if (!z2) {
                    WidgetsContainerView widgetsContainerView = this.mWidgetsView;
                    if (widgetsContainerView != null) {
                        widgetsContainerView.scrollToTop();
                    }
                    z = false;
                }
                C74629d dVar = this.mLauncherCallbacks$ar$class_merging;
                if (!(dVar == null || (mVar = dVar.f208814k) == null)) {
                    boolean z3 = dVar.f208809f;
                    mVar.f62743d.mo28122b("hideOverlay", z3);
                    C146707c cVar = mVar.f62748i;
                    if (cVar != null) {
                        try {
                            cVar.mo28082f(z3 ? 1 : 0);
                        } catch (RemoteException unused) {
                        }
                    }
                }
                z2 = z;
            } else {
                return;
            }
        }
        if (equals && z2 && this.mState$ar$edu$fb933cd0_0 == 2 && !this.mWorkspace.isTouchActive() && openFolder == null) {
            this.mWorkspace.post(new Runnable() {
                public final void run() {
                    Workspace workspace = Launcher.this.mWorkspace;
                    if (workspace != null) {
                        workspace.moveToScreen(workspace.mDefaultPage, true);
                    }
                }
            });
        }
    }

    public final void onPageBoundSynchronously(int i) {
        this.mSynchronouslyBoundPages.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        InstallShortcutReceiver.mUseInstallQueue = true;
        super.onPause();
        this.mPaused = true;
        this.mDragController.cancelDrag();
        this.mDragController.mLastTouchUpTime = -1;
        C74629d dVar = this.mLauncherCallbacks$ar$class_merging;
        if (dVar != null) {
            dVar.f208807d = false;
            C22791m mVar = dVar.f208814k;
            if (mVar != null && !mVar.f62750k) {
                int i = mVar.f62749j & -3;
                mVar.f62749j = i;
                C146707c cVar = mVar.f62748i;
                if (!(cVar == null || mVar.f62753n == null)) {
                    try {
                        if (C22791m.f62740a < 4) {
                            cVar.mo28085m();
                        } else {
                            cVar.mo28092u(i);
                        }
                    } catch (RemoteException unused) {
                    }
                }
                mVar.f62743d.mo28123c(2, "stateChanged ", (float) mVar.f62749j);
            }
        }
    }

    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        return false;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        PendingAddArguments pendingAddArguments;
        View view;
        if (i == 13 && (pendingAddArguments = sPendingAddItem) != null && pendingAddArguments.requestCode == 13) {
            CellLayout cellLayout = getCellLayout(pendingAddArguments.container, pendingAddArguments.screenId);
            if (cellLayout != null) {
                PendingAddArguments pendingAddArguments2 = sPendingAddItem;
                view = cellLayout.mShortcutsAndWidgets.getChildAt(pendingAddArguments2.cellX, pendingAddArguments2.cellY);
            } else {
                view = null;
            }
            Intent intent = sPendingAddItem.intent;
            sPendingAddItem = null;
            if (iArr.length <= 0 || iArr[0] != 0) {
                Toast.makeText(this, getString(R.string.msg_no_phone_permission, new Object[]{getString(R.string.app_name)}), 0).show();
                return;
            }
            startActivitySafely(view, intent, (Object) null);
        }
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        ArrayList arrayList = this.mSynchronouslyBoundPages;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.mWorkspace.restoreInstanceStateForChild(((Integer) arrayList.get(i)).intValue());
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        View.OnClickListener pageIndicatorClickListener;
        super.onResume();
        int i = this.mOnResumeState$ar$edu;
        if (i == 2) {
            showWorkspace(-1, false, (Runnable) null);
        } else if (i == 3) {
            showAppsView$ar$ds(false, this.mWaitingForResume == null, false);
        } else if (i == 5) {
            showWidgetsView(false, false);
        }
        this.mOnResumeState$ar$edu = 1;
        setWorkspaceBackground(this.mState$ar$edu$fb933cd0_0 == 2 ? 0 : 1);
        this.mPaused = false;
        if (this.mRestoring || this.mOnResumeNeedsLoad) {
            this.mWorkspaceLoading = true;
            this.mBindOnResumeCallbacks.clear();
            this.mModel.startLoader(-1001, 0);
            this.mRestoring = false;
            this.mOnResumeNeedsLoad = false;
        }
        if (this.mBindOnResumeCallbacks.size() > 0) {
            for (int i2 = 0; i2 < this.mBindOnResumeCallbacks.size(); i2++) {
                ((Runnable) this.mBindOnResumeCallbacks.get(i2)).run();
            }
            this.mBindOnResumeCallbacks.clear();
        }
        if (this.mOnResumeCallbacks.size() > 0) {
            for (int i3 = 0; i3 < this.mOnResumeCallbacks.size(); i3++) {
                ((Runnable) this.mOnResumeCallbacks.get(i3)).run();
            }
            this.mOnResumeCallbacks.clear();
        }
        BubbleTextView bubbleTextView = this.mWaitingForResume;
        if (bubbleTextView != null) {
            bubbleTextView.setStayPressed(false);
        }
        if (!this.mWorkspaceLoading) {
            this.mWorkspace.reinflateWidgetsIfNecessary();
        }
        AppWidgetHostView appWidgetHostView = this.mQsb;
        if ((appWidgetHostView instanceof LauncherAppWidgetHostView) && ((LauncherAppWidgetHostView) appWidgetHostView).isReinflateRequired()) {
            this.mSearchDropTargetBar.removeView(this.mQsb);
            this.mQsb = null;
            this.mSearchDropTargetBar.mQSB = getOrCreateQsbBar();
        }
        Workspace.State state = Workspace.State.NORMAL;
        Workspace workspace = this.mWorkspace;
        Workspace.State state2 = workspace.mState;
        if (!(workspace.mPageIndicator == null || (pageIndicatorClickListener = workspace.getPageIndicatorClickListener()) == null)) {
            workspace.mPageIndicator.setOnClickListener(pageIndicatorClickListener);
        }
        LauncherAppState instance = LauncherAppState.getInstance();
        boolean z = instance.mWallpaperChangedSinceLastCheck;
        instance.mWallpaperChangedSinceLastCheck = false;
        if (z) {
            workspace.setWallpaperDimension();
        }
        workspace.mWallpaperIsLiveWallpaper = workspace.mWallpaperManager.getWallpaperInfo() != null;
        workspace.mLastSetWallpaperOffsetSteps = 0.0f;
        if (!this.mWorkspaceLoading) {
            InstallShortcutReceiver.disableAndFlushInstallQueue(this);
            LauncherModel launcherModel = this.mModel;
            boolean z2 = Utilities.ATLEAST_O;
            LauncherModel.sWorker.removeCallbacks(launcherModel.mShortcutPermissionCheckRunnable);
            LauncherModel.sWorker.post(launcherModel.mShortcutPermissionCheckRunnable);
        }
        C74629d dVar = this.mLauncherCallbacks$ar$class_merging;
        if (dVar != null) {
            dVar.f208807d = true;
            if (dVar.f208806c) {
                dVar.f208809f = true;
            }
            C22794p pVar = new C22794p(dVar.f208805b.getApplicationContext());
            k kVar = dVar.f208815l;
            if (kVar != null) {
                kVar.a();
                pVar.mo28141a(new b(dVar));
            }
            if (dVar.f208814k != null) {
                pVar.mo28141a(new c(dVar));
                C22791m mVar = dVar.f208814k;
                if (!mVar.f62750k) {
                    int i4 = mVar.f62749j | 2;
                    mVar.f62749j = i4;
                    C146707c cVar = mVar.f62748i;
                    if (!(cVar == null || mVar.f62753n == null)) {
                        try {
                            if (C22791m.f62740a < 4) {
                                cVar.mo28086n();
                            } else {
                                cVar.mo28092u(i4);
                            }
                        } catch (RemoteException unused) {
                        }
                    }
                    mVar.f62743d.mo28123c(2, "stateChanged ", (float) mVar.f62749j);
                }
                dVar.mo70985a(0);
            }
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        if (this.mModel.isCurrentCallbacks(this)) {
            this.mModel.stopLoader();
        }
        return Boolean.TRUE;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2;
        if (!this.mWorkspaceLoading || (bundle2 = this.mSavedState) == null) {
            if (this.mWorkspace.getChildCount() > 0) {
                Workspace workspace = this.mWorkspace;
                bundle.putInt("launcher.current_screen", workspace.getNextPage() - workspace.numCustomPages());
            }
            super.onSaveInstanceState(bundle);
            int i = this.mState$ar$edu$fb933cd0_0;
            int i2 = i - 1;
            if (i != 0) {
                bundle.putInt("launcher.state", i2);
                closeFolder(false);
                closeShortcutsContainer(false);
                PendingAddItemInfo pendingAddItemInfo = this.mPendingAddInfo;
                long j = pendingAddItemInfo.container;
                if (j != -1 && pendingAddItemInfo.screenId > -1 && this.mWaitingForResult) {
                    bundle.putLong("launcher.add_container", j);
                    bundle.putLong("launcher.add_screen", this.mPendingAddInfo.screenId);
                    bundle.putInt("launcher.add_cell_x", this.mPendingAddInfo.cellX);
                    bundle.putInt("launcher.add_cell_y", this.mPendingAddInfo.cellY);
                    bundle.putInt("launcher.add_span_x", this.mPendingAddInfo.spanX);
                    bundle.putInt("launcher.add_span_y", this.mPendingAddInfo.spanY);
                    UserHandleCompat userHandleCompat = this.mPendingAddInfo.user;
                    if (userHandleCompat != null) {
                        userHandleCompat.addToBundle(bundle, "launcher.add_user");
                    }
                    bundle.putParcelable("launcher.add_component", this.mPendingAddInfo.componentName);
                    bundle.putParcelable("launcher.add_widget_info", this.mPendingAddWidgetInfo);
                    bundle.putInt("launcher.add_widget_id", this.mPendingAddWidgetId);
                }
                C74629d dVar = this.mLauncherCallbacks$ar$class_merging;
                if (dVar != null) {
                    bundle.putBoolean("now_enabled", dVar.f208812i);
                    return;
                }
                return;
            }
            throw null;
        }
        bundle.putAll(bundle2);
    }

    public final boolean onSearchRequested() {
        startSearch((String) null, false, (Bundle) null, true);
        return true;
    }

    public final void onSettingsChanged(String str, boolean z) {
        if ("pref_allowRotation".equals(str)) {
            this.mRotationEnabled = z;
            if (!waitUntilResume(this.mUpdateOrientationRunnable, true)) {
                Launcher.this.setOrientation();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        FirstFrameAnimatorHelper.sVisible = true;
        C74629d dVar = this.mLauncherCallbacks$ar$class_merging;
        if (dVar != null) {
            dVar.f208806c = true;
            C22791m mVar = dVar.f208814k;
            if (mVar != null && !mVar.f62750k) {
                C22783e eVar = mVar.f62746g;
                eVar.f62719d = false;
                eVar.mo28116b();
                mVar.mo28134c();
                int i = 1 | mVar.f62749j;
                mVar.f62749j = i;
                C146707c cVar = mVar.f62748i;
                if (!(cVar == null || mVar.f62753n == null)) {
                    try {
                        cVar.mo28092u(i);
                    } catch (RemoteException unused) {
                    }
                }
                mVar.f62743d.mo28123c(2, "stateChanged ", (float) mVar.f62749j);
            }
        }
        boolean z = Utilities.ATLEAST_O;
        this.mAppWidgetHost.startListening();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        FirstFrameAnimatorHelper.sVisible = false;
        C74629d dVar = this.mLauncherCallbacks$ar$class_merging;
        if (dVar != null) {
            dVar.f208806c = false;
            C22791m mVar = dVar.f208814k;
            if (mVar != null && !mVar.f62750k) {
                C22783e eVar = mVar.f62746g;
                eVar.f62719d = true;
                eVar.mo28116b();
                mVar.f62745f.mo28148d();
                int i = mVar.f62749j & -2;
                mVar.f62749j = i;
                C146707c cVar = mVar.f62748i;
                if (!(cVar == null || mVar.f62753n == null)) {
                    try {
                        cVar.mo28092u(i);
                    } catch (RemoteException unused) {
                    }
                }
                mVar.f62743d.mo28123c(2, "stateChanged ", (float) mVar.f62749j);
            }
            if (!dVar.f208807d) {
                dVar.f208809f = false;
            }
            k kVar = dVar.f208815l;
            if (kVar != null) {
                kVar.a();
            }
        }
        boolean z = Utilities.ATLEAST_O;
        this.mAppWidgetHost.stopListening();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }

    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (i >= 20) {
            SQLiteDatabase.releaseMemory();
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.mHasFocus = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v39, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v40, resolved type: android.animation.AnimatorSet} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void openFolder(com.android.launcher3.FolderIcon r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            com.android.launcher3.Folder r2 = r1.mFolder
            com.android.launcher3.Workspace r3 = r0.mWorkspace
            r4 = 0
            if (r3 == 0) goto L_0x0010
            com.android.launcher3.Folder r3 = r3.getOpenFolder()
            goto L_0x0011
        L_0x0010:
            r3 = r4
        L_0x0011:
            r5 = 1
            if (r3 == 0) goto L_0x0019
            if (r3 == r2) goto L_0x0019
            r0.closeFolder(r5)
        L_0x0019:
            com.android.launcher3.FolderInfo r3 = r2.mInfo
            r3.opened = r5
            android.view.ViewGroup$LayoutParams r3 = r19.getLayoutParams()
            com.android.launcher3.CellLayout$LayoutParams r3 = (com.android.launcher3.CellLayout.LayoutParams) r3
            r6 = 0
            r3.canReorder = r6
            android.view.ViewParent r3 = r2.getParent()
            if (r3 != 0) goto L_0x0039
            com.android.launcher3.DragLayer r3 = r0.mDragLayer
            r3.addView(r2)
            com.android.launcher3.DragController r3 = r0.mDragController
            java.util.ArrayList r3 = r3.mDropTargets
            r3.add(r2)
            goto L_0x0065
        L_0x0039:
            java.lang.String r3 = java.lang.String.valueOf(r2)
            android.view.ViewParent r7 = r2.getParent()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Opening folder ("
            r8.<init>(r9)
            r8.append(r3)
            java.lang.String r3 = ") which already has a parent ("
            r8.append(r3)
            r8.append(r7)
            java.lang.String r3 = ")."
            r8.append(r3)
            java.lang.String r3 = "Launcher"
            java.lang.String r7 = r8.toString()
            android.util.Log.w(r3, r7)
        L_0x0065:
            android.view.ViewParent r3 = r2.getParent()
            boolean r3 = r3 instanceof com.android.launcher3.DragLayer
            r7 = 3
            java.lang.String r9 = "scaleY"
            java.lang.String r10 = "scaleX"
            java.lang.String r12 = "alpha"
            r13 = 0
            r14 = 2
            if (r3 != 0) goto L_0x0078
            goto L_0x029f
        L_0x0078:
            com.android.launcher3.FolderPagedView r3 = r2.mContent
            r3.completePendingPageChanges()
            boolean r3 = r2.mDragInProgress
            if (r3 != 0) goto L_0x0088
            com.android.launcher3.FolderPagedView r3 = r2.mContent
            r15 = 750(0x2ee, float:1.051E-42)
            r3.snapToPage(r6, r15, r5, r4)
        L_0x0088:
            r2.mDeleteFolderOnDropCompleted = r6
            boolean r3 = com.android.launcher3.Utilities.ATLEAST_LOLLIPOP
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r3 != 0) goto L_0x00dd
            android.view.ViewParent r3 = r2.getParent()
            boolean r3 = r3 instanceof com.android.launcher3.DragLayer
            if (r3 == 0) goto L_0x00a6
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            r2.setScaleX(r3)
            r2.setScaleY(r3)
            r2.setAlpha(r13)
            r2.mState = r6
        L_0x00a6:
            r2.centerAboutIcon()
            float[] r3 = new float[r5]
            r3[r6] = r15
            android.animation.PropertyValuesHolder r3 = android.animation.PropertyValuesHolder.ofFloat(r12, r3)
            float[] r8 = new float[r5]
            r8[r6] = r15
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofFloat(r10, r8)
            float[] r11 = new float[r5]
            r11[r6] = r15
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r9, r11)
            android.animation.PropertyValuesHolder[] r13 = new android.animation.PropertyValuesHolder[r7]
            r13[r6] = r3
            r13[r5] = r8
            r13[r14] = r11
            android.animation.ObjectAnimator r3 = com.android.launcher3.LauncherAnimUtils.ofPropertyValuesHolder(r2, r13)
            int r8 = r2.mExpandDuration
            long r7 = (long) r8
            r3.setDuration(r7)
            r2.setLayerType(r14, r4)
            com.android.launcher3.Folder$4 r4 = new com.android.launcher3.Folder$4
            r4.<init>()
            goto L_0x0219
        L_0x00dd:
            r2.setScaleX(r15)
            r2.setScaleY(r15)
            r2.setAlpha(r15)
            r2.mState = r6
            r2.centerAboutIcon()
            android.animation.AnimatorSet r3 = com.android.launcher3.LauncherAnimUtils.createAnimatorSet()
            int r7 = r2.getPaddingLeft()
            int r8 = r2.getPaddingRight()
            int r7 = r7 + r8
            com.android.launcher3.FolderPagedView r8 = r2.mContent
            int r8 = r8.getDesiredWidth()
            int r7 = r7 + r8
            int r8 = r2.getContentAreaHeight()
            int r8 = r2.getFolderHeight(r8)
            int r13 = r7 / 2
            float r13 = (float) r13
            float r16 = r2.getPivotX()
            float r13 = r13 - r16
            r16 = -1114007142(0xffffffffbd99999a, float:-0.075)
            float r13 = r13 * r16
            int r11 = r8 / 2
            float r11 = (float) r11
            float r17 = r2.getPivotY()
            float r11 = r11 - r17
            float r11 = r11 * r16
            r2.setTranslationX(r13)
            r2.setTranslationY(r11)
            float[] r15 = new float[r14]
            r15[r6] = r13
            r13 = 0
            r15[r5] = r13
            java.lang.String r4 = "translationX"
            android.animation.PropertyValuesHolder r4 = android.animation.PropertyValuesHolder.ofFloat(r4, r15)
            float[] r15 = new float[r14]
            r15[r6] = r11
            r15[r5] = r13
            java.lang.String r11 = "translationY"
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r11, r15)
            android.animation.PropertyValuesHolder[] r13 = new android.animation.PropertyValuesHolder[r14]
            r13[r6] = r4
            r13[r5] = r11
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r2, r13)
            int r11 = r2.mMaterialExpandDuration
            long r14 = (long) r11
            r4.setDuration(r14)
            int r11 = r2.mMaterialExpandStagger
            long r14 = (long) r11
            r4.setStartDelay(r14)
            com.android.launcher3.LogDecelerateInterpolator r11 = new com.android.launcher3.LogDecelerateInterpolator
            r11.<init>()
            r4.setInterpolator(r11)
            float r11 = r2.getPivotX()
            float r7 = (float) r7
            float r7 = r7 - r11
            r11 = 0
            float r7 = java.lang.Math.max(r7, r11)
            float r14 = r2.getPivotX()
            float r7 = java.lang.Math.max(r7, r14)
            float r14 = r2.getPivotY()
            float r8 = (float) r8
            float r8 = r8 - r14
            float r8 = java.lang.Math.max(r8, r11)
            float r11 = r2.getPivotY()
            float r8 = java.lang.Math.max(r8, r11)
            int r7 = (int) r7
            double r14 = (double) r7
            int r7 = (int) r8
            double r7 = (double) r7
            double r7 = java.lang.Math.hypot(r14, r7)
            com.android.launcher3.util.CircleRevealOutlineProvider r11 = new com.android.launcher3.util.CircleRevealOutlineProvider
            float r14 = r2.getPivotX()
            int r14 = (int) r14
            float r15 = r2.getPivotY()
            int r15 = (int) r15
            float r7 = (float) r7
            r8 = 0
            r11.<init>(r14, r15, r8, r7)
            android.animation.ValueAnimator r7 = r11.createRevealAnimator(r2, r6)
            int r11 = r2.mMaterialExpandDuration
            long r14 = (long) r11
            r7.setDuration(r14)
            com.android.launcher3.LogDecelerateInterpolator r11 = new com.android.launcher3.LogDecelerateInterpolator
            r11.<init>()
            r7.setInterpolator(r11)
            android.view.View r11 = r2.mContentWrapper
            r11.setAlpha(r8)
            android.view.View r8 = r2.mContentWrapper
            r11 = 2
            float[] r14 = new float[r11]
            r14 = {0, 1065353216} // fill-array
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r8, r12, r14)
            int r11 = r2.mMaterialExpandDuration
            long r14 = (long) r11
            r8.setDuration(r14)
            int r11 = r2.mMaterialExpandStagger
            long r14 = (long) r11
            r8.setStartDelay(r14)
            android.view.animation.AccelerateInterpolator r11 = new android.view.animation.AccelerateInterpolator
            r14 = 1069547520(0x3fc00000, float:1.5)
            r11.<init>(r14)
            r8.setInterpolator(r11)
            android.view.View r11 = r2.mFooter
            r14 = 0
            r11.setAlpha(r14)
            android.view.View r11 = r2.mFooter
            r13 = 2
            float[] r14 = new float[r13]
            r14 = {0, 1065353216} // fill-array
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r11, r12, r14)
            int r14 = r2.mMaterialExpandDuration
            long r14 = (long) r14
            r11.setDuration(r14)
            int r14 = r2.mMaterialExpandStagger
            long r14 = (long) r14
            r11.setStartDelay(r14)
            android.view.animation.AccelerateInterpolator r14 = new android.view.animation.AccelerateInterpolator
            r15 = 1069547520(0x3fc00000, float:1.5)
            r14.<init>(r15)
            r11.setInterpolator(r14)
            r3.play(r4)
            r3.play(r8)
            r3.play(r11)
            r3.play(r7)
            android.view.View r4 = r2.mContentWrapper
            r7 = 0
            r8 = 2
            r4.setLayerType(r8, r7)
            android.view.View r4 = r2.mFooter
            r4.setLayerType(r8, r7)
            com.android.launcher3.Folder$5 r4 = new com.android.launcher3.Folder$5
            r4.<init>()
        L_0x0219:
            com.android.launcher3.Folder$6 r7 = new com.android.launcher3.Folder$6
            r7.<init>(r4)
            r3.addListener(r7)
            com.android.launcher3.FolderPagedView r4 = r2.mContent
            int r4 = r4.getChildCount()
            if (r4 <= r5) goto L_0x027d
            com.android.launcher3.FolderInfo r4 = r2.mInfo
            r7 = 4
            boolean r4 = r4.hasOption(r7)
            if (r4 != 0) goto L_0x027d
            com.android.launcher3.FolderPagedView r4 = r2.mContent
            int r4 = r4.getDesiredWidth()
            android.view.View r7 = r2.mFooter
            int r7 = r7.getPaddingLeft()
            int r4 = r4 - r7
            android.view.View r7 = r2.mFooter
            int r7 = r7.getPaddingRight()
            int r4 = r4 - r7
            float r4 = (float) r4
            com.android.launcher3.ExtendedEditText r7 = r2.mFolderName
            android.text.TextPaint r7 = r7.getPaint()
            com.android.launcher3.ExtendedEditText r8 = r2.mFolderName
            android.text.Editable r8 = r8.getText()
            java.lang.String r8 = r8.toString()
            float r7 = r7.measureText(r8)
            float r4 = r4 - r7
            r7 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r7
            com.android.launcher3.ExtendedEditText r7 = r2.mFolderName
            com.android.launcher3.FolderPagedView r8 = r2.mContent
            boolean r8 = r8.mIsRtl
            if (r8 == 0) goto L_0x0268
            float r4 = -r4
        L_0x0268:
            r7.setTranslationX(r4)
            com.android.launcher3.FolderPagedView r4 = r2.mContent
            r7 = 0
            r4.setMarkerScale(r7)
            boolean r4 = r2.mDragInProgress
            com.android.launcher3.Folder$7 r8 = new com.android.launcher3.Folder$7
            r4 = r4 ^ r5
            r8.<init>(r4)
            r3.addListener(r8)
            goto L_0x028a
        L_0x027d:
            r7 = 0
            com.android.launcher3.ExtendedEditText r4 = r2.mFolderName
            r4.setTranslationX(r7)
            com.android.launcher3.FolderPagedView r4 = r2.mContent
            r7 = 1065353216(0x3f800000, float:1.0)
            r4.setMarkerScale(r7)
        L_0x028a:
            r3.start()
            com.android.launcher3.DragController r3 = r2.mDragController
            boolean r4 = r3.mDragging
            if (r4 == 0) goto L_0x0296
            r3.forceTouchMove()
        L_0x0296:
            com.android.launcher3.FolderPagedView r3 = r2.mContent
            int r4 = r3.getNextPage()
            r3.verifyVisibleHighResIcons(r4)
        L_0x029f:
            if (r1 != 0) goto L_0x02a3
            goto L_0x031e
        L_0x02a3:
            float[] r3 = new float[r5]
            r4 = 0
            r3[r6] = r4
            android.animation.PropertyValuesHolder r3 = android.animation.PropertyValuesHolder.ofFloat(r12, r3)
            float[] r4 = new float[r5]
            r7 = 1069547520(0x3fc00000, float:1.5)
            r4[r6] = r7
            android.animation.PropertyValuesHolder r4 = android.animation.PropertyValuesHolder.ofFloat(r10, r4)
            float[] r8 = new float[r5]
            r8[r6] = r7
            android.animation.PropertyValuesHolder r7 = android.animation.PropertyValuesHolder.ofFloat(r9, r8)
            java.lang.Object r8 = r19.getTag()
            com.android.launcher3.FolderInfo r8 = (com.android.launcher3.FolderInfo) r8
            long r8 = r8.container
            r10 = -101(0xffffffffffffff9b, double:NaN)
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x02e9
            android.view.ViewParent r8 = r19.getParent()
            android.view.ViewParent r8 = r8.getParent()
            com.android.launcher3.CellLayout r8 = (com.android.launcher3.CellLayout) r8
            android.view.ViewGroup$LayoutParams r9 = r19.getLayoutParams()
            com.android.launcher3.CellLayout$LayoutParams r9 = (com.android.launcher3.CellLayout.LayoutParams) r9
            int r10 = r9.cellX
            int r9 = r9.cellY
            int[] r11 = r8.mFolderLeaveBehindCell
            r11[r6] = r10
            r11[r5] = r9
            r8.invalidate()
        L_0x02e9:
            r18.copyFolderIconToImage(r19)
            r8 = 4
            r1.setVisibility(r8)
            android.widget.ImageView r1 = r0.mFolderIconImageView
            r8 = 3
            android.animation.PropertyValuesHolder[] r8 = new android.animation.PropertyValuesHolder[r8]
            r8[r6] = r3
            r8[r5] = r4
            r3 = 2
            r8[r3] = r7
            android.animation.ObjectAnimator r1 = com.android.launcher3.LauncherAnimUtils.ofPropertyValuesHolder(r1, r8)
            boolean r3 = com.android.launcher3.Utilities.ATLEAST_LOLLIPOP
            if (r3 == 0) goto L_0x030c
            com.android.launcher3.LogDecelerateInterpolator r3 = new com.android.launcher3.LogDecelerateInterpolator
            r3.<init>()
            r1.setInterpolator(r3)
        L_0x030c:
            android.content.res.Resources r3 = r18.getResources()
            r4 = 2131492934(0x7f0c0046, float:1.8609334E38)
            int r3 = r3.getInteger(r4)
            long r3 = (long) r3
            r1.setDuration(r3)
            r1.start()
        L_0x031e:
            r1 = 32
            r2.sendAccessibilityEvent(r1)
            com.android.launcher3.DragLayer r1 = r0.mDragLayer
            r2 = 2048(0x800, float:2.87E-42)
            r1.sendAccessibilityEvent(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.Launcher.openFolder(com.android.launcher3.FolderIcon):void");
    }

    public final void removeItem$ar$ds(View view, ItemInfo itemInfo, boolean z) {
        if (itemInfo instanceof ShortcutInfo) {
            FolderInfo folderInfo = (FolderInfo) sFolders.get(itemInfo.container);
            if (folderInfo != null) {
                folderInfo.remove((ShortcutInfo) itemInfo);
            } else {
                this.mWorkspace.removeWorkspaceItem(view);
            }
            if (z) {
                LauncherModel.deleteItemFromDatabase(this, itemInfo);
            }
        } else if (itemInfo instanceof FolderInfo) {
            FolderInfo folderInfo2 = (FolderInfo) itemInfo;
            sFolders.remove(folderInfo2.f16556id);
            this.mWorkspace.removeWorkspaceItem(view);
            if (z) {
                LauncherModel.deleteFolderAndContentsFromDatabase(this, folderInfo2);
            }
        } else if (itemInfo instanceof LauncherAppWidgetInfo) {
            LauncherAppWidgetInfo launcherAppWidgetInfo = (LauncherAppWidgetInfo) itemInfo;
            this.mWorkspace.removeWorkspaceItem(view);
            AppWidgetHostView appWidgetHostView = launcherAppWidgetInfo.hostView;
            if (this.mWidgetsToAdvance.containsKey(appWidgetHostView)) {
                this.mWidgetsToAdvance.remove(appWidgetHostView);
                updateAutoAdvanceState();
            }
            launcherAppWidgetInfo.hostView = null;
            if (z) {
                deleteWidgetInfo(launcherAppWidgetInfo);
            }
        }
    }

    public final void resizeIconDrawable$ar$ds(Drawable drawable) {
        int i = this.mDeviceProfile.iconSizePx;
        drawable.setBounds(0, 0, i, i);
    }

    /* access modifiers changed from: package-private */
    public final void sendAdvanceMessage(long j) {
        this.mHandler.removeMessages(1);
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(1), j);
        this.mAutoAdvanceSentTime = System.currentTimeMillis();
    }

    public final void setLauncherOverlay(LauncherOverlay launcherOverlay) {
        if (launcherOverlay != null) {
            launcherOverlay.setOverlayCallbacks$ar$class_merging(new LauncherOverlayCallbacksImpl());
        }
        Workspace workspace = this.mWorkspace;
        workspace.mLauncherOverlay = launcherOverlay;
        workspace.mStartedSendingScrollEvents = false;
        workspace.onOverlayScrollChanged(0.0f);
    }

    public final boolean setLoadOnResume() {
        if (!this.mPaused) {
            return false;
        }
        this.mOnResumeNeedsLoad = true;
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void setOrientation() {
        if (this.mRotationEnabled) {
            unlockScreenOrientation(true);
        } else {
            setRequestedOrientation(5);
        }
    }

    /* access modifiers changed from: package-private */
    public final void showAppsView$ar$ds(boolean z, boolean z2, boolean z3) {
        C58485gu m;
        if (!(!z2 || this.mLauncherCallbacks$ar$class_merging == null || (m = C58485gu.m89845m()) == null)) {
            AlphabeticalAppsList alphabeticalAppsList = this.mAppsView.mApps;
            alphabeticalAppsList.mPredictedAppComponents.clear();
            alphabeticalAppsList.mPredictedAppComponents.addAll(m);
            alphabeticalAppsList.onAppsUpdated();
        }
        showAppsOrWidgets$ar$edu$ar$ds(3, z, z3);
    }

    public final boolean showFirstRunActivity() {
        C74629d dVar;
        Intent intent;
        int identifier;
        if (!ActivityManager.isRunningInTestHarness() && !this.mSharedPrefs.getBoolean("launcher.first_run_activity_displayed", false) && (dVar = this.mLauncherCallbacks$ar$class_merging) != null) {
            boolean z = !dVar.f208812i && !C90772bp.m148279F(dVar.f208805b);
            Partner partner = Partner.get(dVar.f208805b.getPackageManager());
            boolean z2 = partner != null && !dVar.f208812i && C90772bp.m148279F(dVar.f208805b) && (identifier = partner.mResources.getIdentifier("requires_first_run_flow", "bool", partner.mPackageName)) != 0 && partner.mResources.getBoolean(identifier);
            if (z || z2) {
                if (this.mLauncherCallbacks$ar$class_merging != null) {
                    C91973ax axVar = new C91973ax(C7891nu.GEL);
                    axVar.f256475g = 1;
                    axVar.f256470b = true;
                    intent = axVar.mo86664a();
                } else {
                    intent = null;
                }
                if (intent != null) {
                    startActivity(intent);
                    SharedPreferences.Editor edit = this.mSharedPrefs.edit();
                    edit.putBoolean("launcher.first_run_activity_displayed", true);
                    edit.apply();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006d, code lost:
        if (com.google.android.apps.gsa.shared.util.C90772bp.m148279F(r1.f208805b) == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0083, code lost:
        if ((getPackageManager().getApplicationInfo(getComponentName().getPackageName(), 0).flags & 1) != 0) goto L_0x00d9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void showFirstRunClings() {
        /*
            r5 = this;
            com.android.launcher3.LauncherClings r0 = new com.android.launcher3.LauncherClings
            r0.<init>(r5)
            com.android.launcher3.Launcher r1 = r0.mLauncher
            android.content.SharedPreferences r1 = r1.mSharedPrefs
            boolean r2 = android.app.ActivityManager.isRunningInTestHarness()
            if (r2 == 0) goto L_0x0011
            goto L_0x00dc
        L_0x0011:
            com.android.launcher3.Launcher r2 = r0.mLauncher
            java.lang.String r3 = "accessibility"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.view.accessibility.AccessibilityManager r2 = (android.view.accessibility.AccessibilityManager) r2
            boolean r2 = r2.isTouchExplorationEnabled()
            if (r2 != 0) goto L_0x00dc
            boolean r2 = com.android.launcher3.Utilities.ATLEAST_JB_MR2
            r3 = 0
            if (r2 == 0) goto L_0x003c
            com.android.launcher3.Launcher r2 = r0.mLauncher
            java.lang.String r4 = "user"
            java.lang.Object r2 = r2.getSystemService(r4)
            android.os.UserManager r2 = (android.os.UserManager) r2
            android.os.Bundle r2 = r2.getUserRestrictions()
            java.lang.String r4 = "no_modify_accounts"
            boolean r2 = r2.getBoolean(r4, r3)
            if (r2 != 0) goto L_0x00dc
        L_0x003c:
            com.android.launcher3.Launcher r2 = r0.mLauncher
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r4 = "skip_first_use_hints"
            int r2 = android.provider.Settings.Secure.getInt(r2, r4, r3)
            r4 = 1
            if (r2 == r4) goto L_0x00dc
            java.lang.String r2 = "cling_gel.workspace.dismissed"
            boolean r2 = r1.getBoolean(r2, r3)
            if (r2 != 0) goto L_0x00dc
            java.lang.String r2 = "cling_gel.migration.dismissed"
            boolean r1 = r1.getBoolean(r2, r3)
            if (r1 != 0) goto L_0x00dc
            r5.mClings = r0
            com.android.launcher3.LauncherModel r1 = r5.mModel
            boolean r1 = r1.mOldContentProviderExists
            if (r1 == 0) goto L_0x00d9
            com.google.android.apps.gsa.launcher.a.d r1 = r5.mLauncherCallbacks$ar$class_merging
            if (r1 == 0) goto L_0x0070
            com.android.launcher3.Launcher r1 = r1.f208805b
            boolean r1 = com.google.android.apps.gsa.shared.util.C90772bp.m148279F(r1)
            if (r1 != 0) goto L_0x00d9
            goto L_0x008a
        L_0x0070:
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            android.content.ComponentName r2 = r5.getComponentName()     // Catch:{ NameNotFoundException -> 0x0086 }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ NameNotFoundException -> 0x0086 }
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo(r2, r3)     // Catch:{ NameNotFoundException -> 0x0086 }
            int r1 = r1.flags     // Catch:{ NameNotFoundException -> 0x0086 }
            r1 = r1 & r4
            if (r1 == 0) goto L_0x008a
            goto L_0x00d9
        L_0x0086:
            r1 = move-exception
            r1.printStackTrace()
        L_0x008a:
            r0.mIsVisible = r4
            com.android.launcher3.Launcher r1 = r0.mLauncher
            com.android.launcher3.Workspace r2 = r1.mWorkspace
            r4 = 0
            if (r2 == 0) goto L_0x0096
            r2.setAlpha(r4)
        L_0x0096:
            com.android.launcher3.Hotseat r2 = r1.mHotseat
            if (r2 == 0) goto L_0x009d
            r2.setAlpha(r4)
        L_0x009d:
            android.view.View r2 = r1.mPageIndicators
            if (r2 == 0) goto L_0x00a4
            r2.setAlpha(r4)
        L_0x00a4:
            com.android.launcher3.SearchDropTargetBar r1 = r1.mSearchDropTargetBar
            if (r1 == 0) goto L_0x00ae
            com.android.launcher3.SearchDropTargetBar$State r2 = com.android.launcher3.SearchDropTargetBar.State.INVISIBLE
            r4 = 0
            r1.animateToState(r2, r3, r4)
        L_0x00ae:
            com.android.launcher3.Launcher r1 = r0.mLauncher
            android.view.View r1 = r1.mLauncherView
            r2 = 2131432700(0x7f0b14fc, float:1.8487165E38)
            android.view.View r1 = r1.findViewById(r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.LayoutInflater r2 = r0.mInflater
            r3 = 2131625982(0x7f0e07fe, float:1.8879187E38)
            android.view.View r1 = r2.inflate(r3, r1)
            r2 = 2131429732(0x7f0b0964, float:1.8481145E38)
            android.view.View r2 = r1.findViewById(r2)
            r2.setOnClickListener(r0)
            r2 = 2131429733(0x7f0b0965, float:1.8481147E38)
            android.view.View r1 = r1.findViewById(r2)
            r1.setOnClickListener(r0)
            return
        L_0x00d9:
            r0.showLongPressCling(r4)
        L_0x00dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.Launcher.showFirstRunClings():void");
    }

    public final void showOutOfSpaceMessage(boolean z) {
        Toast.makeText(this, getString(true != z ? R.string.out_of_space : R.string.hotseat_out_of_space), 0).show();
    }

    /* access modifiers changed from: package-private */
    public final void showOverviewMode$ar$ds$49c8ce8_0(boolean z) {
        C528823 r5 = z ? new Runnable() {
            public final void run() {
                Launcher.this.mOverviewPanel.requestFocusFromTouch();
            }
        } : null;
        this.mWorkspace.setVisibility(0);
        LauncherStateTransitionAnimation launcherStateTransitionAnimation = this.mStateTransitionAnimation;
        int i = this.mState$ar$edu$fb933cd0_0;
        Workspace.State state = this.mWorkspace.mState;
        launcherStateTransitionAnimation.startAnimationToWorkspace$ar$edu$ar$ds(i, Workspace.State.OVERVIEW, -1, true, r5);
        this.mState$ar$edu$fb933cd0_0 = 2;
    }

    /* access modifiers changed from: package-private */
    public final void showWidgetsView(boolean z, boolean z2) {
        if (z2) {
            this.mWidgetsView.scrollToTop();
        }
        showAppsOrWidgets$ar$edu$ar$ds(5, z, false);
        this.mWidgetsView.post(new Runnable() {
            public final void run() {
                Launcher.this.mWidgetsView.requestFocus();
            }
        });
    }

    public final boolean showWorkspace(int i, boolean z, Runnable runnable) {
        boolean z2 = (this.mState$ar$edu$fb933cd0_0 == 2 && this.mWorkspace.mState == Workspace.State.NORMAL) ? false : true;
        if (z2) {
            this.mWorkspace.setVisibility(0);
            LauncherStateTransitionAnimation launcherStateTransitionAnimation = this.mStateTransitionAnimation;
            int i2 = this.mState$ar$edu$fb933cd0_0;
            Workspace.State state = this.mWorkspace.mState;
            launcherStateTransitionAnimation.startAnimationToWorkspace$ar$edu$ar$ds(i2, Workspace.State.NORMAL, i, z, runnable);
            View view = this.mAllAppsButton;
            if (view != null) {
                view.requestFocus();
            }
        }
        this.mState$ar$edu$fb933cd0_0 = 2;
        this.mUserPresent = true;
        updateAutoAdvanceState();
        if (z2) {
            getWindow().getDecorView().sendAccessibilityEvent(32);
        }
        return z2;
    }

    public final boolean showWorkspace$ar$ds(Runnable runnable) {
        return showWorkspace(-1, true, runnable);
    }

    public final void startActivityForResult(Intent intent, int i) {
        onStartForResult(i);
        super.startActivityForResult(intent, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051 A[Catch:{ all -> 0x013a, SecurityException -> 0x003d }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[Catch:{ all -> 0x013a, SecurityException -> 0x003d }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060 A[Catch:{ all -> 0x013a, SecurityException -> 0x003d }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00dc A[Catch:{ all -> 0x013a, SecurityException -> 0x003d }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0100 A[Catch:{ all -> 0x013a, SecurityException -> 0x003d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean startActivitySafely(android.view.View r25, android.content.Intent r26, java.lang.Object r27) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            r2 = r26
            r3 = r27
            java.lang.String r4 = "android.permission.CALL_PHONE"
            java.lang.String r5 = "profile"
            java.lang.String r6 = "Launcher"
            java.lang.String r7 = " intent="
            java.lang.String r8 = "Launcher does not have the permission to launch "
            boolean r9 = r1.mIsSafeModeEnabled
            r10 = 0
            if (r9 == 0) goto L_0x0029
            boolean r9 = com.android.launcher3.Utilities.isSystemApp(r1, r2)
            if (r9 == 0) goto L_0x001e
            goto L_0x0029
        L_0x001e:
            r0 = 2132092030(0x7f15247e, float:1.9824445E38)
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r10)
            r0.show()
            return r10
        L_0x0029:
            r9 = 268435456(0x10000000, float:2.5243549E-29)
            r11 = 2132082904(0x7f1500d8, float:1.9805935E38)
            r2.addFlags(r9)     // Catch:{ ActivityNotFoundException -> 0x01a8 }
            if (r0 == 0) goto L_0x0040
            java.lang.String r12 = "com.android.launcher3.intent.extra.shortcut.INGORE_LAUNCH_ANIMATION"
            boolean r12 = r2.hasExtra(r12)     // Catch:{ SecurityException -> 0x003d }
            if (r12 != 0) goto L_0x0040
            r12 = 1
            goto L_0x0041
        L_0x003d:
            r0 = move-exception
            goto L_0x013f
        L_0x0040:
            r12 = 0
        L_0x0041:
            com.android.launcher3.compat.LauncherAppsCompat r13 = com.android.launcher3.compat.LauncherAppsCompat.getInstance(r24)     // Catch:{ SecurityException -> 0x003d }
            com.android.launcher3.compat.UserManagerCompat r14 = com.android.launcher3.compat.UserManagerCompat.getInstance(r24)     // Catch:{ SecurityException -> 0x003d }
            boolean r15 = r2.hasExtra(r5)     // Catch:{ SecurityException -> 0x003d }
            r16 = 0
            if (r15 == 0) goto L_0x005c
            r9 = -1
            long r9 = r2.getLongExtra(r5, r9)     // Catch:{ SecurityException -> 0x003d }
            com.android.launcher3.compat.UserHandleCompat r5 = r14.getUserForSerialNumber(r9)     // Catch:{ SecurityException -> 0x003d }
            goto L_0x005e
        L_0x005c:
            r5 = r16
        L_0x005e:
            if (r12 == 0) goto L_0x00c7
            boolean r9 = com.android.launcher3.Utilities.ATLEAST_MARSHMALLOW     // Catch:{ SecurityException -> 0x003d }
            if (r9 == 0) goto L_0x009e
            int r9 = r25.getMeasuredWidth()     // Catch:{ SecurityException -> 0x003d }
            int r10 = r25.getMeasuredHeight()     // Catch:{ SecurityException -> 0x003d }
            boolean r12 = r0 instanceof android.widget.TextView     // Catch:{ SecurityException -> 0x003d }
            if (r12 == 0) goto L_0x0097
            r12 = r0
            android.widget.TextView r12 = (android.widget.TextView) r12     // Catch:{ SecurityException -> 0x003d }
            android.graphics.drawable.Drawable r12 = com.android.launcher3.Workspace.getTextViewIcon(r12)     // Catch:{ SecurityException -> 0x003d }
            if (r12 == 0) goto L_0x0097
            android.graphics.Rect r10 = r12.getBounds()     // Catch:{ SecurityException -> 0x003d }
            int r12 = r10.width()     // Catch:{ SecurityException -> 0x003d }
            int r9 = r9 - r12
            int r9 = r9 / 2
            int r12 = r25.getPaddingTop()     // Catch:{ SecurityException -> 0x003d }
            int r14 = r10.width()     // Catch:{ SecurityException -> 0x003d }
            int r10 = r10.height()     // Catch:{ SecurityException -> 0x003d }
            r23 = r12
            r12 = r9
            r9 = r14
            r14 = r23
            goto L_0x0099
        L_0x0097:
            r12 = 0
            r14 = 0
        L_0x0099:
            android.app.ActivityOptions r9 = android.app.ActivityOptions.makeClipRevealAnimation(r0, r12, r14, r9, r10)     // Catch:{ SecurityException -> 0x003d }
            goto L_0x00c1
        L_0x009e:
            boolean r9 = com.android.launcher3.Utilities.ATLEAST_LOLLIPOP     // Catch:{ SecurityException -> 0x003d }
            if (r9 != 0) goto L_0x00b0
            int r9 = r25.getMeasuredWidth()     // Catch:{ SecurityException -> 0x003d }
            int r10 = r25.getMeasuredHeight()     // Catch:{ SecurityException -> 0x003d }
            r12 = 0
            android.app.ActivityOptions r9 = android.app.ActivityOptions.makeScaleUpAnimation(r0, r12, r12, r9, r10)     // Catch:{ SecurityException -> 0x003d }
            goto L_0x00c1
        L_0x00b0:
            boolean r9 = com.android.launcher3.Utilities.ATLEAST_LOLLIPOP_MR1     // Catch:{ SecurityException -> 0x003d }
            if (r9 == 0) goto L_0x00bf
            r9 = 2130772181(0x7f0100d5, float:1.7147473E38)
            r10 = 2130772123(0x7f01009b, float:1.7147356E38)
            android.app.ActivityOptions r9 = android.app.ActivityOptions.makeCustomAnimation(r1, r9, r10)     // Catch:{ SecurityException -> 0x003d }
            goto L_0x00c1
        L_0x00bf:
            r9 = r16
        L_0x00c1:
            if (r9 == 0) goto L_0x00c7
            android.os.Bundle r16 = r9.toBundle()     // Catch:{ SecurityException -> 0x003d }
        L_0x00c7:
            r9 = r16
            java.lang.Object r10 = r25.getTag()     // Catch:{ SecurityException -> 0x003d }
            boolean r10 = r10 instanceof com.android.launcher3.ShortcutInfo     // Catch:{ SecurityException -> 0x003d }
            if (r10 == 0) goto L_0x0100
            java.lang.Object r10 = r25.getTag()     // Catch:{ SecurityException -> 0x003d }
            com.android.launcher3.ShortcutInfo r10 = (com.android.launcher3.ShortcutInfo) r10     // Catch:{ SecurityException -> 0x003d }
            int r10 = r10.itemType     // Catch:{ SecurityException -> 0x003d }
            r12 = 6
            if (r10 != r12) goto L_0x0100
            java.lang.Object r0 = r25.getTag()     // Catch:{ SecurityException -> 0x003d }
            com.android.launcher3.ShortcutInfo r0 = (com.android.launcher3.ShortcutInfo) r0     // Catch:{ SecurityException -> 0x003d }
            java.lang.String r19 = r0.getDeepShortcutId()     // Catch:{ SecurityException -> 0x003d }
            java.lang.String r18 = r26.getPackage()     // Catch:{ SecurityException -> 0x003d }
            com.android.launcher3.LauncherAppState r5 = com.android.launcher3.LauncherAppState.getInstance()     // Catch:{ SecurityException -> 0x003d }
            com.android.launcher3.compat.DeepShortcutManagerCompat r5 = r5.mDeepShortcutManager     // Catch:{ SecurityException -> 0x003d }
            android.graphics.Rect r20 = r26.getSourceBounds()     // Catch:{ SecurityException -> 0x003d }
            com.android.launcher3.compat.UserHandleCompat r0 = r0.user     // Catch:{ SecurityException -> 0x003d }
            r17 = r5
            r21 = r9
            r22 = r0
            r17.startShortcut(r18, r19, r20, r21, r22)     // Catch:{ SecurityException -> 0x003d }
            goto L_0x0118
        L_0x0100:
            if (r5 == 0) goto L_0x011b
            com.android.launcher3.compat.UserHandleCompat r0 = com.android.launcher3.compat.UserHandleCompat.myUserHandle()     // Catch:{ SecurityException -> 0x003d }
            boolean r0 = r5.equals(r0)     // Catch:{ SecurityException -> 0x003d }
            if (r0 == 0) goto L_0x010d
            goto L_0x011b
        L_0x010d:
            android.content.ComponentName r0 = r26.getComponent()     // Catch:{ SecurityException -> 0x003d }
            android.graphics.Rect r10 = r26.getSourceBounds()     // Catch:{ SecurityException -> 0x003d }
            r13.startActivityForProfile(r0, r5, r10, r9)     // Catch:{ SecurityException -> 0x003d }
        L_0x0118:
            r10 = 1
            goto L_0x01d1
        L_0x011b:
            android.os.StrictMode$VmPolicy r5 = android.os.StrictMode.getVmPolicy()     // Catch:{ SecurityException -> 0x003d }
            android.os.StrictMode$VmPolicy$Builder r0 = new android.os.StrictMode$VmPolicy$Builder     // Catch:{ all -> 0x013a }
            r0.<init>()     // Catch:{ all -> 0x013a }
            android.os.StrictMode$VmPolicy$Builder r0 = r0.detectAll()     // Catch:{ all -> 0x013a }
            android.os.StrictMode$VmPolicy$Builder r0 = r0.penaltyLog()     // Catch:{ all -> 0x013a }
            android.os.StrictMode$VmPolicy r0 = r0.build()     // Catch:{ all -> 0x013a }
            android.os.StrictMode.setVmPolicy(r0)     // Catch:{ all -> 0x013a }
            r1.startActivity(r2, r9)     // Catch:{ all -> 0x013a }
            android.os.StrictMode.setVmPolicy(r5)     // Catch:{ SecurityException -> 0x003d }
            goto L_0x0118
        L_0x013a:
            r0 = move-exception
            android.os.StrictMode.setVmPolicy(r5)     // Catch:{ SecurityException -> 0x003d }
            throw r0     // Catch:{ SecurityException -> 0x003d }
        L_0x013f:
            boolean r5 = com.android.launcher3.Utilities.ATLEAST_MARSHMALLOW     // Catch:{ ActivityNotFoundException -> 0x01a8 }
            if (r5 == 0) goto L_0x0174
            boolean r5 = r3 instanceof com.android.launcher3.ItemInfo     // Catch:{ ActivityNotFoundException -> 0x01a8 }
            if (r5 == 0) goto L_0x0174
            android.content.ComponentName r5 = r26.getComponent()     // Catch:{ ActivityNotFoundException -> 0x01a8 }
            if (r5 != 0) goto L_0x0174
            java.lang.String r5 = "android.intent.action.CALL"
            java.lang.String r9 = r26.getAction()     // Catch:{ ActivityNotFoundException -> 0x01a8 }
            boolean r5 = r5.equals(r9)     // Catch:{ ActivityNotFoundException -> 0x01a8 }
            if (r5 == 0) goto L_0x0174
            int r5 = r1.checkSelfPermission(r4)     // Catch:{ ActivityNotFoundException -> 0x01a8 }
            if (r5 == 0) goto L_0x0174
            r0 = r3
            com.android.launcher3.ItemInfo r0 = (com.android.launcher3.ItemInfo) r0     // Catch:{ ActivityNotFoundException -> 0x01a8 }
            r5 = 13
            r8 = 0
            com.android.launcher3.Launcher$PendingAddArguments r0 = preparePendingAddArgs$ar$ds(r5, r2, r8, r0)     // Catch:{ ActivityNotFoundException -> 0x01a8 }
            sPendingAddItem = r0     // Catch:{ ActivityNotFoundException -> 0x01a8 }
            r9 = 1
            java.lang.String[] r0 = new java.lang.String[r9]     // Catch:{ ActivityNotFoundException -> 0x01a8 }
            r0[r8] = r4     // Catch:{ ActivityNotFoundException -> 0x01a8 }
            r1.requestPermissions(r0, r5)     // Catch:{ ActivityNotFoundException -> 0x01a8 }
            goto L_0x01d0
        L_0x0174:
            r4 = 0
            android.widget.Toast r5 = android.widget.Toast.makeText(r1, r11, r4)     // Catch:{ ActivityNotFoundException -> 0x01a6 }
            r5.show()     // Catch:{ ActivityNotFoundException -> 0x01a8 }
            java.lang.String r4 = java.lang.String.valueOf(r26)     // Catch:{ ActivityNotFoundException -> 0x01a8 }
            java.lang.String r5 = java.lang.String.valueOf(r27)     // Catch:{ ActivityNotFoundException -> 0x01a8 }
            java.lang.String r9 = java.lang.String.valueOf(r26)     // Catch:{ ActivityNotFoundException -> 0x01a8 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ActivityNotFoundException -> 0x01a8 }
            r10.<init>(r8)     // Catch:{ ActivityNotFoundException -> 0x01a8 }
            r10.append(r4)     // Catch:{ ActivityNotFoundException -> 0x01a8 }
            java.lang.String r4 = ". Make sure to create a MAIN intent-filter for the corresponding activity or use the exported attribute for this activity. tag="
            r10.append(r4)     // Catch:{ ActivityNotFoundException -> 0x01a8 }
            r10.append(r5)     // Catch:{ ActivityNotFoundException -> 0x01a8 }
            r10.append(r7)     // Catch:{ ActivityNotFoundException -> 0x01a8 }
            r10.append(r9)     // Catch:{ ActivityNotFoundException -> 0x01a8 }
            java.lang.String r4 = r10.toString()     // Catch:{ ActivityNotFoundException -> 0x01a8 }
            android.util.Log.e(r6, r4, r0)     // Catch:{ ActivityNotFoundException -> 0x01a8 }
            goto L_0x01d0
        L_0x01a6:
            r0 = move-exception
            goto L_0x01aa
        L_0x01a8:
            r0 = move-exception
            r4 = 0
        L_0x01aa:
            android.widget.Toast r5 = android.widget.Toast.makeText(r1, r11, r4)
            r5.show()
            java.lang.String r3 = java.lang.String.valueOf(r27)
            java.lang.String r2 = java.lang.String.valueOf(r26)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "Unable to launch. tag="
            r5.<init>(r8)
            r5.append(r3)
            r5.append(r7)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            android.util.Log.e(r6, r2, r0)
        L_0x01d0:
            r10 = 0
        L_0x01d1:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.Launcher.startActivitySafely(android.view.View, android.content.Intent, java.lang.Object):boolean");
    }

    /* access modifiers changed from: package-private */
    public final void startAppShortcutOrInfoActivity(View view) {
        Intent intent;
        ShortcutInfo shortcutInfo;
        Object tag = view.getTag();
        if (tag instanceof ShortcutInfo) {
            shortcutInfo = (ShortcutInfo) tag;
            intent = shortcutInfo.intent;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            intent.setSourceBounds(new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight()));
        } else if (tag instanceof AppInfo) {
            intent = ((AppInfo) tag).intent;
            shortcutInfo = null;
        } else {
            throw new IllegalArgumentException("Input must be a Shortcut or AppInfo");
        }
        boolean startActivitySafely = startActivitySafely(view, intent, tag);
        Stats stats = this.mStats;
        Intent intent2 = new Intent(intent);
        intent2.setSourceBounds((Rect) null);
        Intent putExtra = new Intent("com.android.launcher3.action.LAUNCH").putExtra("intent", intent2.toUri(0));
        if (shortcutInfo != null) {
            putExtra.putExtra("container", shortcutInfo.container).putExtra("screen", shortcutInfo.screenId).putExtra("cellX", shortcutInfo.cellX).putExtra("cellY", shortcutInfo.cellY);
        }
        Bundle bundle = new Bundle();
        bundle.putString("container", "homescreen");
        bundle.putInt("container_page", 0);
        bundle.putInt("sub_container_page", 0);
        Stats.LaunchSourceUtils.populateSourceDataFromAncestorProvider(view, bundle);
        putExtra.putExtra("source", bundle);
        for (String str : stats.mLauncher.getResources().getStringArray(R.array.launch_broadcast_targets)) {
            putExtra.setPackage(str);
            stats.mLauncher.sendBroadcast(putExtra, stats.mLaunchBroadcastPermission);
        }
        if (startActivitySafely && (view instanceof BubbleTextView)) {
            BubbleTextView bubbleTextView = (BubbleTextView) view;
            this.mWaitingForResume = bubbleTextView;
            bubbleTextView.setStayPressed(true);
        }
    }

    /* access modifiers changed from: package-private */
    public final void startApplicationDetailsActivity(ComponentName componentName, UserHandleCompat userHandleCompat) {
        try {
            LauncherAppsCompat.getInstance(this).showAppDetailsForProfile(componentName, userHandleCompat);
        } catch (SecurityException unused) {
            Toast.makeText(this, R.string.activity_not_found, 0).show();
            Log.e("Launcher", "Launcher does not have permission to launch settings");
        } catch (ActivityNotFoundException unused2) {
            Toast.makeText(this, R.string.activity_not_found, 0).show();
            Log.e("Launcher", "Unable to launch settings");
        }
    }

    public final void startBinding() {
        this.mWorkspaceLoading = true;
        this.mBindOnResumeCallbacks.clear();
        Workspace workspace = this.mWorkspace;
        workspace.mapOverItems(false, new Workspace.ItemOperator() {
            public final boolean evaluate(ItemInfo itemInfo, View view, View view2) {
                if (!(view instanceof DropTarget)) {
                    return false;
                }
                Workspace.this.mDragController.mDropTargets.remove((DropTarget) view);
                return false;
            }
        });
        this.mWorkspace.removeAllWorkspaceScreens();
        this.mWidgetsToAdvance.clear();
        Hotseat hotseat = this.mHotseat;
        if (hotseat != null) {
            hotseat.resetLayout();
        }
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        onStartForResult(i);
        try {
            super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } catch (IntentSender.SendIntentException unused) {
            throw new ActivityNotFoundException();
        }
    }

    public final void startSearch(String str, boolean z, Bundle bundle, boolean z2) {
        if (str == null) {
            str = this.mDefaultKeySsb.toString();
        }
        if (bundle == null) {
            bundle = new Bundle();
            bundle.putString("source", "launcher-search");
        }
        Rect rect = new Rect();
        SearchDropTargetBar searchDropTargetBar = this.mSearchDropTargetBar;
        if (searchDropTargetBar != null) {
            View view = searchDropTargetBar.mQSB;
            if (view != null) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                rect = new Rect();
                rect.left = iArr[0];
                rect.top = iArr[1];
                rect.right = iArr[0] + searchDropTargetBar.mQSB.getWidth();
                rect.bottom = iArr[1] + searchDropTargetBar.mQSB.getHeight();
            } else {
                rect = null;
            }
        }
        startGlobalSearch(str, z, bundle, rect);
        showWorkspace(-1, true, (Runnable) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: android.animation.ValueAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: com.android.launcher3.LauncherViewPropertyAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: android.animation.ValueAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: android.animation.ValueAnimator} */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01b2, code lost:
        if (r19 != false) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01b7, code lost:
        if (r6 != r4) goto L_0x01be;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator startWorkspaceStateChangeAnimation(com.android.launcher3.Workspace.State r28, int r29, boolean r30, java.util.HashMap r31) {
        /*
            r27 = this;
            r0 = r28
            r1 = r27
            r2 = r31
            com.android.launcher3.Workspace r3 = r1.mWorkspace
            com.android.launcher3.Workspace$State r4 = r3.mState
            r3.mState = r0
            com.android.launcher3.WorkspaceStateTransitionAnimation r5 = r3.mStateTransitionAnimation
            com.android.launcher3.Launcher r6 = r5.mLauncher
            java.lang.String r7 = "accessibility"
            java.lang.Object r6 = r6.getSystemService(r7)
            android.view.accessibility.AccessibilityManager r6 = (android.view.accessibility.AccessibilityManager) r6
            boolean r6 = r6.isEnabled()
            com.android.launcher3.Workspace$State r7 = com.android.launcher3.Workspace.State.NORMAL
            if (r4 != r7) goto L_0x0022
            r7 = 1
            goto L_0x0023
        L_0x0022:
            r7 = 0
        L_0x0023:
            com.android.launcher3.Workspace$State r10 = com.android.launcher3.Workspace.State.OVERVIEW
            if (r4 != r10) goto L_0x0029
            r11 = 1
            goto L_0x002a
        L_0x0029:
            r11 = 0
        L_0x002a:
            com.android.launcher3.Workspace$State r12 = com.android.launcher3.Workspace.State.NORMAL
            if (r0 != r12) goto L_0x0030
            r12 = 1
            goto L_0x0031
        L_0x0030:
            r12 = 0
        L_0x0031:
            com.android.launcher3.Workspace$State r13 = com.android.launcher3.Workspace.State.SPRING_LOADED
            if (r0 != r13) goto L_0x0037
            r13 = 1
            goto L_0x0038
        L_0x0037:
            r13 = 0
        L_0x0038:
            com.android.launcher3.Workspace$State r14 = com.android.launcher3.Workspace.State.NORMAL_HIDDEN
            if (r0 != r14) goto L_0x003e
            r14 = 1
            goto L_0x003f
        L_0x003e:
            r14 = 0
        L_0x003f:
            com.android.launcher3.Workspace$State r15 = com.android.launcher3.Workspace.State.OVERVIEW_HIDDEN
            if (r0 != r15) goto L_0x0045
            r15 = 1
            goto L_0x0046
        L_0x0045:
            r15 = 0
        L_0x0046:
            if (r0 != r10) goto L_0x004a
            r10 = 1
            goto L_0x004b
        L_0x004a:
            r10 = 0
        L_0x004b:
            if (r7 == 0) goto L_0x0052
            if (r10 == 0) goto L_0x0052
            r16 = 1
            goto L_0x0054
        L_0x0052:
            r16 = 0
        L_0x0054:
            if (r7 == 0) goto L_0x005a
            if (r14 == 0) goto L_0x005a
            r7 = 1
            goto L_0x005b
        L_0x005a:
            r7 = 0
        L_0x005b:
            if (r11 == 0) goto L_0x0062
            if (r12 == 0) goto L_0x0062
            r17 = 1
            goto L_0x0064
        L_0x0062:
            r17 = 0
        L_0x0064:
            if (r11 == 0) goto L_0x006b
            if (r15 == 0) goto L_0x006b
            r18 = 1
            goto L_0x006d
        L_0x006b:
            r18 = 0
        L_0x006d:
            if (r14 == 0) goto L_0x0074
            if (r12 == 0) goto L_0x0074
            r19 = 1
            goto L_0x0076
        L_0x0074:
            r19 = 0
        L_0x0076:
            if (r7 != 0) goto L_0x0086
            if (r18 == 0) goto L_0x007b
            goto L_0x0086
        L_0x007b:
            if (r16 != 0) goto L_0x0083
            if (r17 == 0) goto L_0x0080
            goto L_0x0083
        L_0x0080:
            int r9 = r5.mOverlayTransitionTime
            goto L_0x0088
        L_0x0083:
            int r9 = r5.mOverviewTransitionTime
            goto L_0x0088
        L_0x0086:
            int r9 = r5.mAllAppsTransitionTime
        L_0x0088:
            com.android.launcher3.Workspace r8 = r5.mWorkspace
            int r8 = r8.getChildCount()
            r1 = -1
            if (r8 == r1) goto L_0x00a1
            float[] r1 = new float[r8]
            r5.mOldBackgroundAlphas = r1
            float[] r1 = new float[r8]
            r5.mOldAlphas = r1
            float[] r1 = new float[r8]
            r5.mNewBackgroundAlphas = r1
            float[] r1 = new float[r8]
            r5.mNewAlphas = r1
        L_0x00a1:
            android.animation.AnimatorSet r1 = r5.mStateAnimator
            r8 = r3
            r20 = r4
            if (r1 == 0) goto L_0x00b2
            r3 = 0
            r1.setDuration(r3)
            android.animation.AnimatorSet r1 = r5.mStateAnimator
            r1.cancel()
        L_0x00b2:
            r1 = 0
            r5.mStateAnimator = r1
            if (r30 == 0) goto L_0x00bd
            android.animation.AnimatorSet r3 = com.android.launcher3.LauncherAnimUtils.createAnimatorSet()
            r5.mStateAnimator = r3
        L_0x00bd:
            if (r13 != 0) goto L_0x00c4
            if (r10 == 0) goto L_0x00c2
            goto L_0x00c4
        L_0x00c2:
            r1 = 0
            goto L_0x00c6
        L_0x00c4:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x00c6:
            if (r12 != 0) goto L_0x00cf
            if (r13 == 0) goto L_0x00cb
            goto L_0x00cf
        L_0x00cb:
            r4 = 1
            r21 = 0
            goto L_0x00d2
        L_0x00cf:
            r4 = 1
            r21 = 1065353216(0x3f800000, float:1.0)
        L_0x00d2:
            if (r4 == r10) goto L_0x00d6
            r4 = 0
            goto L_0x00d8
        L_0x00d6:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x00d8:
            if (r10 != 0) goto L_0x00e9
            if (r15 == 0) goto L_0x00dd
            goto L_0x00e9
        L_0x00dd:
            r25 = r1
            r23 = r4
            r24 = r6
            r26 = r7
            r22 = r8
            r0 = 0
            goto L_0x0142
        L_0x00e9:
            com.android.launcher3.Workspace r3 = r5.mWorkspace
            r22 = r8
            com.android.launcher3.Launcher r8 = r3.mLauncher
            com.android.launcher3.DeviceProfile r8 = r8.mDeviceProfile
            android.content.res.Resources r23 = r3.getResources()
            boolean r0 = com.android.launcher3.Utilities.isRtl(r23)
            android.graphics.Rect r0 = r8.getWorkspacePadding(r0)
            int r8 = r8.getOverviewModeButtonBarHeight()
            r23 = r4
            float r4 = r3.mOverviewModeShrinkFactor
            r24 = r6
            int r6 = r3.mNormalChildHeight
            float r6 = (float) r6
            float r4 = r4 * r6
            int r4 = (int) r4
            android.graphics.Rect r6 = r3.mInsets
            int r6 = r6.top
            int r2 = r0.top
            int r6 = r6 + r2
            android.graphics.Rect r2 = r3.mViewport
            int r2 = r2.height()
            r25 = r1
            android.graphics.Rect r1 = r3.mInsets
            int r1 = r1.bottom
            int r0 = r0.bottom
            r26 = r7
            android.graphics.Rect r7 = r3.mInsets
            int r7 = r7.top
            int r2 = r2 - r1
            int r2 = r2 - r0
            int r2 = r2 - r6
            int r2 = r2 - r4
            r0 = 2
            int r2 = r2 / r0
            int r6 = r6 + r2
            int r1 = -r6
            android.graphics.Rect r2 = r3.mViewport
            int r2 = r2.height()
            android.graphics.Rect r3 = r3.mInsets
            int r3 = r3.bottom
            int r2 = r2 - r3
            int r2 = r2 - r8
            int r2 = r2 - r7
            int r2 = r2 - r4
            int r2 = r2 / r0
            int r7 = r7 + r2
            int r1 = r1 + r7
            float r0 = (float) r1
        L_0x0142:
            com.android.launcher3.Workspace r1 = r5.mWorkspace
            int r1 = r1.getChildCount()
            com.android.launcher3.Workspace r2 = r5.mWorkspace
            int r2 = r2.numCustomPages()
            r3 = 1065353216(0x3f800000, float:1.0)
            r5.mNewScale = r3
            if (r11 == 0) goto L_0x015b
            com.android.launcher3.Workspace r4 = r5.mWorkspace
            r6 = 0
            r4.setEnableFreeScroll(r6)
            goto L_0x0162
        L_0x015b:
            if (r10 == 0) goto L_0x0162
            com.android.launcher3.Workspace r4 = r5.mWorkspace
            r4.enableFreeScroll$ar$ds()
        L_0x0162:
            if (r12 != 0) goto L_0x0173
            if (r13 == 0) goto L_0x016b
            float r4 = r5.mSpringLoadedShrinkFactor
            r5.mNewScale = r4
            goto L_0x0173
        L_0x016b:
            if (r10 != 0) goto L_0x016f
            if (r15 == 0) goto L_0x0173
        L_0x016f:
            float r4 = r5.mOverviewModeShrinkFactor
            r5.mNewScale = r4
        L_0x0173:
            r4 = r29
            r6 = -1
            if (r4 != r6) goto L_0x017e
            com.android.launcher3.Workspace r4 = r5.mWorkspace
            int r4 = r4.getPageNearestToCenterOfScreen()
        L_0x017e:
            com.android.launcher3.Workspace r6 = r5.mWorkspace
            com.android.launcher3.ZoomInInterpolator r7 = r5.mZoomInInterpolator
            r8 = 0
            r6.snapToPage(r4, r9, r8, r7)
            r6 = 0
        L_0x0187:
            if (r6 >= r1) goto L_0x01ed
            com.android.launcher3.Workspace r7 = r5.mWorkspace
            android.view.View r7 = r7.getChildAt(r6)
            com.android.launcher3.CellLayout r7 = (com.android.launcher3.CellLayout) r7
            com.android.launcher3.ShortcutAndWidgetContainer r8 = r7.mShortcutsAndWidgets
            float r8 = r8.getAlpha()
            if (r14 != 0) goto L_0x01a9
            if (r15 == 0) goto L_0x019c
            goto L_0x01a9
        L_0x019c:
            if (r12 == 0) goto L_0x01a6
            boolean r10 = r5.mWorkspaceFadeInAdjacentScreens
            if (r10 == 0) goto L_0x01a6
            if (r6 == r4) goto L_0x01a6
            if (r6 >= r2) goto L_0x01a9
        L_0x01a6:
            r10 = 1065353216(0x3f800000, float:1.0)
            goto L_0x01aa
        L_0x01a9:
            r10 = 0
        L_0x01aa:
            com.android.launcher3.Workspace r11 = r5.mWorkspace
            boolean r11 = r11.mIsSwitchingState
            if (r11 != 0) goto L_0x01c5
            if (r26 != 0) goto L_0x01b5
            if (r19 == 0) goto L_0x01c5
            goto L_0x01ba
        L_0x01b5:
            if (r19 != 0) goto L_0x01ba
            if (r6 == r4) goto L_0x01c0
            goto L_0x01be
        L_0x01ba:
            if (r6 != r4) goto L_0x01be
            r8 = 0
            goto L_0x01c0
        L_0x01be:
            r8 = 0
            r10 = 0
        L_0x01c0:
            com.android.launcher3.ShortcutAndWidgetContainer r11 = r7.mShortcutsAndWidgets
            r11.setAlpha(r8)
        L_0x01c5:
            float[] r11 = r5.mOldAlphas
            r11[r6] = r8
            float[] r8 = r5.mNewAlphas
            r8[r6] = r10
            if (r30 == 0) goto L_0x01de
            float[] r8 = r5.mOldBackgroundAlphas
            float r7 = r7.getBackgroundAlpha()
            r8[r6] = r7
            float[] r7 = r5.mNewBackgroundAlphas
            r7[r6] = r25
            r8 = r25
            goto L_0x01e8
        L_0x01de:
            r8 = r25
            r7.setBackgroundAlpha(r8)
            com.android.launcher3.ShortcutAndWidgetContainer r7 = r7.mShortcutsAndWidgets
            r7.setAlpha(r10)
        L_0x01e8:
            int r6 = r6 + 1
            r25 = r8
            goto L_0x0187
        L_0x01ed:
            com.android.launcher3.Launcher r2 = r5.mLauncher
            android.view.ViewGroup r3 = r2.mOverviewPanel
            com.android.launcher3.Hotseat r2 = r2.mHotseat
            com.android.launcher3.Workspace r4 = r5.mWorkspace
            com.android.launcher3.PageIndicator r6 = r4.mPageIndicator
            if (r30 == 0) goto L_0x0378
            com.android.launcher3.LauncherViewPropertyAnimator r7 = new com.android.launcher3.LauncherViewPropertyAnimator
            r7.<init>(r4)
            float r4 = r5.mNewScale
            r7.scaleX$ar$ds(r4)
            float r4 = r5.mNewScale
            r7.scaleY$ar$ds(r4)
            r7.translationY$ar$ds$a88e89b9_0(r0)
            long r8 = (long) r9
            r7.setDuration(r8)
            com.android.launcher3.ZoomInInterpolator r0 = r5.mZoomInInterpolator
            r7.setInterpolator(r0)
            android.animation.AnimatorSet r0 = r5.mStateAnimator
            r0.play(r7)
            r0 = 0
        L_0x021a:
            if (r0 >= r1) goto L_0x02c1
            com.android.launcher3.Workspace r4 = r5.mWorkspace
            android.view.View r4 = r4.getChildAt(r0)
            com.android.launcher3.CellLayout r4 = (com.android.launcher3.CellLayout) r4
            com.android.launcher3.ShortcutAndWidgetContainer r7 = r4.mShortcutsAndWidgets
            float r7 = r7.getAlpha()
            float[] r10 = r5.mOldAlphas
            r10 = r10[r0]
            r11 = 0
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x024f
            float[] r10 = r5.mNewAlphas
            r10 = r10[r0]
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x024f
            float[] r7 = r5.mNewBackgroundAlphas
            r7 = r7[r0]
            r4.setBackgroundAlpha(r7)
            float[] r7 = r5.mNewAlphas
            r7 = r7[r0]
            com.android.launcher3.ShortcutAndWidgetContainer r4 = r4.mShortcutsAndWidgets
            r4.setAlpha(r7)
            r10 = r31
            r11 = 0
            goto L_0x02bd
        L_0x024f:
            r10 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r10 = r31
            r10.put(r4, r11)
            float[] r11 = r5.mOldAlphas
            r11 = r11[r0]
            float[] r13 = r5.mNewAlphas
            r13 = r13[r0]
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x0269
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x0284
        L_0x0269:
            com.android.launcher3.LauncherViewPropertyAnimator r7 = new com.android.launcher3.LauncherViewPropertyAnimator
            com.android.launcher3.ShortcutAndWidgetContainer r11 = r4.mShortcutsAndWidgets
            r7.<init>(r11)
            float[] r11 = r5.mNewAlphas
            r11 = r11[r0]
            r7.alpha$ar$ds$936767f9_0(r11)
            r7.setDuration(r8)
            com.android.launcher3.ZoomInInterpolator r11 = r5.mZoomInInterpolator
            r7.setInterpolator(r11)
            android.animation.AnimatorSet r11 = r5.mStateAnimator
            r11.play(r7)
        L_0x0284:
            float[] r7 = r5.mOldBackgroundAlphas
            r7 = r7[r0]
            r11 = 0
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0295
            float[] r13 = r5.mNewBackgroundAlphas
            r13 = r13[r0]
            int r13 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x02bd
        L_0x0295:
            r13 = 2
            float[] r14 = new float[r13]
            r15 = 0
            r14[r15] = r7
            float[] r7 = r5.mNewBackgroundAlphas
            r7 = r7[r0]
            r15 = 1
            r14[r15] = r7
            java.lang.String r7 = "backgroundAlpha"
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r4, r7, r14)
            float[] r7 = new float[r13]
            r7 = {0, 1065353216} // fill-array
            com.android.launcher3.LauncherAnimUtils.ofFloat$ar$ds(r7)
            com.android.launcher3.ZoomInInterpolator r7 = r5.mZoomInInterpolator
            r4.setInterpolator(r7)
            r4.setDuration(r8)
            android.animation.AnimatorSet r7 = r5.mStateAnimator
            r7.play(r4)
        L_0x02bd:
            int r0 = r0 + 1
            goto L_0x021a
        L_0x02c1:
            r10 = r31
            r11 = 0
            if (r6 == 0) goto L_0x02e4
            com.android.launcher3.LauncherViewPropertyAnimator r0 = new com.android.launcher3.LauncherViewPropertyAnimator
            r0.<init>(r6)
            r4 = r21
            r0.alpha$ar$ds$936767f9_0(r4)
            java.util.EnumSet r1 = r0.mPropertiesToSet
            com.android.launcher3.LauncherViewPropertyAnimator$Properties r7 = com.android.launcher3.LauncherViewPropertyAnimator.Properties.WITH_LAYER
            r1.add(r7)
            com.android.launcher3.AlphaUpdateListener r1 = new com.android.launcher3.AlphaUpdateListener
            r7 = r24
            r1.<init>(r6, r7)
            java.util.ArrayList r6 = r0.mListeners
            r6.add(r1)
            goto L_0x02f2
        L_0x02e4:
            r4 = r21
            r7 = r24
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {0, 0} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r1)
        L_0x02f2:
            com.android.launcher3.LauncherViewPropertyAnimator r1 = new com.android.launcher3.LauncherViewPropertyAnimator
            r1.<init>(r2)
            r1.alpha$ar$ds$936767f9_0(r4)
            com.android.launcher3.AlphaUpdateListener r4 = new com.android.launcher3.AlphaUpdateListener
            r4.<init>(r2, r7)
            java.util.ArrayList r6 = r1.mListeners
            r6.add(r4)
            com.android.launcher3.LauncherViewPropertyAnimator r4 = new com.android.launcher3.LauncherViewPropertyAnimator
            r4.<init>(r3)
            r13 = r23
            r4.alpha$ar$ds$936767f9_0(r13)
            com.android.launcher3.AlphaUpdateListener r6 = new com.android.launcher3.AlphaUpdateListener
            r6.<init>(r3, r7)
            java.util.ArrayList r13 = r4.mListeners
            r13.add(r6)
            r6 = 0
            r13 = 2
            r2.setLayerType(r13, r6)
            r3.setLayerType(r13, r6)
            r6 = 1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            r10.put(r2, r13)
            r10.put(r3, r13)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r16 == 0) goto L_0x0344
            android.view.animation.DecelerateInterpolator r6 = new android.view.animation.DecelerateInterpolator
            r6.<init>(r2)
            r0.setInterpolator(r6)
            android.view.animation.DecelerateInterpolator r6 = new android.view.animation.DecelerateInterpolator
            r6.<init>(r2)
            r1.setInterpolator(r6)
            r6 = 0
            r4.setInterpolator(r6)
            goto L_0x0355
        L_0x0344:
            r6 = 0
            if (r17 == 0) goto L_0x0355
            r0.setInterpolator(r6)
            r1.setInterpolator(r6)
            android.view.animation.DecelerateInterpolator r6 = new android.view.animation.DecelerateInterpolator
            r6.<init>(r2)
            r4.setInterpolator(r6)
        L_0x0355:
            r4.setDuration(r8)
            r0.setDuration(r8)
            r1.setDuration(r8)
            android.animation.AnimatorSet r2 = r5.mStateAnimator
            r2.play(r4)
            android.animation.AnimatorSet r2 = r5.mStateAnimator
            r2.play(r1)
            android.animation.AnimatorSet r1 = r5.mStateAnimator
            r1.play(r0)
            android.animation.AnimatorSet r0 = r5.mStateAnimator
            com.android.launcher3.WorkspaceStateTransitionAnimation$1 r1 = new com.android.launcher3.WorkspaceStateTransitionAnimation$1
            r1.<init>(r7, r3)
            r0.addListener(r1)
            goto L_0x03d7
        L_0x0378:
            r4 = r21
            r13 = r23
            r7 = r24
            r11 = 0
            r3.setAlpha(r13)
            com.android.launcher3.AlphaUpdateListener.updateVisibility(r3, r7)
            r2.setAlpha(r4)
            com.android.launcher3.AlphaUpdateListener.updateVisibility(r2, r7)
            if (r6 == 0) goto L_0x0393
            r6.setAlpha(r4)
            com.android.launcher3.AlphaUpdateListener.updateVisibility(r6, r7)
        L_0x0393:
            com.android.launcher3.Workspace r1 = r5.mWorkspace
            com.android.launcher3.Workspace$State r2 = r1.mState
            com.android.launcher3.Workspace$State r4 = com.android.launcher3.Workspace.State.NORMAL
            if (r2 != r4) goto L_0x039d
            r2 = 0
            goto L_0x039e
        L_0x039d:
            r2 = 4
        L_0x039e:
            boolean r4 = r1.hasCustomContent()
            if (r4 == 0) goto L_0x03b1
            com.android.launcher3.util.LongArrayMap r1 = r1.mWorkspaceScreens
            r8 = -301(0xfffffffffffffed3, double:NaN)
            java.lang.Object r1 = r1.get(r8)
            com.android.launcher3.CellLayout r1 = (com.android.launcher3.CellLayout) r1
            r1.setVisibility(r2)
        L_0x03b1:
            com.android.launcher3.Workspace r1 = r5.mWorkspace
            float r2 = r5.mNewScale
            r1.setScaleX(r2)
            com.android.launcher3.Workspace r1 = r5.mWorkspace
            float r2 = r5.mNewScale
            r1.setScaleY(r2)
            com.android.launcher3.Workspace r1 = r5.mWorkspace
            r1.setTranslationY(r0)
            if (r7 == 0) goto L_0x03d7
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x03d7
            r0 = 0
            android.view.View r1 = r3.getChildAt(r0)
            r0 = 64
            r2 = 0
            r1.performAccessibilityAction(r0, r2)
        L_0x03d7:
            com.android.launcher3.Launcher r0 = r5.mLauncher
            com.android.launcher3.DragLayer r0 = r0.mDragLayer
            float r1 = r0.mBackgroundAlpha
            if (r12 == 0) goto L_0x03e1
            r4 = 0
            goto L_0x03e3
        L_0x03e1:
            float r4 = r5.mWorkspaceScrimAlpha
        L_0x03e3:
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 == 0) goto L_0x041b
            if (r30 == 0) goto L_0x0415
            com.android.launcher3.Workspace r2 = r5.mWorkspace
            r2 = 2
            float[] r2 = new float[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r4
            android.animation.ValueAnimator r2 = com.android.launcher3.LauncherAnimUtils.ofFloat$ar$ds(r2)
            com.android.launcher3.WorkspaceStateTransitionAnimation$2 r4 = new com.android.launcher3.WorkspaceStateTransitionAnimation$2
            r4.<init>()
            r2.addUpdateListener(r4)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r4 = 1069547520(0x3fc00000, float:1.5)
            r0.<init>(r4)
            r2.setInterpolator(r0)
            r6 = 350(0x15e, double:1.73E-321)
            r2.setDuration(r6)
            android.animation.AnimatorSet r0 = r5.mStateAnimator
            r0.play(r2)
            goto L_0x041d
        L_0x0415:
            r1 = 1
            r3 = 0
            r0.setBackgroundAlpha(r4)
            goto L_0x041d
        L_0x041b:
            r1 = 1
            r3 = 0
        L_0x041d:
            android.animation.AnimatorSet r0 = r5.mStateAnimator
            r2 = r20
            boolean r2 = r2.shouldUpdateWidget
            if (r2 != 0) goto L_0x042d
            r2 = r28
            boolean r2 = r2.shouldUpdateWidget
            if (r2 == 0) goto L_0x042d
            r8 = 1
            goto L_0x042e
        L_0x042d:
            r8 = 0
        L_0x042e:
            r22.updateAccessibilityFlags()
            if (r8 == 0) goto L_0x043a
            r1 = r22
            com.android.launcher3.Launcher r1 = r1.mLauncher
            r1.notifyWidgetProvidersChanged()
        L_0x043a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.Launcher.startWorkspaceStateChangeAnimation(com.android.launcher3.Workspace$State, int, boolean, java.util.HashMap):android.animation.Animator");
    }

    public final void unlockScreenOrientation(boolean z) {
        if (!this.mRotationEnabled) {
            return;
        }
        if (z) {
            setRequestedOrientation(-1);
        } else {
            this.mHandler.postDelayed(new Runnable() {
                public final void run() {
                    Launcher.this.setRequestedOrientation(-1);
                }
            }, 500);
        }
    }

    /* access modifiers changed from: package-private */
    public final void updateAutoAdvanceState() {
        boolean z = this.mVisible && this.mUserPresent && !this.mWidgetsToAdvance.isEmpty();
        if (z != this.mAutoAdvanceRunning) {
            this.mAutoAdvanceRunning = z;
            long j = 20000;
            if (z) {
                long j2 = this.mAutoAdvanceTimeLeft;
                if (j2 != -1) {
                    j = j2;
                }
                sendAdvanceMessage(j);
                return;
            }
            if (!this.mWidgetsToAdvance.isEmpty()) {
                this.mAutoAdvanceTimeLeft = Math.max(0, 20000 - (System.currentTimeMillis() - this.mAutoAdvanceSentTime));
            }
            this.mHandler.removeMessages(1);
            this.mHandler.removeMessages(0);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean waitUntilResume(Runnable runnable, boolean z) {
        if (!this.mPaused) {
            return false;
        }
        if (z) {
            do {
            } while (this.mBindOnResumeCallbacks.remove(runnable));
        }
        this.mBindOnResumeCallbacks.add(runnable);
        return true;
    }

    private final void setWorkspaceBackground(int i) {
        if (i == 1) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        } else if (i != 2) {
            getWindow().setBackgroundDrawable(this.mWorkspaceBackgroundDrawable);
        } else {
            getWindow().setBackgroundDrawable((Drawable) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final View createShortcut(ShortcutInfo shortcutInfo) {
        Workspace workspace = this.mWorkspace;
        return createShortcut((ViewGroup) workspace.getChildAt(workspace.mCurrentPage), shortcutInfo);
    }

    public final void closeFolder(boolean z) {
        Workspace workspace = this.mWorkspace;
        Folder openFolder = workspace != null ? workspace.getOpenFolder() : null;
        if (openFolder != null) {
            if (openFolder.mIsEditingName) {
                openFolder.dismissEditingName();
            }
            closeFolder(openFolder, z);
        }
    }
}
