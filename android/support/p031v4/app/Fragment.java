package android.support.p031v4.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p031v4.app.FragmentManager;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.C0815b;
import androidx.activity.result.C0816c;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.p046a.C0809b;
import androidx.core.app.C1783a;
import androidx.core.app.C1812bb;
import androidx.lifecycle.C2332ag;
import androidx.lifecycle.C2354bb;
import androidx.lifecycle.C2363bk;
import androidx.lifecycle.C2370br;
import androidx.lifecycle.C2371bs;
import androidx.lifecycle.C2380k;
import androidx.lifecycle.C2382m;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2389t;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.C2393x;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.p127a.C2320a;
import androidx.lifecycle.p127a.C2322c;
import androidx.p054b.p055a.p058c.C0895a;
import androidx.p116i.p117a.p118a.C2284e;
import androidx.p124l.p125a.C2305b;
import androidx.p124l.p125a.C2306c;
import androidx.p124l.p125a.C2309f;
import androidx.p124l.p125a.C2310g;
import androidx.savedstate.C4088d;
import androidx.savedstate.C4089e;
import androidx.savedstate.C4090f;
import androidx.savedstate.C4091g;
import androidx.savedstate.C4092h;
import com.google.android.googlequicksearchbox.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: android.support.v4.app.Fragment */
/* compiled from: PG */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, C2391v, C2371bs, C2380k, C4091g {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    C0160af mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    C2363bk mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    C0174at mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    C2393x mLifecycleRegistry;
    C2383n mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    C4090f mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    C0223co mViewLifecycleOwner;
    C2332ag mViewLifecycleOwnerLiveData;
    String mWho;

    /* renamed from: android.support.v4.app.Fragment$SavedState */
    /* compiled from: PG */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C0163ai();

        /* renamed from: a */
        final Bundle f618a;

        public SavedState(Bundle bundle) {
            this.f618a = bundle;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f618a = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f618a);
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new C0199br();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new C0261x(this);
        this.mMaxState = C2383n.RESUMED;
        this.mViewLifecycleOwnerLiveData = new C2332ag();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList();
        initLifecycle();
    }

    private C0160af ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C0160af();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        if (this.mMaxState == C2383n.INITIALIZED || this.mParentFragment == null) {
            return this.mMaxState.ordinal();
        }
        return Math.min(this.mMaxState.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new C2393x(this);
        this.mSavedStateRegistryController = C4089e.m11719a(this);
        this.mDefaultFactory = null;
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, (Bundle) null);
    }

    private C0816c prepareCallInternal(C0809b bVar, C0895a aVar, C0815b bVar2) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new C0158ad(this, aVar, atomicReference, bVar, bVar2));
            return new C0159ae(atomicReference);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void registerOnPreAttachListener(C0162ah ahVar) {
        if (this.mState >= 0) {
            ahVar.mo524a();
        } else {
            this.mOnPreAttachedListeners.add(ahVar);
        }
    }

    private void restoreViewState() {
        if (FragmentManager.m246Z(3)) {
            new StringBuilder("moveto RESTORE_VIEW_STATE: ").append(this);
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: ".concat(toString()));
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        C0160af afVar = this.mAnimationInfo;
        if (afVar != null) {
            afVar.f723u = false;
        }
        if (this.mView != null && (viewGroup = this.mContainer) != null && (fragmentManager = this.mFragmentManager) != null) {
            fragmentManager.mo466ag();
            C0239dd k = C0239dd.m562k(viewGroup);
            k.mo750i();
            if (z) {
                this.mHost.f743d.post(new C0263z(k));
            } else {
                k.mo748g();
            }
        }
    }

    public C0171aq createFragmentContainer() {
        return new C0155aa(this);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            ((C2310g) C2305b.m6238a(this)).f6463b.mo5685b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.mo436C(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.f634a.mo672d(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final C0167am getActivity() {
        C0174at atVar = this.mHost;
        if (atVar == null) {
            return null;
        }
        return (C0167am) atVar.f741b;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C0160af afVar = this.mAnimationInfo;
        if (afVar == null || (bool = afVar.f718p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C0160af afVar = this.mAnimationInfo;
        if (afVar == null || (bool = afVar.f717o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        C0174at atVar = this.mHost;
        if (atVar == null) {
            return null;
        }
        return atVar.f742c;
    }

    public /* synthetic */ C2322c getDefaultViewModelCreationExtras() {
        return C2320a.f6515a;
    }

    public C2363bk getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Context applicationContext = requireContext().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        application = null;
                        break;
                    } else if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    } else {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                }
                if (application == null && FragmentManager.m246Z(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.mDefaultFactory = new C2354bb(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public int getEnterAnim() {
        C0160af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return 0;
        }
        return afVar.f704b;
    }

    public Object getEnterTransition() {
        C0160af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return null;
        }
        return afVar.f711i;
    }

    public C1812bb getEnterTransitionCallback() {
        C0160af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return null;
        }
        return afVar.f719q;
    }

    public int getExitAnim() {
        C0160af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return 0;
        }
        return afVar.f705c;
    }

    public Object getExitTransition() {
        C0160af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return null;
        }
        return afVar.f713k;
    }

    public C1812bb getExitTransitionCallback() {
        C0160af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return null;
        }
        return afVar.f720r;
    }

    public View getFocusedView() {
        C0160af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return null;
        }
        return afVar.f722t;
    }

    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        C0174at atVar = this.mHost;
        if (atVar == null) {
            return null;
        }
        return atVar.mo533f();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater((Bundle) null) : layoutInflater;
    }

    public C2384o getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public C2305b getLoaderManager() {
        return C2305b.m6238a(this);
    }

    public int getNextTransition() {
        C0160af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return 0;
        }
        return afVar.f708f;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public boolean getPopDirection() {
        C0160af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return false;
        }
        return afVar.f703a;
    }

    public int getPopEnterAnim() {
        C0160af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return 0;
        }
        return afVar.f706d;
    }

    public int getPopExitAnim() {
        C0160af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return 0;
        }
        return afVar.f707e;
    }

    public float getPostOnViewCreatedAlpha() {
        C0160af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return 1.0f;
        }
        return afVar.f721s;
    }

    public Object getReenterTransition() {
        C0160af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return null;
        }
        Object obj = afVar.f714l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        C2284e.m6222c(this);
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        C0160af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return null;
        }
        Object obj = afVar.f712j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    public final C4088d getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f13082a;
    }

    public Object getSharedElementEnterTransition() {
        C0160af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return null;
        }
        return afVar.f715m;
    }

    public Object getSharedElementReturnTransition() {
        C0160af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return null;
        }
        Object obj = afVar.f716n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f709g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList getSharedElementSourceNames() {
        /*
            r1 = this;
            android.support.v4.app.af r0 = r1.mAnimationInfo
            if (r0 == 0) goto L_0x000a
            java.util.ArrayList r0 = r0.f709g
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p031v4.app.Fragment.getSharedElementSourceNames():java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f710h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList getSharedElementTargetNames() {
        /*
            r1 = this;
            android.support.v4.app.af r0 = r1.mAnimationInfo
            if (r0 == 0) goto L_0x000a
            java.util.ArrayList r0 = r0.f710h
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p031v4.app.Fragment.getSharedElementTargetNames():java.util.ArrayList");
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        C2284e.m6223d(this);
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public C2391v getViewLifecycleOwner() {
        C0223co coVar = this.mViewLifecycleOwner;
        if (coVar != null) {
            return coVar;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    public C2370br getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (getMinimumMaxLifecycleState() != C2383n.INITIALIZED.ordinal()) {
            C0202bu buVar = this.mFragmentManager.f623A;
            C2370br brVar = (C2370br) buVar.f776d.get(this.mWho);
            if (brVar != null) {
                return brVar;
            }
            C2370br brVar2 = new C2370br();
            buVar.f776d.put(this.mWho, brVar2);
            return brVar2;
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new C0199br();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r3.mParentFragment;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isHidden() {
        /*
            r3 = this;
            boolean r0 = r3.mHidden
            r1 = 1
            if (r0 != 0) goto L_0x0018
            android.support.v4.app.FragmentManager r0 = r3.mFragmentManager
            r2 = 0
            if (r0 == 0) goto L_0x0017
            android.support.v4.app.Fragment r0 = r3.mParentFragment
            if (r0 != 0) goto L_0x000f
            goto L_0x0016
        L_0x000f:
            boolean r0 = r0.isHidden()
            if (r0 == 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            return r2
        L_0x0017:
            r1 = 0
        L_0x0018:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p031v4.app.Fragment.isHidden():boolean");
    }

    /* access modifiers changed from: package-private */
    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (this.mMenuVisible) {
            return this.mFragmentManager == null || FragmentManager.m248aj(this.mParentFragment);
        }
        return false;
    }

    public boolean isPostponed() {
        C0160af afVar = this.mAnimationInfo;
        if (afVar == null) {
            return false;
        }
        return afVar.f723u;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.mo461ab();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.mView;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isVisible() {
        /*
            r1 = this;
            boolean r0 = r1.isAdded()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r1.isHidden()
            if (r0 != 0) goto L_0x0020
            android.view.View r0 = r1.mView
            if (r0 == 0) goto L_0x0020
            android.os.IBinder r0 = r0.getWindowToken()
            if (r0 == 0) goto L_0x0020
            android.view.View r0 = r1.mView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0020
            r0 = 1
            return r0
        L_0x0020:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p031v4.app.Fragment.isVisible():boolean");
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.noteStateNotSaved();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (FragmentManager.m246Z(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        C0174at atVar = this.mHost;
        Activity activity = atVar == null ? null : atVar.f741b;
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        FragmentManager fragmentManager = this.mChildFragmentManager;
        if (fragmentManager.f646m <= 0) {
            fragmentManager.mo485q();
        }
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        C0174at atVar = this.mHost;
        Activity activity = atVar == null ? null : atVar.f741b;
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            this.mChildFragmentManager.mo483o();
            return;
        }
        throw new C0240de("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public void performAttach() {
        ArrayList arrayList = this.mOnPreAttachedListeners;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0162ah) arrayList.get(i)).mo524a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.mo479l(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f742c);
        if (this.mCalled) {
            Iterator it = this.mFragmentManager.f645l.iterator();
            while (it.hasNext()) {
                ((C0203bv) it.next()).mo538j(this);
            }
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.f657x = false;
            fragmentManager.f658y = false;
            fragmentManager.f623A.f779g = false;
            fragmentManager.mo434A(0);
            return;
        }
        throw new C0240de("Fragment " + this + " did not call through to super.onAttach()");
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.mo484p(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.mo455V(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.mo5790b(new C2389t() {
            /* renamed from: eN */
            public final void mo416eN(C2391v vVar, C2382m mVar) {
                View view;
                if (mVar == C2382m.ON_STOP && (view = Fragment.this.mView) != null) {
                    view.cancelPendingInputEvents();
                }
            }
        });
        this.mSavedStateRegistryController.mo8589b(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.mo5793e(C2382m.ON_CREATE);
            return;
        }
        throw new C0240de("Fragment " + this + " did not call through to super.onCreate()");
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return z | this.mChildFragmentManager.mo456W(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C0223co(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.mo726a();
            this.mView.setTag(R.id.view_tree_lifecycle_owner, this.mViewLifecycleOwner);
            this.mView.setTag(R.id.view_tree_view_model_store_owner, this.mViewLifecycleOwner);
            C4092h.m11723a(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.mo5708l(this.mViewLifecycleOwner);
        } else if (this.mViewLifecycleOwner.f844a == null) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void performDestroy() {
        this.mChildFragmentManager.mo486r();
        this.mLifecycleRegistry.mo5793e(C2382m.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new C0240de("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.mo434A(1);
        if (this.mView != null) {
            C0223co coVar = this.mViewLifecycleOwner;
            coVar.mo726a();
            if (coVar.f844a.f6612c.mo5788a(C2383n.CREATED)) {
                C0223co coVar2 = this.mViewLifecycleOwner;
                coVar2.f844a.mo5793e(C2382m.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            C2309f fVar = ((C2310g) C2305b.m6238a(this)).f6463b;
            int d = fVar.f6460b.mo3725d();
            for (int i = 0; i < d; i++) {
                ((C2306c) fVar.f6460b.mo3727f(i)).mo5676b();
            }
            this.mPerformedCreateView = false;
            return;
        }
        throw new C0240de("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            FragmentManager fragmentManager = this.mChildFragmentManager;
            if (!fragmentManager.f659z) {
                fragmentManager.mo486r();
                this.mChildFragmentManager = new C0199br();
                return;
            }
            return;
        }
        throw new C0240de("Fragment " + this + " did not call through to super.onDetach()");
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.mo487s();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        this.mChildFragmentManager.mo488t(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (!this.mHasMenu || !this.mMenuVisible || !onOptionsItemSelected(menuItem)) {
            return this.mChildFragmentManager.mo457X(menuItem);
        }
        return true;
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.mo491v(menu);
        }
    }

    public void performPause() {
        this.mChildFragmentManager.mo434A(5);
        if (this.mView != null) {
            C0223co coVar = this.mViewLifecycleOwner;
            coVar.f844a.mo5793e(C2382m.ON_PAUSE);
        }
        this.mLifecycleRegistry.mo5793e(C2382m.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new C0240de("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        this.mChildFragmentManager.mo493x(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return z | this.mChildFragmentManager.mo458Y(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean aa = this.mFragmentManager.mo460aa(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != aa) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(aa);
            onPrimaryNavigationFragmentChanged(aa);
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.mo454U();
            fragmentManager.mo492w(fragmentManager.f650q);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mChildFragmentManager.mo470an(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            this.mLifecycleRegistry.mo5793e(C2382m.ON_RESUME);
            if (this.mView != null) {
                C0223co coVar = this.mViewLifecycleOwner;
                coVar.f844a.mo5793e(C2382m.ON_RESUME);
            }
            this.mChildFragmentManager.mo494y();
            return;
        }
        throw new C0240de("Fragment " + this + " did not call through to super.onResume()");
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.mo8590c(bundle);
        Parcelable c = this.mChildFragmentManager.mo472c();
        if (c != null) {
            bundle.putParcelable("android:support:fragments", c);
        }
    }

    public void performStart() {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mChildFragmentManager.mo470an(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            this.mLifecycleRegistry.mo5793e(C2382m.ON_START);
            if (this.mView != null) {
                C0223co coVar = this.mViewLifecycleOwner;
                coVar.f844a.mo5793e(C2382m.ON_START);
            }
            this.mChildFragmentManager.mo495z();
            return;
        }
        throw new C0240de("Fragment " + this + " did not call through to super.onStart()");
    }

    public void performStop() {
        this.mChildFragmentManager.mo435B();
        if (this.mView != null) {
            C0223co coVar = this.mViewLifecycleOwner;
            coVar.f844a.mo5793e(C2382m.ON_STOP);
        }
        this.mLifecycleRegistry.mo5793e(C2382m.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new C0240de("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.mo434A(2);
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f723u = true;
    }

    public final C0816c registerForActivityResult(C0809b bVar, C0815b bVar2) {
        return prepareCallInternal(bVar, new C0156ab(this), bVar2);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost != null) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.f654u != null) {
                parentFragmentManager.f655v.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i));
                parentFragmentManager.f654u.mo526b(strArr);
                return;
            }
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final C0167am requireActivity() {
        C0167am activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.mChildFragmentManager.mo446M(parcelable);
            this.mChildFragmentManager.mo485q();
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().f718p = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().f717o = Boolean.valueOf(z);
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo == null && i == 0) {
            i = 0;
            if (i2 == 0) {
                if (i3 != 0) {
                    i2 = 0;
                } else if (i4 != 0) {
                    i2 = 0;
                    i3 = 0;
                } else {
                    return;
                }
            }
        }
        ensureAnimationInfo().f704b = i;
        ensureAnimationInfo().f705c = i2;
        ensureAnimationInfo().f706d = i3;
        ensureAnimationInfo().f707e = i4;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public void setEnterSharedElementCallback(C1812bb bbVar) {
        ensureAnimationInfo().f719q = bbVar;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f711i = obj;
    }

    public void setExitSharedElementCallback(C1812bb bbVar) {
        ensureAnimationInfo().f720r = bbVar;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f713k = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().f722t = view;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.mo534g();
            }
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager == null) {
            Bundle bundle2 = null;
            if (!(savedState == null || (bundle = savedState.f618a) == null)) {
                bundle2 = bundle;
            }
            this.mSavedFragmentState = bundle2;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo534g();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            ensureAnimationInfo();
            this.mAnimationInfo.f708f = i;
        }
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo != null) {
            ensureAnimationInfo().f703a = z;
        }
    }

    public void setPostOnViewCreatedAlpha(float f) {
        ensureAnimationInfo().f721s = f;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f714l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        C2284e.m6225f(this);
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            fragmentManager.f623A.mo636a(this);
        } else {
            fragmentManager.f623A.mo640e(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f712j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f715m = obj;
    }

    public void setSharedElementNames(ArrayList arrayList, ArrayList arrayList2) {
        ensureAnimationInfo();
        C0160af afVar = this.mAnimationInfo;
        afVar.f709g = arrayList;
        afVar.f710h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f716n = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i) {
        if (fragment != null) {
            C2284e.m6226g(this, fragment, i);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager == null || fragmentManager2 == null || fragmentManager == fragmentManager2) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (!fragment2.equals(this)) {
                    fragment2 = fragment2.getTargetFragment(false);
                } else {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            if (fragment == null) {
                this.mTargetWho = null;
            } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = fragment;
                this.mTargetRequestCode = i;
                return;
            } else {
                this.mTargetWho = fragment.mWho;
            }
            this.mTarget = null;
            this.mTargetRequestCode = i;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        FragmentManager fragmentManager;
        C2284e.m6227h(this, z);
        if (!this.mUserVisibleHint && z && this.mState < 5 && (fragmentManager = this.mFragmentManager) != null && isAdded() && this.mIsCreated) {
            fragmentManager.mo441H(fragmentManager.mo478k(this));
        }
        this.mUserVisibleHint = z;
        boolean z2 = false;
        if (this.mState < 5 && !z) {
            z2 = true;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        C0174at atVar = this.mHost;
        if (atVar != null) {
            return atVar.mo536h(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, (Bundle) null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        IntentSender intentSender2 = intentSender;
        int i5 = i;
        Intent intent2 = intent;
        Bundle bundle2 = bundle;
        if (this.mHost != null) {
            if (FragmentManager.m246Z(2)) {
                Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle2);
            }
            FragmentManager parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.f653t != null) {
                if (bundle2 != null) {
                    if (intent2 == null) {
                        intent2 = new Intent();
                        intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                    }
                    if (FragmentManager.m246Z(2)) {
                        Log.v("FragmentManager", "ActivityOptions " + bundle2 + " were added to fillInIntent " + intent2 + " for fragment " + this);
                    }
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle2);
                }
                int i6 = i2;
                IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intentSender, intent2, i2, i3);
                parentFragmentManager.f655v.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i));
                if (FragmentManager.m246Z(2)) {
                    Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
                }
                parentFragmentManager.f653t.mo526b(intentSenderRequest);
                return;
            }
            int i7 = i2;
            int i8 = i3;
            C0174at atVar = parentFragmentManager.f647n;
            if (i5 == -1) {
                C1783a.m4904c(atVar.f741b, intentSender, -1, intent, i2, i3, i4, bundle);
                return;
            }
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && ensureAnimationInfo().f723u) {
            if (this.mHost == null) {
                ensureAnimationInfo().f723u = false;
            } else if (Looper.myLooper() != this.mHost.f743d.getLooper()) {
                this.mHost.f743d.postAtFrontOfQueue(new C0262y(this));
            } else {
                callStartTransitionListener(true);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
    }

    private Fragment getTargetFragment(boolean z) {
        String str;
        if (z) {
            C2284e.m6224e(this);
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.f634a.mo669a(str);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) C0173as.m390b(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (InstantiationException e) {
            throw new C0161ag("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new C0161ag("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new C0161ag("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new C0161ag("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        C0174at atVar = this.mHost;
        if (atVar != null) {
            LayoutInflater c = atVar.mo532c();
            c.setFactory2(this.mChildFragmentManager.f636c);
            return c;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        Handler handler;
        ensureAnimationInfo().f723u = true;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            handler = fragmentManager.f647n.f743d;
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final C0816c registerForActivityResult(C0809b bVar, ActivityResultRegistry activityResultRegistry, C0815b bVar2) {
        return prepareCallInternal(bVar, new C0157ac(activityResultRegistry), bVar2);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        C0174at atVar = this.mHost;
        if (atVar != null) {
            atVar.mo587k(intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (this.mHost != null) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.f652s != null) {
                parentFragmentManager.f655v.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i));
                if (!(intent == null || bundle == null)) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                parentFragmentManager.f652s.mo526b(intent);
                return;
            }
            parentFragmentManager.f647n.mo587k(intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* access modifiers changed from: package-private */
    public final void restoreViewState(Bundle bundle) {
        SparseArray sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            C0223co coVar = this.mViewLifecycleOwner;
            coVar.f845b.mo8589b(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new C0240de("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.mView != null) {
            C0223co coVar2 = this.mViewLifecycleOwner;
            coVar2.f844a.mo5793e(C2382m.ON_CREATE);
        }
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
